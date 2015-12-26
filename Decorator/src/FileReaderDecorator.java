
public abstract class FileReaderDecorator implements FileReader {
    
    protected FileReader fileReader;
    
    public FileReaderDecorator(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    @Override
    public Object read() {
        return fileReader.read();
    }

    @Override
    public boolean open(String filename) {
        return fileReader.open(filename);
    }

    @Override
    public void close() {
        fileReader.close();
    }

    @Override
    public boolean isOpen() {
        return fileReader.isOpen();
    }   
}