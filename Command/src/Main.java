public class Main {
    
    public static void main(String[] args) {
        
        Valkokangas valkokangas = new Valkokangas();
        
        // Annetaan command lambdana
        ValkokangasPainike ylos = new ValkokangasPainike(valkokangas, Valkokangas::ylos);
        ValkokangasPainike alas = new ValkokangasPainike(valkokangas, Valkokangas::alas);
        
        ylos.paina();
        alas.paina();
    }
}