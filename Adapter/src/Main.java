public class Main {
    
    public static void main(String[] args) {
        
        DeprecatedClass deprecated = new DeprecatedClass("deprecated");
        // printName(deprecated); deprecated has wrong interface
        
        DeprecatedClassAdapter adapter = new DeprecatedClassAdapter("provided by GetNameInterface");
        printName(adapter); // Adapter is DeprecatedClass and implements GetNameInterface
    }
    
    public static void printName(GetNameInterface getNameObject) {
        System.out.println(getNameObject.getName());
    }
}