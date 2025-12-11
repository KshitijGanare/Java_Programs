package Exception_Programs;

import java.io.IOException;

public class ThrowExample {
    public static void main(String[] args) throws IOException {
        throwExample01();

        // Thrown unchecked Exception
        throw new ArithmeticException("Hello World Exception thrown");

    }


    static void throwExample01() {

        try {

            throw new ArithmeticException("throw of try block");
        }
        catch (Exception e) {

            System.out.println(e);

        }
        finally {

            throw new ArithmeticException("throw of Finally block");

        }

    }

}

