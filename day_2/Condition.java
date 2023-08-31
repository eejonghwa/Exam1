
package day_2;
public class Condition {
    public static void main(String[] args) {
        // 조건문

        // 실행이 될 수도 있고 안될 수도 있는

        System.out.println("창문 닫기");

        // 비가 올 때만 창문을 닫기 ->
        boolean isRain = false;

        if (isRain){
            System.out.println("창문 닫기2");
        }

        // 야식

        int cash = 2000;

        // 소지금이 20000원 이상일 때
        if (cash >= 20000) {
            System.out.println("치킨");
        }

        // 소지금이 20000원 미만, 2000원 이상일 때
        // 논리 연산자 사용 X
        // if는 조건 하나당 if 하나
        if(cash < 20000) {
            if(cash >= 2000){
                System.out.println("포카칩");
            }
        }

        // 할인대상 -> 19세 이하, 60세 이상 할인대상

        int age = 59;

        if(age<=19){
            System.out.println("할인대상입니다.");
        }

        if(age>=60){
            System.out.println("할인대상입니다.");
        }

        if(age <= 19 || age >= 60){
            System.out.println("할인대상입니다.");
        }

    }
}
