public class ValkokangasPainike {
    
    Valkokangas valkokangas;
    ValkokangasCommand command;

    public ValkokangasPainike(Valkokangas valkokangas, ValkokangasCommand command) {
        this.valkokangas = valkokangas;
        this.command = command;
    }
    
    public void paina() {
        command.execute(valkokangas);
    }
}