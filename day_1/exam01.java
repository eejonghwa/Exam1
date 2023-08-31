package day_1;

public class exam01 {
    public static void main(String[] args) {

        // 정수 : int, 실수(소수) : double, 문장 : String
        int i = 100;
        System.out.println(i); // 출력 : 100
        double d = 3.14;
        System.out.println(d); // 출력 : 3.14
        String s = "안녕하세요";
        System.out.println(s); // 출력 : 안녕하세요
        i = 200;
        System.out.println(i); // 출력 : 200
        d = 10.5;
        System.out.println(d); // 출력 : 10.5
        s = "반갑습니다";
        System.out.println(s); // 출력 : 반갑습니다.



        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        int c = 0;
        c = a;
        a = b;
        b = c;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5

    }
}
