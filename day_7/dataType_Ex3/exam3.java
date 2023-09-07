package day_7.dataType_Ex3;

// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 기본형 변수의 경우 자동형변환을 이용하여 `저장 메서드`의 개수를 최대한 줄여보세요.

class Main {
    public static void main(String[] args) {
        저장소.저장(10);
        저장소.저장("안녕");
        저장소.저장(new 사람());
        저장소.저장(new 사과());
        저장소.저장(5.5);
        저장소.저장(false);
        저장소.저장('a');

        // 실수 => 정수 X
        // 정수 => 실수 O

        // 10 => 10.0, 121 => 121.0

        // 10.3 => 10

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        저장소.저장(b);
        저장소.저장(s);
        저장소.저장(c);
        저장소.저장(i);
        저장소.저장(l);
        저장소.저장(f);
        저장소.저장(d);
        저장소.저장(bl);

        long l2 = 10L;
        double d2 = l2;
    }
}

class 저장소 {
//    static void 저장(byte v) {
//        System.out.println("byte 값 : " + v);
//    }

//    static void 저장(char v) {
//        System.out.println("char 값 : " + v);
//    }

//    static void 저장(short v) {
//        System.out.println("short 값 : " + v);
//    }

//    static void 저장(int v) {
//        System.out.println("int 값 : " + v);
//    }

//    static void 저장(long v) {
//        System.out.println("long 값 : " + v);
//    }

//    static void 저장(float v) {
//        System.out.println("float 값 : " + v);
//    }

    static void 저장(double v) {
        System.out.println("double 값 : " + v);
    }

    static void 저장(boolean v) {
        System.out.println("boolean 값 : " + v);
    }

    static void 저장(String v) {
        System.out.println("String 값 : " + v);
    }

    static void 저장(사람 v) {
        System.out.println("사람 값 : " + v);
    }

    static void 저장(사과 v) {
        System.out.println("사과 값 : " + v);
    }
}

class 사람 {
}

class 사과 {
}