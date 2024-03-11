#include <iostream>
#include <string>
#include <vector>

// Memento: Almacena el estado interno del objeto
class Memento {
public:
    Memento(const std::string& state) : state_(state) {}

    std::string getState() const {
        return state_;
    }

private:
    std::string state_;
};

// Originador: Objeto cuyo estado queremos guardar y restaurar
class Originator {
public:
    void setState(const std::string& state) {
        state_ = state;
        std::cout << "Estado actual: " << state_ << std::endl;
    }

    Memento createMemento() {
        return Memento(state_);
    }

    void restoreMemento(const Memento& memento) {
        state_ = memento.getState();
        std::cout << "Estado restaurado: " << state_ << std::endl;
    }

private:
    std::string state_;
};

// Caretaker: Gestiona y almacena los estados guardados
class Caretaker {
public:
    void addMemento(const Memento& memento) {
        mementos_.push_back(memento);
    }

    Memento getMemento(int index) const {
        return mementos_[index];
    }

private:
    std::vector<Memento> mementos_;
};

int main() {
    // Crear el originador
    Originator originator;

    // Crear el cuidador
    Caretaker caretaker;

    // Establecer y guardar estados
    originator.setState("Estado 1");
    caretaker.addMemento(originator.createMemento());

    originator.setState("Estado 2");
    caretaker.addMemento(originator.createMemento());

    // Restaurar a un estado anterior
    originator.restoreMemento(caretaker.getMemento(0));

    return 0;
}
