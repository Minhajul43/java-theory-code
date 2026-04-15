public class Main {
  // Creating a constructor
  Main() {
    System.out.println("Hello, World!");
  }

  public static void main(String[] args) {
    System.out.println("The main() method.");

    // Creating a class's object
    // that will invoke the constructor
    Main obj1 = new Main();
  }
}

public class Main {
  int num1;
  int num2;

  public static void main(String[] args) {
    // We didn't created any structure
    // a default constructor will invoke here
    Main obj1 = new Main();

    // Printing the values
    System.out.println("num1 : " + obj1.num1);
    System.out.println("num2 : " + obj1.num2);
  }
}

 
public class Main {
int num1;
int num2;

  // Creating no-args constructor
  Main() {
    num1 = -1;
    num2 = -1;
  }

  public static void main(String[] args) {
    // no-args constructor will invoke
    Main obj1 = new Main();

    // Printing the values
    System.out.println("num1 : " + obj1.num1);
    System.out.println("num2 : " + obj1.num2);
  }
}

public class Main {
  int num1;
  int num2;

  // Creating parameterized constructor 
  Main(int a, int b) {
    num1 = a;
    num2 = b;
  }

  public static void main(String[] args) {
    // Creating two objects by passing the values 
    // to initialize the attributes.
    // parameterized constructor will invoke
    Main obj1 = new Main(10, 20);
    Main obj2 = new Main(100, 200);

    // Printing the objects values
    System.out.println("obj1");
    System.out.println("num1 : " + obj1.num1);
    System.out.println("num2 : " + obj1.num2);

    System.out.println("obj2");
    System.out.println("num1 : " + obj2.num1);
    System.out.println("num2 : " + obj2.num2);
  }
}
