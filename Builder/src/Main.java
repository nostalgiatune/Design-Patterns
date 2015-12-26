
import com.tuoppi.builder.hamburger.Hamburger;

public class Main {
    
    public static void main(String[] args) {
        
        HamburgerRestaurant mcdonalds = new HamburgerRestaurant();
        mcdonalds.setHamburgerBuilder(new McDonaldsHamburgerBuilder());
        
        HamburgerRestaurant hesburger = new HamburgerRestaurant();
        hesburger.setHamburgerBuilder(new HesburgerHamburgerBuilder());
        
        Hamburger mcBurger = mcdonalds.getHamburger();
        Hamburger hesBurger = hesburger.getHamburger();
        
        System.out.println(mcBurger);
        System.out.println(hesBurger);
    }
}