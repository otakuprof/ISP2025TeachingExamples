package Example43;

import java.math.BigDecimal;

public class TestBigDecimal {

    public static void main(String[] args) {

        // TODO Write a try/catch block to handle the various exceptions 

    }
    // unchecked exceptions --> Java doesn't force you to declare and handle
    public static String divide (String s1, String s2) {
        // THIS METHOD COULD THROW ILLEGALARGUMENTEXCEPTION and NUMBERFORMATEXCEPTION

        /** The constructors throw a NumberFormatException if the string is not a valid number */
        BigDecimal b1 = new BigDecimal(s1);
        BigDecimal b2 = new BigDecimal(s2);

        /** using the deprecated overloaded version of divide()
         * public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode);
         * It throws NumberFormatException if the Rounding Mode is not a valid number
         */
        BigDecimal b3 = b1.divide(b2,3, 20);
        return b3.toString();
    }

}

