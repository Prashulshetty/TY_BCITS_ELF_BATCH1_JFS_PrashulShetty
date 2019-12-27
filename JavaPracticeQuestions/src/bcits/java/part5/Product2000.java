package bcits.java.part5;

import java.util.ArrayList;


import bcits.java.page2.ProductInfoBean;

public class Product2000 {

	public static void main(String[] args) {
		
		ProductInfoBean p1 = new ProductInfoBean();
		p1.setId(100);
		p1.setName("pen");
		p1.setPrice(100);
		
		ProductInfoBean p2 = new ProductInfoBean();
		p2.setId(200);
		p2.setName("pencil");
		p2.setPrice(200);
		
		ProductInfoBean p3 = new ProductInfoBean();
		p3.setId(300);
		p3.setName("book");
		p3.setPrice(300);
		
		ProductInfoBean p4 = new ProductInfoBean();
		p4.setId(400);
		p4.setName("bag");
		p4.setPrice(120);
		
		ProductInfoBean p5 = new ProductInfoBean();
		p4.setId(500);
		p4.setName("laptop");
		p4.setPrice(10000);

	ArrayList<ProductInfoBean> plist = new ArrayList<ProductInfoBean>();
		
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		
		int i=0;
		for ( Object obj : plist) 
		{
			if(((ProductInfoBean) obj).getPrice() < 2000) {
				System.out.println(obj);
			}
		}
  }
}
		
		
	


