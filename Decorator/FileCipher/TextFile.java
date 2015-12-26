import java.io.*;

class TextFile implements File {

	FileReader fileReader;

	boolean open(String name) {
		fileReader = new FileReader(name);
	}

	void writeLine(String line) {
	}

	String readLine() {
	}
}
