package JSB.basic;

public class HelloSpring4App01 {
    //첫번째 사례
    //간단한 인삿말을 출력하는 프로그램 작성
    //메세지를 출력하는 sayHello메서드를 만들어 호출
    //단, sayHello 메서드를 호출하려면 먼저, HelloSpring4App01에 대한 객체를 생성해야 됨

    //인삿말을 출력하는 메서드가 현재 클래스에 있기 때문에 프로그램 확장성 측면에서 봤을때 제약이 존재
    //즉 유지보수/업무분담의 어려움이 발생
    //해결 : 인삿말 출력기능을 담당하는 별도의 클래스 작성


    public static void main(String[] args) {
        //System.out.println("Hello, World!"); //1번

        HelloSpring4App01 app = new HelloSpring4App01(); //2b
        app.sayHello("World!!");
    }

    private void sayHello(String msg){ //2a
        System.out.println("Hello," + msg);
    }
}
