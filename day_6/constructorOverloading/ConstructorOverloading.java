package day_6.constructorOverloading;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Person p1 = new Person(20, "홍길동");
        p1.introduce();

        Person p2 = new Person();

        p2.age =30;
        p2.name = "이순신";

        Person p3 = new Person(30);

        p3.name = "유관순";

    }
}

class Person{
    int age;
    String name;

    Person(){

    }

    Person(int age){
        this.age = age;

    }

    Person(int age, String name){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.printf("%d살 %s 입니다.", age , name);
    }
}