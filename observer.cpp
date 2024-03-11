#include <iostream>
#include <vector>

// Observador abstracto
class Observer {
public:
    virtual void update(const std::string& message) = 0;
};

// Sujeto (Observable)
class Subject {
public:
    // Agregar observador al conjunto de observadores
    void addObserver(Observer* observer) {
        observers_.push_back(observer);
    }

    // Eliminar observador del conjunto de observadores
    void removeObserver(Observer* observer) {
        // Supongamos que observers_ es un vector de punteros a observadores
        observers_.erase(std::remove(observers_.begin(), observers_.end(), observer), observers_.end());
    }

    // Notificar a todos los observadores sobre un cambio
    void notifyObservers(const std::string& message) {
        for (Observer* observer : observers_) {
            observer->update(message);
        }
    }

    // Método para simular un cambio en el sujeto
    void doSomething() {
        // ... realizar alguna acción ...
        std::string message = "¡El sujeto ha cambiado!";
        notifyObservers(message);
    }

private:
    std::vector<Observer*> observers_;
};

// Observador concreto
class ConcreteObserver : public Observer {
public:
    // Método para manejar la actualización
    void update(const std::string& message) override {
        std::cout << "Observador ha recibido el mensaje: " << message << std::endl;
    }
};

int main() {
    // Crear el sujeto
    Subject subject;

    // Crear observadores
    ConcreteObserver observer1;
    ConcreteObserver observer2;

    // Agregar observadores al sujeto
    subject.addObserver(&observer1);
    subject.addObserver(&observer2);

    // Realizar alguna acción en el sujeto que notificará a los observadores
    subject.doSomething();

    // Eliminar un observador
    subject.removeObserver(&observer1);

    // Realizar otra acción para notificar solo al observador restante
    subject.doSomething();

    return 0;
}
