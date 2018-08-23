import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileExample2 {
	public static void main(String[] args){
		
		try {
		File f = new File("src/pigs.txt");
		File f1 = new File("src/pigs2.txt");
		FileReader reader = new FileReader(f);
		BufferedWriter write = new BufferedWriter(new FileWriter(f1));
		String output = "";
		BufferedReader buff = new BufferedReader(reader);
		String line;
		
		while((line = buff.readLine()) !=null) {
			output +=line + "\n";
		}
			//System.out.println(line);
			//write.write(line);
			//write.append('a');
		
		write.write(output);
		write.close();
		buff.close();
		}catch(Exception e) {
			System.out.println("catching exception");
		}
		//FileWriter x = new FileWriter(f);
	   //write.write("Write this");
		finally {
			System.out.println("finally ");
		
		}
		}
}