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

class Star{
    public static void main(String[] args) {
        int number = 3;
        for(int i = 1 ; i <= number; i++ ){
            for(int j = number-1; j >= i; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}