package day_3;

//public class LoopSolve {
//    public static void main(String[] args) {
//
//        int n = 4; // 시작
//        int m = 20; // 끝
//        int limit = 10; // 곱의 개수
//
//        for (int i = n; i < m; i++) {
//            if (i % 2 != 0) {
//                System.out.println("==="+i+"단===");
//                for (int j = 1; j <= limit; j++){
//                    if (j % 2 == 0) {
//                        System.out.println(i + " * " + j + " = " + i * j);
//                    }
//                }
//            }
//        }
//
//    }
//}

class LoopSolve {
    public static void main(String[] args) {
        int y = 3;
        int lineNum = 1;

        for(int j = 1; j < y*2; j+=2){

            // 공백 그리기
            for(int i = 0; i < y - lineNum; i++){
                System.out.print(" ");
            }

            //별 그리기
            for(int i =0; i < j; i++){
                System.out.print("*");
            }
            System.out.println();   // 줄바꿈
            lineNum ++;
        }



        // 공백의 개수 -> 높이 -> line 번호
        //3 - 1
        //3 - 2
        //3 - 3
        // 출력
        /*


          *
         ***
        *****


         */

        y = 5;
        // 출력
        /*


           *
          ***
         *****
        *******
       *********


         */

        y = 7;
        // 출력
        /*


               *
              ***
             *****
            *******
           *********
          ***********
         *************


         */
    }
}