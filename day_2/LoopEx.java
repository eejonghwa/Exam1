package day_2;
//
//public class LoopEx {
//    public static void main(String[] args) {
//
//        //2중 반복문
//
//        //1. 1~5까지 10번 출력
//        System.out.println("===1회차===");
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }
//        System.out.println("===2회차===");
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }
//        System.out.println("===3회차===");
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i < 4; i++) {
//            System.out.printf("=== %d 회차=== \n", i);
//            for (int j = 1; j < 6; j++) {
//                System.out.println(j);
//                int k = 0;
//                while (k < 4) {
//                    System.out.printf("=== %d 회차 === \n", k);
//                }
//            }
//
//            // 2. 직사각형 만들기
//            /*
//             *****
//             *****
//             *****
//             */
//
//            // v1 - 반복문을 사용하지 않은 버전. 크기가 작은 사각형은 그리기 쉽지만 커지면 힘들다. 사각형의 모양을 바꾸기 쉽지 않다.
////        System.out.println("*****");
////        System.out.println("*****");
////        System.out.println("*****");
////
////        // v2 - 세로 방향은 쉽게 조작이 가능하고 크게 그리기 가능하지만 가로방향은 힘들다.
////        for(int i = 0; i < 100; i++) {
////            System.out.println("*****");
////        }
//
//            // v3 - 세로, 가로 모두 반복문으로 크기 조절이 가능하므로 그리기 쉽고 변경이 용이하다.
//            for (int j = 0; j < 3; j++) {
//                for (int i = 0; i < 5; i++) {
//                    System.out.printf("*");
//                }
//                System.out.println();
//            }
//
//
//        }
//    }
//}
// 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/


//class LoopEx {
//    public static void main(String[] args) {
//        for (int num = 1; num <10; num++){
//            if(num % 2 == 0) {
//                System.out.printf("===%d단===\n", num);
//                for (int num1 = 1; num1 < 10; num1++){
//                    if(num1 %2==0){
//                        System.out.println(num + " * " + num1 + " = " + num*num1);
//                    }
//                }
//            }
//        }
//
//    }
//}



// 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

class LoopEx {
    public static void main(String[] args) {

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for (int i = n; i < m; i++) {
            if (i % 2 == 1) {
                System.out.println("==="+i+"단===");
                for (int j = 1; j <= limit; j++){
                    if (j % 2 == 0) {
                        System.out.println(i + " * " + j + " = " + i * j);
                    }
                }
            }
        }

    }
}
    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */




//class Main {
//    public static void main(String[] args) {
//
//        // 출력
//    /*
//    높이 : [3]
//
//    *
//    **
//    ***
//
//
//    */
//
//    /*
//
//    높이 : [5]
//
//    *
//    **
//    ***
//    ****
//    *****
//
//    */
//
//    /*
//
//    높이 : [7]
//
//    *
//    **
//    ***
//    ****
//    *****
//    ******
//    *******
//
//    */
//    }
//}
//
//class LoopEx {
//    public static void main(String[] args) {
//
//        // 출력
//    /*
//
//    높이 : [3]
//
//      *
//     **
//    ***
//
//    */
//
//    /*
//
//    높이 : [5]
//
//        *
//       **
//      ***
//     ****
//    *****
//
//    */
//
//    /*
//
//    높이 : [7]
//
//          *
//         **
//        ***
//       ****
//      *****
//     ******
//    *******
//
//    */
//    }
//}
//
//class LoopEx {
//    public static void main(String[] args) {
//        int y = 3;
//        // 출력
//        /*
//
//
//         *
//         ***
//         *****
//
//
//         */
//
//        y = 5;
//        // 출력
//        /*
//
//
//         *
//         ***
//         *****
//         *******
//         *********
//
//
//         */
//
//        y = 7;
//        // 출력
//        /*
//
//
//         *
//         ***
//         *****
//         *******
//         *********
//         ***********
//         *************
//
//
//         */
//    }
//}