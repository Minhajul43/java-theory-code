// Cal class implementing Add and Sub 
class Cal implements Add , Sub
{
   // Method to add two numbers
   public int add(int a,int b){
       return a+b;
    }
  
   // Method to sub two numbers
   public int sub(int a,int b){
     return a-b;
    }
}

