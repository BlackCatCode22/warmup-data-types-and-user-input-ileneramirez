   //use the Scanner class
   import java.util.Scanner;

    public class anything {
        public static void main(String[] args) {
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int largestNum = 0;





            System.out.println("\n\n Welcome to the largest numbers programs! \n\n");

            Scanner scanner = new Scanner(System.in);

            /// Prompt the user for the first number.
            System.out.println("\n Please enter the first number: ");
            num1 = scanner.nextInt();
            System.out.println("\n you entered: " + num1);

            System.out.println("\n Please enter the second number: ");
            num2 = scanner.nextInt();
            System.out.println("\n you entered: " + num2);

            System.out.println("\n Please enter the third number: ");
            num3 = scanner.nextInt();
            System.out.println("\n you entered: " + num3);


        }
    }