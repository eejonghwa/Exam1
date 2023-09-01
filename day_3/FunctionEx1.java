package day_3;

//class FunctionEx1{
//    public static void print(int num){
//        System.out.println(num);
//    }
//    public static void main(String[] args) {
//
//        print(4); // 출력: 4
//        print(10); // 출력: 10
//        print(100); // 출력: 100
//
//    }
//}

//class Main {
//
//    public static void introduce(){
//        for(int i = 1; i <= 10; i++){
//            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
//        }
//    }
//    public static void main(String[] args) {
//
//        introduce();
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//        // 안녕하세요. 저는 20살 홍길동입니다.!
//    }
//}
//


//class Main {
//    public static void introduce(int num){
//        for(int i = 1; i <= num; i ++){
//            System.out.println("안녕하세요. 20살 홍길동입니다.!");
//        }
//    }
//    public static void main(String[] args) {
//        introduce(3);
//
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//
//        introduce(5);
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//
//        introduce(10);
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//        // 안녕하세요. 20살 홍길동입니다.!
//    }
//}
//
//
class FunctionEx1 {

    public static void greeting1(int num1){
        if (num1 == 1){
            System.out.println("안녕하세요");
        }
        if (num1 == 2){
            System.out.println("하이~");
        }
        if (num1 == 3){
            System.out.println("봉쥬");
        }
    }


    public static void greeting2(int num1, int num2){
        if (num1 == 1){
            for(int i = 0; i < num2; i++){
            System.out.println("안녕하세요");
            }
        }
        if (num1 == 2){
            for(int i = 0; i < num2; i++){
                System.out.println("하이~");
            }
        }
        if (num1 == 3){
            for(int i = 0; i < num2; i++){
                System.out.println("봉쥬");
            }
        }
    }



    public static void main(String[] args) {

        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }
}