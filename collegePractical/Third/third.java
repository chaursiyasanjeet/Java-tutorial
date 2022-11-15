public class third {
    public static void main(String[] args) {
        System.out.println("BITWISE OPERATORS");
        // Bitwise operators

        /*
         * 1. Bitwise AND (&)->
         * It is a binary operator denoted by the symbol &.
         * It returns 1 if and only if both bits are 1, else returns 0
         */

        int x = 9, y = 8;
        // bitwise and
        // 1001 & 1000 = 1000 = 8
        System.out.println("1.Bitwise AND(&):-");
        System.out.println(" x & y = " + (x & y));

        /*
         * 2. Bitwise XOR (^)->
         * It is a binary operator denoted by the symbol ^ .
         * It returns 0 if both bits are the same, else returns 1.
         */

        // bitwise XOR
        // 1001 ^ 1000 = 0001 = 1
        System.out.println("2.Bitwise XOR(^):-");
        System.out.println(" x ^ y = " + (x ^ y));

        /*
         * 3.Bitwise inclusive OR (|)
         * It is a binary operator denoted by the symbol | .
         * It returns 1 if either of the bit is 1, else returns 0.
         */
        // bitwise inclusive OR
        // 1001 | 1000 = 1001 = 9
        System.out.println("3.Bitwise OR(|)");
        System.out.println(" x | y = " + (x | y));

        /*
         * 4.Bitwise Complement (~)
         * It is a unary operator denoted by the symbol ~ .
         * It returns the inverse or complement of the bit.
         * It makes every 0 a 1 and every 1 a 0.
         */
        int z = 0;
        // bitwise compliment
        // ~0010= 1101 = -3
        System.out.println("4.Bitwise Compliment(~)");
        System.out.println(" ~z = " + (~z));

        System.out.println();
        System.out.println("Shift operators");
        System.out.println("1.Left shift");
        x = 5;
        // shifting the value by 4 using left shift operator
        y = x << 4;
        // printing the left shifted value
        System.out.println(" The left shifted value is: " + y);

        System.out.println("2.Right shift");
        x = 80;
        // shifting the value by 4 using left shift operator
        y = x >> 4;
        // printing the left shifted value
        System.out.print(" The right shifted value is : " + y);
    }
}
