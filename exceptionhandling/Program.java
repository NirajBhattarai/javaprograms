import java.io.*;

class Address {
  public String streetName;
}

class Student {
  public String name;
  Address address; // if we don't create any object by default instance object will be assigned null
  //and if we use this variable it will throw NullPointerException
}

public class Program {

  public static void main(String[] args) {
    // System.out.println(0 / 10);

    // Student st = new Student();
    // // st.name = "niraj";
    // System.out.println(st.name);
    // st.address.streetName = "Campus Road";
    // System.out.println(st.address.streetName);
    // try {
    //   System.out.println("Console before division");

    //   System.out.println(10 / 0);
    //   System.out.println("Console after division");
    // } catch (NullPointerException e) {
    //   System.out.println("inside Exception block");
    // }

    // System.out.println("AFter Catch Block");

    /**
     *
     * ArrayIndexOutOfBoundException
     *
     */

    // int[] data = new int[6];

    // for (int i = 0; i <= data.length; i++) {
    //   data[i] = 1;
    // }

    /**
     * Checked Exception- Checked on Compile Time
     *
     *
     */

    try {
      FileReader file = new FileReader("idpo /outputs.txt");

      // Creates a BufferedWriter
      BufferedReader output = new BufferedReader(file);
      // Writes the string to the file
      // output.write(data);

      // Closes the writer
      //   output.close();
    } catch (Exception e) {
      e.printStackTrace();
      //   System.out.println(e.getMessage());
    }
  }
}
/**
 * try catch
 *
 *
 *
 *
 *
 * finallly
 *
 *
 *
 */
