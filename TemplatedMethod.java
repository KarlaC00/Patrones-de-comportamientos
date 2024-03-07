public class TemplatedMethod{
 
    public static void main(String args[]) {
        System.out.println("Preparar té usando el patrón del método de plantilla");
        CaffeineBeverageTemplate template = new Tea();
        template.prepareRecipe();
 
        System.out.println("Hacer café usando el método de plantilla");
        template = new Coffie();
        template.prepareRecipe();
    }
 
}

abstract class CaffeineBeverageTemplate {
 
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (isCondimentRequested()) {
            addCondiments();
        }
    }
 
    public void boilWater() {
        System.out.println("Agua hirviendo");
    }
 
    public abstract void brew();
 
    public void pourInCup() {
        System.out.println("Verter la taza");
    }
 
    public abstract boolean isCondimentRequested();
 
    public abstract void addCondiments();
}
 
class Tea extends CaffeineBeverageTemplate {
 
    @Override
    public void brew() {
        System.out.println("Preparar hojas de té");
    }
 
    @Override
    public boolean isCondimentRequested() {
        return false;
    }
 
    @Override
    public void addCondiments() {
    }
 
}
 
class Coffie extends CaffeineBeverageTemplate {
 
    @Override
    public void brew() {
        System.out.println("Preparar granos de café");
 
    }
 
    @Override
    public boolean isCondimentRequested() {
        return true;
    }
 
    @Override
    public void addCondiments() {
        System.out.println("Agregando un poco de crema");
    }
 
}