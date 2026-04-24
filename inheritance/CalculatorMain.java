import java.io.*;
class CalculatorMain{
    // Main Method
    public static void main (String[] args){
        
       // instance of Cal class
       Cal x = new Cal();
       System.out.println("Addition : " + x.add(2,1));
       System.out.println("Substraction : " + x.sub(2,1));
    }
}