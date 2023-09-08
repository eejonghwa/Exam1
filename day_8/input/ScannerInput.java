package day_8.input;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(a); // 표준 출력

        // 표준 입력
//      int input = System.in.read();// 표준 입력
//      System.out.println(input);
//      // System.out.println((char)input); // 97 -> a

        Scanner scan = new Scanner(System.in);

        // 입력이 필요한 경우
        int num = scan.nextInt(); // 입력된 숫자를 하나 읽어옴.

        System.out.println("당신이 입력한 값은 : "  + num);



    }
}
