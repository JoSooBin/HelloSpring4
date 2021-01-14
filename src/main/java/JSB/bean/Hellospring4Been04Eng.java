package JSB.bean;

public class Hellospring4Been04Eng implements Hellospring4Been04 {
    //영어로 인삿말을 출력하는 메서드
    @Override
    public void sayHello(String msg) {
        System.out.println("Hello " + msg);
    }
}