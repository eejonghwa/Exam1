package day_8.parseInt;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // 입력 받을 때 nextline으로 통일


        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력해주세요: ");
        int age = Integer.parseInt(scan.nextLine());

        // 문자를 -> 숫자로 변환
        // 관련 없는 타입끼리는 형변환 X

        // Integer 래퍼클래스 사용
        Integer.parseInt("10"); // 문자로 된 숫자를 실제 숫자형으로 변환


        System.out.print("이름을 입력해주세요: ");
        String name = scan.nextLine();


        System.out.printf("안녕하세요 %d세 %s입니다",age, name);

    }
}