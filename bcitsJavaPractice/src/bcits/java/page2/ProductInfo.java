package bcits.java.page2;

public class ProductInfo {

	public static void main(String[] args) {
		
		ProductInfoBean p1 = new ProductInfoBean();
		p1.setId(100);
		p1.setName("pen");
		p1.setPrice(10);
		
		ProductInfoBean p2 = new ProductInfoBean();
		p2.setId(200);
		p2.setName("pencil");
		p2.setPrice(5);
		
		ProductInfoBean p3 = new ProductInfoBean();
		p3.setId(300);
		p3.setName("book");
		p3.setPrice(50);
		
		ProductInfoBean p4 = new ProductInfoBean();
		p4.setId(400);
		p4.setName("bag");
		p4.setPrice(1000);

		Object a[]= {p1,p2,p3,p4};
		for (Object pf : a) {
			System.out.println(pf);
		}
	}

}
