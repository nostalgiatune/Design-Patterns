
import java.util.Base64;


public class Base64Encoder extends FileWriterDecorator {
    
    public Base64Encoder(FileWriter fileWriter) {
        super(fileWriter);
    }
    
    @Override
    public boolean write(Object line) {
        String encoded = encode((String) line);
        return super.write(encoded);
    }
    
    private String encode(String line) {
        byte[] encoded = Base64.getEncoder().encode(line.getBytes());
        line = new String(encoded);
        return line;
    }
}