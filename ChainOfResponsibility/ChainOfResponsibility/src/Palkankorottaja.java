
public abstract class Palkankorottaja {
    
    protected Palkankorottaja successor;
    
    public void setSuccessor(Palkankorottaja successor) {
        this.successor = successor;
    }
    
    public abstract boolean korotaPalkkaa(double korotus);
}
