package catalogue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BetterBasketTest {

	@Test
	void testAddProduct() {
		BetterBasket a = new BetterBasket();
		
		Product p1 = new Product("0001","car",10.00,1);
		Product p2 = new Product("0001","car",10.00,1);
		Product p3 = new Product("0003","chocolate",100.00,3);
		Product p4 = new Product("0005","bat",15.00,1);
		
		
		a.add(p1);
		a.add(p2);
		a.add(p4);
		a.add(p3);
		
		if (a.get(0).getQuantity()==2)
		{
			System.out.println("success!! same products have been successfully merged");
		}
		else
		{
			System.out.println("failure products not merged");
		}
		if (a.get(1).getQuantity()==1)
		{
			System.out.println("success");
		}
	}

}
