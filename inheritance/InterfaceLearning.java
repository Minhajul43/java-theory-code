// the class must implement all method of A and B.
class InterfaceLearning implements B 
{
    public void method1() {
        System.out.println("Method 1");
    }
  
    public void method2() {
        System.out.println("Method 2");
    }
  
    public void method3() {
        System.out.println("Method 3");
    }
  
   public static void main(String[] args){
       
       // Instance of GFG class created
       InterfaceLearning x = new InterfaceLearning();
       
       // All Methods Called
       x.method1();
       x.method2();
       x.method3();
    }
}