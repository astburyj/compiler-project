import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		if (args.length > 0) {
			new Main(args[0]);
		} else {
			System.out.println("No filename given");
		}
        
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
	    int character = -1;
	    boolean ignoreSpace = false;
	    String word = "";
		while((character = br.read()) != -1) {
			if(character == ' ' && !ignoreSpace) {
				// end line
				if(word.length() > 0) {
					System.out.println(word);
					word = "";
				}
			} else if(character == ',' || character == '\n') {
				if(word.length() > 0) {
					System.out.println(word);
					System.out.println("END OF STATEMENT: "+character);
					word = "";
				}
			} else {
				if(character == '"') {
					if(ignoreSpace) {
						ignoreSpace = false;
					} else {
						ignoreSpace = true;
					}
				}
				word+=(char)character;
			}
	    }
		System.out.println("END OF FILE");
	    br.close();
	}
}



