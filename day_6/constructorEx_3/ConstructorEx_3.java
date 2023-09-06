package day_6.constructorEx_3;

// 출력 : 아래와 같이 출력되게 해주세요.

class ConstructorEx_3 {
    // 출력 : 아래와 같이 출력되게 해주세요.
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}

class 사람 {
    팔 a왼팔;

    사람(){
        a왼팔 = new 팔();
    }

    void 걷다() {


    }
}

class 팔{
    int 길이;
    팔(){
        this.길이 = 100;
    }
}