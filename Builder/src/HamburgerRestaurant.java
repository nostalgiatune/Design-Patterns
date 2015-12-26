
import com.tuoppi.builder.hamburger.Hamburger;

public class HamburgerRestaurant {
    
    private HamburgerBuilder hamburgerBuilder;

    public HamburgerRestaurant() {
    }

    public void setHamburgerBuilder(HamburgerBuilder hamburgerBuilder) {
        this.hamburgerBuilder = hamburgerBuilder;
    }
    
    public Hamburger getHamburger() {
        
        hamburgerBuilder.buildBeef();
        hamburgerBuilder.buildBun();
        hamburgerBuilder.buildCheese();
        hamburgerBuilder.buildSalad();
        
        return hamburgerBuilder.getBurger();
    }
}