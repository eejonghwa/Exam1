package day_3;

public class examexam {
    public static void greeting(int num1, int num2) {
        String message; // 초기화되지 않은 변수

        switch (num1) {
            case 1:
                message = "안녕하세요";
                break;
            case 2:
                message = "하이~";
                break;
            case 3:
                message = "봉쥬";
                break;
            default:
                System.out.println("알 수 없는 값입니다.");
                return; // 처리 중지
        }

        for (int i = 0; i < num2; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {


        greeting(2, 3);
    }
}

