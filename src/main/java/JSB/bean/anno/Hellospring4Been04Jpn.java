package JSB.bean.anno;

import JSB.bean.Hellospring4Been04;
import org.springframework.stereotype.Component;

@Component("jpn")
public class Hellospring4Been04Jpn implements Hellospring4Been04 {
    //일본어로 인삿말을 출력하는 메서드
    @Override
    public void sayHello(String msg) {
        System.out.println("こんにちは " + msg);
    }
}