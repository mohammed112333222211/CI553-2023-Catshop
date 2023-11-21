package catalogue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  

  // You need to add code here
 
  
  //overriding the add method
  @Override
  public boolean add(Product p1)
  {
	 //checks through the the whole lis 
	 for(Product p : this) 
	 {
		 if (isProductSame(p1,p)==true)
		 {
			 mergeProducts(p1,p);
			 return true;
		 }
		
	 }
	 
	 super.add(p1);
	 return true;
	  
  }
 
  // compares the product in the basket to the one that's being added 
  // returns true if same (meaning should be merged) otherwise returns false
  // p1 is the new product about to be added while p is products already in the basket
  public boolean isProductSame(Product p1,Product p)
  {
	  if (p1.getProductNum()==p.getProductNum())return true;
	  else return false;
  }
  
  // 
  public void mergeProducts(Product p1, Product p)
  {
	  p.setQuantity(p1.getQuantity()+p.getQuantity());
  }
}
