package catalogue;

import java.io.Serializable;
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
	  
	 
	  
  }
 
  public boolean isProductSame(Product p1,Product p2)
  {
	  if (p1.getProductNum()==p2.getProductNum())return true;
	  else return false;
  }
  
}
