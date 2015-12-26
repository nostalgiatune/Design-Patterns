
import java.lang.reflect.Method;

class Test {
    public static void main(String[] args) throws Exception {
        
        Class<?> factoryClass = Class.forName("ConcreteFactory"); // Nimi kuuluisi lukea tiedostosta
        Method instantiateMethod = factoryClass.getDeclaredMethod("instantiate");
        
        AbstractFactory factory = (AbstractFactory) instantiateMethod.invoke(null);
        System.out.println("Factory singleton instance: " + factory);
        AbstractObject object = factory.create();
        object.print();
        factory = (AbstractFactory) instantiateMethod.invoke(null);
        System.out.println("Factory singleton instance: " + factory);
        object = factory.create();
        object.print();
    }
}