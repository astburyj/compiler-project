import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	private final String VAR = "call";
	private final String IF = "when";
	private final String PRINT = "spitfire";
	private final String DONE = "micdrop";
	private final String LIST = "fam";
	private final String TRY = "tryna";
	private final String CATCH = "sus";
	private final String ARRAY = "squad";
	private final String FOR = "finna";
	private final String ELSE = "nah";
	private final String WHILE = "as long as";
	private final String EQUAL_TO = "is";
	private final String GREATER_THAN = "more than";
	private final String LESS_THAN = "less than";
	
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
		// Should be a "container" declared in here that will be the code tree
		// Will pass this container to lookerUpper and it will add Node objects to
		// parse will be called recursively from LookerUpper if an object like Loop or if come up
	    int character = -1;
	    boolean ignoreSpace = false;
	    String word = "";
		while((character = br.read()) != -1) {
			if(character == ' ' && !ignoreSpace) {
				// end line
				if(word.length() > 0) {
					System.out.println(word);
					lookerUpper(word);
					word = "";
				}
			} else if(character == ',' || character == '\n') {
				if(word.length() > 0) {
					System.out.println(word);
					lookerUpper(word);
					System.out.println("END OF STATEMENT: " + character);
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
	
	public boolean lookerUpper(String word) {
		if (word == VAR) {
			
		} else if (word == IF) {
			
		} else if (word == PRINT) {
			
		} else if (word == DONE) {
			
		} else if (word == LIST) {
			
		} else if (word == TRY) {
			
		} else if (word == CATCH) {
			
		} else if (word == ARRAY) {
			
		} else if (word == FOR) {
			
		} else if (word == ELSE) {
			
		} else if (word == WHILE) {
			
		} else if (word == EQUAL_TO) {
			
		} else if (word == GREATER_THAN) {
			
		} else if (word == LESS_THAN) {
			
		}
		
		return false;
	}
}