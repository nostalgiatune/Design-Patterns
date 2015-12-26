
import java.util.Arrays;
import java.util.List;

class ProxyExample {

   /**
    * Test method
    */
   public static void main(String[] args) {
        
        final List<Image> valokuvat = Arrays.asList(
                new ProxyImage("tupu.jpg"),
                new ProxyImage("hupu.jpg"),
                new ProxyImage("lupu.jpg")
        );
        
        valokuvat.forEach(Image::showData);
        valokuvat.forEach(Image::displayImage);
    }

}
