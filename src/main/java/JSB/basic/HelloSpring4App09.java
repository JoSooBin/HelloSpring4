package JSB.basic;

import JSB.product.ProductService02;
import JSB.product.ProductService02Impl;

public class HelloSpring4App09 {
    //상품 등록 프로그램
    // HelloSpring4App02 -> ProductService02 -> ProductDAO02
    // main클래스에서 상품등록 기능을 실행하기 위해 new 연산자를 이용해서 ProductService01의 객체를 만들고
    //그 객체를 통해서 newProduct()를 호출한다
    //인터페이스 기반으로 코드 재작성

   public static void main(String[] args) {
       ProductService02 ps = new ProductService02Impl();
       ps.newProduct();

    }
}
