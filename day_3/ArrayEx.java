package day_3;

//class ArrayEx {
//    public static void main(String[] args) {
//
//        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for(int i = 0; i <= 9; i++){
//            System.out.println(arr[i]);
//        }
//        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
//
//    }
//}

// 배열을 두번 출력해주세요.
//class ArrayEx {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        for(int j = 0; j < 2; j++){
//            for(int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }
//        }
//    }
//}

//class ArrayEx {
//    public static void main(String[] args) {
//        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
//        int[] arr = {5,4,3,2,1};
//        for(int i = arr.length-1; 0 <= i ; i--){
//            System.out.println(arr[i]);
//        }
//    }
//}

// 배열 안의 숫자들의 합을 구해주세요.
class ArrayEx {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0;  i <= arr.length-1; i++){
            sum += arr[i];
        }
        System.out.println(sum);

		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/

    }
}