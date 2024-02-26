// interface  blue print of class

// class blueprint of object

// object instance of class
/**
 * syntax
 *
 * inteface intefaceName{
 *
 * methods
 * }
 *
 *
 */

/**
 *
 * interface IAnimal
 * {
 *
 * public abstract void speak();
 *
 * public abstract void walk();
 *
 * }
 *
 */

// rule
/**
 * mysql
 * postgres
 * mariadb
 * dynamodb
 * mongodb
 * oracle
 * sybase
 * redis
 *
 *
 *
 *
 *
 */

interface IAnimal {
  void speak();
  void walk();
}

class Cat implements IAnimal {

  public void walk() {
    System.out.println("cat walks with four leg");
  }

  public void speak() {
    System.out.println("Meow");
  }
}

class Human implements IAnimal {

  public void walk() {
    System.out.println("human walks with 2 leg");
  }

  public void speak() {
    System.out.println("Human makes unnecesary noise");
  }
}

public class InterfaceExample {

  public static void main(String[] args) {
    // De coupling of component
    IAnimal c = new Cat();
    c.speak();
    c.walk();

    IAnimal h = new Human();
    h.speak();
    h.walk();
  }
}
