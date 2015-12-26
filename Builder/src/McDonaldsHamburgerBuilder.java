
import com.tuoppi.builder.hamburger.Beef;
import com.tuoppi.builder.hamburger.Bun;
import com.tuoppi.builder.hamburger.Cheese;
import com.tuoppi.builder.hamburger.Hamburger;
import com.tuoppi.builder.hamburger.Salad;

public class McDonaldsHamburgerBuilder implements HamburgerBuilder {
    
    Hamburger hamburger = new Hamburger();

    @Override
    public void buildBun() {
        hamburger.setBun(new Bun("McDonald's bun"));
    }

    @Override
    public void buildCheese() {
        hamburger.setCheese(new Cheese("McDonald's cheese"));
    }

    @Override
    public void buildSalad() {
        hamburger.setSalad(new Salad("McDonald's salad"));
    }

    @Override
    public void buildBeef() {
        hamburger.setBeef(new Beef("McDonald's beef"));
    }

    @Override
    public Hamburger getBurger() {
        return hamburger;
    }
    
}