/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i  = 1;
        while (i < 100) {

            i = doFizzBuzz(i);
        }

//        for (int j = 1; j < 100; j++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = j % 3 == 0;
//            boolean divisibleBy5 = j % 5 == 0;
//
//            if (divisibleBy3 && divisibleBy5) {
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//                System.out.println("Buzz");
//
//            } else {
//                System.out.println(j);
//
//            }
//        }
    }

    public static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {
            System.out.println("Fizz");

        } else if (divisibleBy5) {
            System.out.println("Buzz");

        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
