package day_4;

class Main {
    public static void main(String[] args) {

        Account a1 = new Account();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200
    }
}

class Account {
    int balance = 0;

    public void deposit(int num) {
        balance += num;
        //System.out.println(balance + "원을 예금했습니다.");
    }

    public int withdraw(int num) {
        if (balance >= num) {
            balance -= num;
            //System.out.println(num + "원을 인출했습니다.");
            return num;
        }
        else {
            //System.out.println("잔액이 부족합니다.");
            return 0;
        }

    }

    public int getRemainder() {
        return balance;

    }

}
