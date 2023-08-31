package day_2;

//public class ConditionEx {
//    public static void main(String[] args) {
//
//        // 조건문 -> 택일구조
//
//
//        // 양자택일(이지선다)
//        // 남녀, 할인대상, 홀짝
//        boolean isMale = true;
//
//        if(isMale){
//            System.out.println("남자");
//        }
//        else{
//            System.out.println("여자");
//        }
//
//        // 삼자택일(삼지선다)
//        // 초중고, 직좌우
//        int age2 =15;
//        if(age2 >= 8 && age2 <= 13){
//            System.out.println("초등학교"); // 8~13
//        }
//        else
//        if(age2 <= 16){
//            System.out.println("중학교"); // 14~16
//        }
//        else
//        if(age2 <= 19){
//            System.out.println("고등학교"); //17~19
//        }
//
//
//
//        // 오자택일(오지선다)
//        // 대학성적(A,B,C,D,F)
//
//        //점수가 90~100 -> A
//        //점수가 80~89 -> B
//        //점수가 70~79 -> C
//        //점수가 60~69 -> D
//        //점수가 60미만 -> E
//
//        int score = 90 ;
//
//        if (score < 60){
//            System.out.println("E");
//        }
//        else if(score <= 69){
//                System.out.println("D");
//        }
//        else if(score <= 79){
//            System.out.println("C");
//        }
//        else if(score <= 89){
//            System.out.println("B");
//        }
//        else if(score <= 100){
//            System.out.println("A");
//        }
//
//
//
//    }
//}

//-------------------------------------------------------------

//홀수와 짝수를 구별해주세요.
// num이 짝수면 even, 홀수면 odd 출력해주세요.
// 짝수 판별 : 2로 나누어서 떨어지면 짝수

//class ConditionEx {
//    public static void main(String[] args) {
//        int num = 10;
//        if (num % 2 == 0) {
//            System.out.println("even");
//
//        } else {
//            System.out.println("odd");
//        }
//    }
//}

//-------------------------------------------------------------
//
// 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.

//class ConditionEx {
//    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 12;
//
//        if (num1 > num2){
//            System.out.println(num1 - num2);
//        }else{
//            System.out.println(num2 - num1);
//        }
//    }
//}

//다른 답
//class ConditionEx {
//    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 12;
//        int result1 = 0;
//        int result2 = 0;
//
//        // if문만
//        if(num1 >= num2) {
//            result1 = num1 - num2;
//        }
//        if(num1 < num2) {
//            result1 = num2 - num1;
//        }
//
//        System.out.println(result1);
//
//        if(num1 > num2) {
//            result2 = num1 - num2;
//        } else {
//            result2 = num2 - num1;
//        }
//
//        System.out.println(result2);
//
//    }
//}


//------------------------------------------------------



// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다..
// 조건 : 2가지 이상의 방법으로 풀어야 합니다.

//class exam01 {
//    public static void main(String[] args) {
//        int age = 21; // 이 값을 바꿔가면서 실행해보세요.
//
//        System.out.println("당신의 나이는 " + age + "살 입니다.");
//
//        // 구현시작
//
//        // V1
//        if (age <= 19 || age >= 60){
//            System.out.println("할인 대상입니다.");
//        } else {
//            System.out.println("할인 대상이 아닙니다.");
//        }
//
//        // V2
//        if (age > 19 && age < 60){
//            System.out.println("할인 대상이 아닙니다.");
//        } else {
//            System.out.println("할인 대상입니다.");
//        }
//        // 구현 끝
//
//        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
//    }
//}
//다른답
//class Main {
//    public static void main(String[] args) {
//        int age = 21; // 이 값을 바꿔가면서 실행해보세요.
//
//        System.out.println("당신의 나이는 " + age + "살 입니다.");
//
//        // 구현시작
//
//        // if문만 이용해서 풀기
//
//        if(age <= 19) {
//            System.out.println("할인대상입니다.");
//        }
//        if(age >= 60) {
//            System.out.println("할인대상입니다.");
//        }
//        if(age > 19) {
//            if(age < 60) {
//                System.out.println("할인대상이 아닙니다.");
//            }
//        }
//
//        // if else로 풀기
//        if(age <= 19) {
//            System.out.println("할인대상입니다.");
//        } else if(age >= 60) {
//            System.out.println("할인대상입니다.");
//        } else if(age > 19){
//            System.out.println("할인대상이 아닙니다.");
//        }
//
//        // else 이용해서 풀기
//        if(age <= 19) {
//            System.out.println("할인대상입니다.");
//        } else if(age >= 60) {
//            System.out.println("할인대상입니다.");
//        } else {
//            System.out.println("할인대상이 아닙니다.");
//        }
//
//        // 구현 끝
//
//        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
//    }
//}

//----------------------------------------------------------------------------------------

/*
어떤 차의 높이가 170cm 입니다..

이 차는 3개의 터널을 차례대로 지나게 될 것입니다.

터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 납니다.

차가 모든 터널을 무사히 잘 통과하면 PASS 를 출력하고, 충돌한다면 CRASH 를 출력하세요.
*/

//class ConditionEx {
//    public static void main(String[] args) {
//        int tunnel1 = 180;
//        int tunnel2 = 182;
//        int tunnel3 = 172;
//        //
//        int car = 170;
//
//        if (car <= tunnel1) {
//            System.out.println("PASS");
//        }
//        else if (car > tunnel1){
//            System.out.println("CRASH");
//        }
//        else if (car <= tunnel2 && car > tunnel1) {
//            System.out.println("PASS");
//        }
//        else if(car > tunnel2){
//            System.out.println("CRASH");
//        }
//        else if (car <= tunnel3 && car >tunnel3) {
//            System.out.println("PASS");
//        }
//        else if(car > tunnel3){
//            System.out.println("CRASH");
//        }
//    }
//}
//다른답
//class Main {
//    public static void main(String[] args) {
//        int tunnel1 = 180;
//        int tunnel2 = 182;
//        int tunnel3 = 172;
//        int car = 170;
//
//        if(tunnel1 <= car) {
//            System.out.println("Crash");
//
//        } else if(tunnel2 <= car) {
//            System.out.println("Crash");
//
//        } else if(tunnel3 <= car) {
//            System.out.println("Crash");
//
//        } else {
//            System.out.println("Pass");
//
//        }
//    }
//}