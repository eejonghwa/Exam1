package day_8.inputEx_3;

// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("나이를 입력해주세요:");
        int age = scan.nextInt();


        scan.nextLine(); // 버퍼 비우기용


        System.out.println("이름을 입력해주세요:");
        String name = scan.nextLine();


        System.out.printf("안녕하세요 %d세 %s입니다",age, name);






        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.

    }
}