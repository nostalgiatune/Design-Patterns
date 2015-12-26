
public class FileWriterDecorator implements FileWriter {
    
    protected FileWriter fileWriter;
    
    public FileWriterDecorator(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public boolean write(Object line) {
        return fileWriter.write(line);
    }

    @Override
    public boolean open(String filename) {
        return fileWriter.open(filename);
    }

    @Override
    public void close() {
        fileWriter.close();
    }

    @Override
    public boolean isOpen() {
        return fileWriter.isOpen();
    }   
}