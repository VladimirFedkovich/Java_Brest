package task3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();
        int i, j, x = 0, y, z = 0;
        String[] words = str.split(" ");
        String[] s = {"а","о","и","е","ё","э","ы","у","ю","я"};
        int[]index = new int[words.length];

        for(String subStr:words) {
            String[] letters = subStr.split("");
            i = 0;
            j = 0;
            y = 0;
            index[x] = 0;
            while (i < letters.length){
                while (j < s.length && i < letters.length){
                    if (letters[i].equalsIgnoreCase(s[j])){
                        index[x]++;
                        if (index[x] == 1){
                            letters[i] = letters[i].toUpperCase();
                        }
                        i++;
                    } else {
                        j++;
                    }
                    if(j == s.length){
                        i++;
                        j = 0;
                    }
                }
                if (i == letters.length){
                    x++;
                }
            }
            StringBuilder word = new StringBuilder();
            while (y < letters.length){
            word.append(letters[y]);
            y++;
            }
            words[z] = word.toString();
            z++;
        }

        boolean isSorted = false;
        int buf;
        String buffer;
        while(!isSorted) {
            isSorted = true;
            for (i = 0; i < index.length-1; i++) {
                if(index[i] < index[i+1]){
                    isSorted = false;

                    buf = index[i];
                    buffer = words[i];
                    index[i] = index[i+1];
                    words[i] = words[i+1];
                    index[i+1] = buf;
                    words[i+1] = buffer;
                }
            }
        }
        System.out.println("Result:");
        for(String word:words) {
            System.out.print(word+", ");
        }
    }
}
