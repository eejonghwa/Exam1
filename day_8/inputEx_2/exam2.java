package day_8.inputEx_2;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.

        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 단을 입력해주세요: ");
        int num = scan.nextInt();

        for(int j = 1; j <=9; j++){
            System.out.println(num +"단 "+ num + " * " + j + " = " + num * j);
        }

        System.out.println();

    }
}
