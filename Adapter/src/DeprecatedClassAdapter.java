public class DeprecatedClassAdapter extends DeprecatedClass implements
        GetNameInterface {

    public DeprecatedClassAdapter(String nimi) {
        super(nimi);
    }

    @Override
    public String getName() {
        return nimi;
    }
    
}