
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


class FileLineWriter implements FileWriter {

    private BufferedWriter bw;
    
    @Override
    public boolean write(Object line) {
        if (!isOpen())
            return false;
        try {
            bw.write((String)line);
            bw.newLine();
            bw.flush();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FileLineWriter.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean open(String filename) {
        if (bw != null)
            try {
                bw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileLineReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw = new BufferedWriter(new java.io.FileWriter(filename));
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FileLineWriter.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void close() {
        if (bw != null)
            try {
                bw.close();
                bw = null;
        } catch (IOException ex) {
            Logger.getLogger(FileLineReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean isOpen() {
        return bw != null;
    }
}