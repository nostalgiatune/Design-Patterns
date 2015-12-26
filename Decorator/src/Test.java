/* Tuomas Toivonen
   24.9.2015
*/

public class Test {
    public static void main(String[] args) {
        
        /* Decoding test */
        FileReader fileReader = new FileLineReader();
        FileReader base64decoder = new Base64Decoder(fileReader);
        base64decoder.open("encoded.txt");
        
        FileWriter fileWriter = new FileLineWriter();
        fileWriter.open("decoded.txt");
        
        String line;
        while ((line = (String)base64decoder.read()) != null) {
            fileWriter.write(line);
        }
        
        fileWriter.close();
        base64decoder.close();
        
        /* Encoding test */
        fileReader.open("decoded.txt");
        FileWriter base64encoder = new Base64Encoder(fileWriter);
        base64encoder.open("encoded_again.txt");
        while ((line = (String)fileReader.read()) != null) {
            base64encoder.write(line);
        }
        
        fileReader.close();
        base64encoder.close();
    }
}