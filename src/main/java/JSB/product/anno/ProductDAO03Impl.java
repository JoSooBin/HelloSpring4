package JSB.product.anno;

import JSB.product.ProductDAO02;
import JSB.product.ProductVO;
import org.springframework.stereotype.Component;

@Component("pdao")
public class ProductDAO03Impl implements ProductDAO02 {
    public void insetProduct(ProductVO pvo) {

        System.out.printf("입력하신 %s(이/가) 성공적으로 저장되었어요", pvo.getPname());
    }
}
