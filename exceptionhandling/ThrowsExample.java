import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class ThrowsExample {

  public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("outputs.txt"); // checked exception

        // Creates a BufferedWriter
        BufferedReader output = new BufferedReader(file);
        // Writes the string to the file
        // output.write(data);

   
     
      // Closes the writer
      //   output.close();
    
  }
}
