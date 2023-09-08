package day_8.MapEx_1;

import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4



        // import 단축키 -> alt + enter
        HashMap<String, Object> userMap= new HashMap<>();
        userMap.put("이름","홍길동");
        userMap.put("나이",22);
        userMap.put("키",170.5);

        System.out.printf("이름 : %s\n", (String)userMap.get("이름"));
        System.out.printf("나이 : %d\n", (int)userMap.get("나이"));
        System.out.printf("키 : %d\n", (double)userMap.get("키"));



        HashMap<String, Object> userMap2 = new HashMap<>();
        userMap2.put("이름", "홍길순");
        userMap2.put("나이", 25);
        userMap2.put("키", 162.4);

        String 이름 = (String) userMap2.get("이름");
        int 나이 = (int) userMap2.get("나이");
        double 키 = (double) userMap2.get("키");

        System.out.println("사람 1 정보");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
        System.out.println("키 : " + 키);



    }
}
