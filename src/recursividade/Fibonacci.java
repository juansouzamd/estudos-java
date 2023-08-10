package recursividade;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número:");
        int num = input.nextInt();

        int value = findElement(num);

        System.out.println(value);
    }

    public static int findElement(int elementNumber){

        if(elementNumber<= 1){
            return elementNumber;
        }

        return findElement(elementNumber - 1) + findElement(elementNumber- 2);
    }
}
