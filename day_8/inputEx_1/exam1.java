package day_8.inputEx_1;

import java.util.Scanner;
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 = scan.nextInt();

        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = scan.nextInt();

        System.out.printf("%d + %d = %d", num1, num2,(num1+num2));



    }
}