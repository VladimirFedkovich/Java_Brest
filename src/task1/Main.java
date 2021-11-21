package task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = input.nextLine();
        int sum = 0, i = 0, y = 0;

        while (i < s.length()) {
            if ((int) s.charAt(i) == y + 48){
                sum += y;
                i++;
                y = 0;
            } else if(y < 10) {
                y++;
            } else {
                i++;
                y = 0;
            }
        }
            System.out.println("Sum of digits = " + sum);
    }
}
