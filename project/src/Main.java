import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


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

	String [][] program;
	
	public void parse(BufferedReader br) throws IOException {
		// Should be a "container" declared in here that will be the code tree
		// Will pass this container to lookerUpper and it will add Node objects to
		// parse will be called recursively from LookerUpper if an object like Loop or if come up
	    int character = -1;
	    boolean ignoreSpace = false;
	    String word = "";
	    program = new String[50][];
	    int lineNumber = 0;
	    ArrayList<String> line = new ArrayList<String>();
		while((character = br.read()) != -1) {
			if(character == ' ' && !ignoreSpace) {
				// end line
				if(word.length() > 0) {
					System.out.println(word);
					lookerUpper(word);
					line.add(word);
					word = "";
				}
			} else if(character == ',' || character == '\n') {
				if(word.length() > 0) {
					System.out.println(word);
					lookerUpper(word);
					line.add(word);
					word = "";
				}
				line.add(",");
				program[lineNumber] = new String[line.size()];
				for(int i = 0; i < line.size(); i++) {
					program[lineNumber][i] = line.get(i);
				}
				lineNumber++;
				line = new ArrayList<String>();
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
		for(int i = 0; i < program.length; i++) {
			if(program[i]==null) {
				break;
			}
			System.out.println(translate(program[i]));
			for(int r = 0; r < program[i].length; r++) {
				System.out.print("["+program[i][r]+"] ");
				
			}
			System.out.print("\n");
		}
		System.out.println("END OF FILE");
	    br.close();
	}
	
	public String translate(String[] line) {
		String javaCode = "";
		if(line.length == 4) {
			if(line[0].equals("call") &&
				line[1] != null &&
				line[2] != null &&
				line[3].equals(",")) {
				// this is a valid tahm variable init
				// ex: call "sup world" myMixTape
				// if the variable is already in the hash then update it
				
				String type = "String";
				// figure out the type of the variable, defaulting to string
				if(line[1].contains("\"")) {
					// is a string
				} else {
					// check if it is a number
					if(isANumber(line[1])) {
						// is a int or long
						type = "long";
					} else if(isADecimal(line[1])) {
						// is a double or float
						type = "double";
					}
				}
				javaCode = type+" "+line[2]+" = "+line[1]+";";
			}
		}
		return javaCode;
	}
	
	private boolean isANumber(String item) {
		for(int i = 0; i < item.length(); i++) {
			char c = item.charAt(i);
			if(c > 57 || c < 48) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isADecimal(String item) {
		for(int i = 0; i < item.length(); i++) {
			char c = item.charAt(i);
			if((c > 57 || c < 48) && c != '.') {
				return false;
			}
		}
		return true;
	}
	
	public boolean lookerUpper(String word) {
		if (word == VAR) {
			// the next word is the value and the word after that is the variable name and we should expect a comma after that
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