class ConcreteObject implements AbstractObject {

    @Override
    public void print() {
        System.out.println("I'm concrete object " + this);
    }
    
}