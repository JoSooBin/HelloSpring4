package JSB.product;

public class ProductService01 {
    //상품등록 기능을 수행하는 메서드
    public void newProduct() {
        System.out.println("새로운 상품을 등록합니다");

        ProductVO pvo = new ProductVO();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        //입력받은 상품정보에 영속성을 부여하기 위해 DAO호출
        //마찬가지로 new 연산자로 해당 객체를 생성하고 insertProduct 메서드 호출함
        ProductDAO01 pado= new ProductDAO01();
        pado.insetProduct(pvo);

        System.out.println("새로운 상품이 등록되었습니다!!");
    }
}
