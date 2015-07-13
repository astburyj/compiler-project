import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
        new Main(args[0]);
	}
	
	public Main(String fileName) {
		try {
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            parse(bufferedReader);
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
	}

	public void parse(BufferedReader br) throws IOException {
	    String line = null;
		while((line = br.readLine()) != null) {
	        System.out.println(line);
	    }
	    br.close();
	}
}



