// Abstract

/**
 * class
 * method
 *
 *
 *
 */

interface x {
  void print();
}

interface servlet {
  void init();
  void config();
  void service();
}

abstract class IntermediateServlet implements servlet {

  public void init() {}

  abstract void service();

  public void config() {}
}

abstract class LogoutServlet extends IntermediateServlet {}

abstract class DashboardServlet extends IntermediateServlet {}

class LoginServlet extends IntermediateServlet {

  public void service() {}
}

public class Program {

  public static void main(String[] args) {
    System.out.println("hello");
  }
}
