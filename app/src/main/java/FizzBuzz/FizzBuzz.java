package FizzBuzz;

public class FizzBuzz {
    public static String toString(int n){
        String out = "";
        if(n%3 == 0){
            out= out+"Fizz";
        }
        if(n%5 == 0){
            out= out+"Buzz";
        }
        if(n%7 == 0){
            out= out+"Bang";
        }
        
        if(out==""){
            out = Integer.toString(n);
        }
        return out;
    }
}
