import java.util.Scanner;
public class Calculator{
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        float x;
        float y;
        String operator;
        System.out.println ("Hello! Please input a number");
        x = input.nextInt();
        System.out.println (" Please enter one of the following operators: + - / *");
        operator = input.next();
      
        System.out.println ("Please input a second number");
        y = input.nextInt ();
        
       switch (operator){
           case "+":
           System.out.println (add( x,y));
           break;
           
           case "-":
           System.out.println (sub(x,y));
           break;
           
           case "/":
           System.out.println (div(x,y));
           break;
           
           case "*":
           System.out.println (mult(x,y));
           break;
        }
    }
    public static float add (float x, float y) {
             float result = x + y;
             return result;
            }
    public static float sub (float x, float y) {
              float result = x-y;
              return result;
            }
    public static float mult (float x, float y) {
        float result = x*y;
        return result;
    }
    public static float div (float x, float y) {
        float result = x/y;
        return result;
    }
            
       
        
        
        
       
        
        
        
       
        
        
    }
