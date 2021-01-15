package JSB.basic;

import JSB.bean.Hellospring4Been04;
import JSB.product.ProductService01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring4App08 {
    //상품 등록 프로그램
    // HelloSpring4App08 -> ProductService01 -> ProductDAO01
    // main클래스에서 상품등록 기능을 실행하기 위해 new 연산자를 이용해서 ProductService01의 객체를 만들고
    //그 객체를 통해서 newProduct()를 호출한다

   public static void main(String[] args) {
       ProductService01 ps = new ProductService01();
       ps.newProduct();

    }
}
