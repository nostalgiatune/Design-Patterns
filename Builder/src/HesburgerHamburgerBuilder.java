
import com.tuoppi.builder.hamburger.Beef;
import com.tuoppi.builder.hamburger.Bun;
import com.tuoppi.builder.hamburger.Cheese;
import com.tuoppi.builder.hamburger.Hamburger;
import com.tuoppi.builder.hamburger.Salad;

public class HesburgerHamburgerBuilder implements HamburgerBuilder {

    Hamburger hamburger = new Hamburger();

    @Override
    public void buildBun() {
        hamburger.setBun(new Bun("Hesburger's bun"));
    }

    @Override
    public void buildCheese() {
        hamburger.setCheese(new Cheese("Hesburger's cheese"));
    }

    @Override
    public void buildSalad() {
        hamburger.setSalad(new Salad("Hesburger's salad"));
    }

    @Override
    public void buildBeef() {
        hamburger.setBeef(new Beef("Hesburger's beef"));
    }

    @Override
    public Hamburger getBurger() {
        return hamburger;
    }
    
}