package day_2;

//class Star {
//    public static void main(String[] args){
//        int height = 3;
//        for (int i = 0; i < height; i++) {
//            for(int j = -1; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//class Star{
//    public static void main(String[] args) {
//        int number = 3;
//        for(int i = 1 ; i <= number; i++ ){
//            for(int j = number-1; j >= i; j--){
//                System.out.print("  ");
//            }
//            for(int j = 1; j <= i; j++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//    }
//}

//class Star {
//    public static void main(String[] args) {
//        int y = 3;
//        int lineNum = 1;
//
//        for (int j = 1; j < y * 2; j += 2) {
//
//            // 공백 그리기
//            for (int i = 0; i < y - lineNum; i++) {
//                System.out.print(" ");
//            }
//
//            //별 그리기
//            for (int i = 0; i < j; i++) {
//                System.out.print("*");
//            }
//            System.out.println();   // 줄바꿈
//            lineNum++;
//        }
//    }
//}

class Star {
    public static void main(String[] args) {

        int y = 3;
        int lineNum = 1;



        for(int j =1; j < y*2; j+=2){

            for(int i = 0; i < y-lineNum; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < j; i++){
                System.out.print("*");
            }
            System.out.println();


        }


    }
}