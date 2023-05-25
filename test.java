import java.io.IOException;
import java.util.Scanner;

interface IntOperations {
    boolean isPositive();
    boolean isNegative();
    boolean isEven();
    boolean isOdd();
    boolean isPrime();
    int factorial();
    int sumOfDigits();
}

class MyNumber implements IntOperations {
    private int num;

    MyNumber() {
        num = 0;
    }

    MyNumber(int num) {
        this.num = num;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isPrime() {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public int sumOfDigits() {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}

public class test {
    public static void main(String[] args)throws IOException {
        int value = Integer.parseInt(args[0]);
        MyNumber num = new MyNumber(value);
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice != 7) {
            System.out.println("1. Check if number is positive");
            System.out.println("2. Check if number is negative");
            System.out.println("3. Check if number is even");
            System.out.println("4. Check if number is odd");
            System.out.println("5. Check if number is prime");
            System.out.println("6. Find factorial of number");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (num.isPositive()) {
                        System.out.println("Number is positive");
                    } else {
                        System.out.println("Number is not positive");
                    }
                    break;

                case 2:
                    if (num.isNegative()) {
                        System.out.println("Number is negative");
                    } else {
                        System.out.println("Number is not negative");
                    }
                    break;

                case 3:
                    if (num.isEven()) {
                        System.out.println("Number is even");
                    } else {
                        System.out.println("Number is not even");
                    }
                    break;

                case 4:
                    if (num.isOdd()) {
                        System.out.println("Number is odd");
                    } else {
                        System.out.println("Number is not odd");
                    }
                    break;

                case 5:
                    if (num.isPrime()) {
                        System.out.println("Number is prime");
                    } else {
                        System.out.println("Number is not prime");
                    }
                    break;

                case 6:
                    System.out.println("Factorial of " + num + " is " + num.factorial());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        sc.close();
    }
}