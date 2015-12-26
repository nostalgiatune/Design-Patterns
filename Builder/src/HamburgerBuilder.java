
import com.tuoppi.builder.hamburger.Hamburger;


public interface HamburgerBuilder {
    
    void buildBun();
    void buildCheese();
    void buildSalad();
    void buildBeef();
    Hamburger getBurger();
}
