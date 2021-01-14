package JSB.bean;

public class HelloSpring4Been05Factory {

    //인삿말을 출력하는 객체를 생성하는 create 메서드 정의
    public static Hellospring4Been04 create(String type){
        Hellospring4Been04 bean = null;;

        if(type.equalsIgnoreCase("Kor"))
            bean = new Hellospring4Been04Kor();
        else if (type.equalsIgnoreCase("eng"))
            bean = new Hellospring4Been04Eng();
        else if (type.equalsIgnoreCase("jpn"))
            bean = new Hellospring4Been04Jpn();


        return bean;
    }
}
