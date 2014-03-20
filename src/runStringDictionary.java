import java.io.BufferedReader;
import java.io.FileReader;


public class runStringDictionary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length == 0 || args.length > 1) {
			System.out.println("Syntax to run the program: java runStringDictionary <inputFile>");
		}
		if (args.length == 1) {
			try{
				
				Dictionary myDictionary = new Dictionary(); //Initialize a Dictionary to store input words
				BufferedReader br = new BufferedReader(new FileReader(args[0])); //Read the text file input
				String line;
				
				while ((line = br.readLine()) != null) {//Read each line
					String[] strArray = line.split(" "); //Separate each word in the line and store in another Array
					for (int i=0; i<strArray.length; i++){ //Loop over the Array
						if (myDictionary.contains(strArray[i])){ //Check if word exists in the dictionary
							myDictionary.remove(strArray[i]); //if it does remove it
						}
						else{
							myDictionary.add(strArray[i]); //if it doesn't then add it
						}
					}
				}//while loop ends
				
				//print the contents of myDictionary
				for (int i = 0; i<25;i++){
					if(myDictionary.table[i] != null){
						System.out.println(myDictionary.table[i]);
					}
						
				}
				
			}
			catch(Exception e) {
				System.out.println("Error found : " + e);
			}
		}
	}
}
