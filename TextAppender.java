package appendText;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextAppender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter writer = new FileWriter("test.txt", true);
			BufferedWriter bWriter = new BufferedWriter(writer);
			PrintWriter out = new PrintWriter(bWriter)){
			
			out.println("the text");
			out.println("additional text");
		}
		catch (IOException e) {
			System.err.println("IOException " + e.getMessage());
		}

	}
}
