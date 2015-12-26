class ConcreteFactory implements AbstractFactory {
    
    private static AbstractFactory instance = null;
    
    // SINGLETON - Can be instantiated only form instantiate method
    private ConcreteFactory() {}
    
    public static AbstractFactory instantiate() {
        synchronized(ConcreteFactory.class) {
            if (instance == null)
                instance = new ConcreteFactory();
            return instance;
        }
    }

    @Override
    public AbstractObject create() {
        return new ConcreteObject();
    }
    
}