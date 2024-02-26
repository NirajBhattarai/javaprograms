class Animal {

  public final void test() {
    System.out.println("Parent Method Test");
  }

  public void test1() {
    System.out.println("Parent Method Test");
  }
}

class Person extends Animal {

  public void test1() {
    System.out.println("Child Method Test");
  }
}

public class FinalMethodExample {

  public static void main(String[] args) {
    Person p = new Person();
    p.test1();
  }
}
