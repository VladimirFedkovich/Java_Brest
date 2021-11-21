package task2;

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        double n = input.nextDouble();
        int i = 2;
        ArrayList<Integer> factors = new ArrayList<>();

        while (n != 1 && n != -1) {
            if (n == 0 || n % 1 != 0){
                System.out.println("Enter an integer");
                n = input.nextDouble();
            } else if (n % i == 0) {
                factors.add(i);
                n = n / i;
            } else {
                i++;
            }
        }

        if (n < 0) {
            factors.set(0, -(factors.get(0)));
        }

        i = 0;
        System.out.print("The result of calculating prime factors: ");
        for (Integer factor : factors) {
            System.out.print(factor);
            if (i < factors.size() - 1) {
                System.out.print("*");
                i++;
            }
        }

    }
}





