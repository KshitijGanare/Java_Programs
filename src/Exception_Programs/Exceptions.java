package Exception_Programs;


// Step 1: Create the custom exception
class TooSmallNumberException extends Exception { // step 1: Create class and extend it with Exception
    public TooSmallNumberException(String message) { //step 2: Call a constructor
        super(message); //calls parent class constructor
    }
}



public class Exceptions {
    public static void main(String[] args){

        int number = 10;

        try {
            if (number < 15) {
                throw new TooSmallNumberException("Number too small");
            }
        } catch (TooSmallNumberException e) {
            System.out.println("Custom Exception: "+ e.getMessage());
        }

//        try {
//            int div = 10 / 0;
//            System.out.println(div);
//        } catch (ArithmeticException e) {
//          System.out.println(e.getMessage());
//          System.out.println(e);
//          e.printStackTrace();
//        }
    }
}






/*
- We can use Throwable(dadaji), Exception(baap), ArithmeticException(preferred) to catch exception
- By printing only e (exception object) "java.lang.ArithmeticException: / by zero"
- Printing e.getMessage() prints only message,
- e.printStackTrace():  Prints complete stack trace(shows at which line exception occurred).

- Koi aur message bhi print kar sakte zaruri nahi ki sirf e kohi print kare


 */
