//on System B 
class ProxyImage implements Image {

    private RealImage image = null;
    private String filename = null;
    /**
     * Constructor
     * @param filename 
     */
    public ProxyImage(final String filename) { 
        this.filename = filename; 
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }

    @Override
    public void showData() {
        System.out.println("Kuvan nimi: " + filename); 
    }

}
 