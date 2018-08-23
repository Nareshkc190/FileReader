import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
//import java.util.Scanner;



/*%s  string 
%d integer
%f decimal float or double
%n newline
String.format()
printf
*/
public class FileExample {
	
	public static void main(String[] args) throws IOException { // can use throws instead of try catch. it  will terminate the program
		File f = new File("\\Users\\U81237\\Desktop\\a.pdf");
	//	try {
		//FileReader is useful when u have to read the file character by character
		FileReader reader = new FileReader(f);
		int read;
		int counter=0;
		int countLine=0;
		
		

	//	}catch(Exception e) {}
  // returns -1 when its done reading all the line
		while((read = reader.read()) != -1) {
		//	System.out.print((char) read);
//			if(read =='h')
//				counter++;
			
		//System.out.println("the character h has occurred "+counter);
		BufferedReader buff = new BufferedReader(reader);
		String line;
		while((line = buff.readLine()) !=null) {
			System.out.println(line);
			countLine++;
			
		}}
	//	System.out.println(countLine);
		reader.close();
		
		//Reading a file using a scanner
//		Scanner scan = new Scanner(f);
//		while(scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}
//		
//		scan.close();	
		System.out.printf("%s %s %n %s", 2, "so" , " j", "s   ");
		System.out.println("fsd");
		System.out.println(String.format("%s", "sd"));

	}

}
