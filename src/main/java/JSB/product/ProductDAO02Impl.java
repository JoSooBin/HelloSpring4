package JSB.product;

public class ProductDAO02Impl implements ProductDAO02 {
    public void insetProduct(ProductVO pvo) {
        System.out.printf("입력하신 %s(이/가) 성공적으로 저장되었어요", pvo.getPname());
    }
}
