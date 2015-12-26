
import java.util.Base64;


class Base64Decoder extends FileReaderDecorator {
    
    public Base64Decoder(FileReader fileReader) {
        super(fileReader);
    }
    
    @Override
    public Object read() {
        String line = (String) super.read();
        if (line == null)
            return null;
        
        line = decode(line);
        return line;
    }
    
    private String decode(String line) {
        byte[] decoded = Base64.getDecoder().decode(line);
        line = new String(decoded);
        return line;
    }
}