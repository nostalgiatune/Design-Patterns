
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLineReader implements FileReader {
    
    private BufferedReader br;

    @Override
    public Object read() {
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(FileLineReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return line;
    }

    @Override
    public boolean open(String filename) {
        if (br != null)
            try {
                br.close();
        } catch (IOException ex) {
            Logger.getLogger(FileLineReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            br = new BufferedReader(new java.io.FileReader(filename));
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileLineReader.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void close() {
        if (br != null)
            try {
                br.close();
                br = null;
        } catch (IOException ex) {
            Logger.getLogger(FileLineReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean isOpen() {
        return br != null;
    }
    
}