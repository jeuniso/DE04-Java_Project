import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;

public class CartSystem extends TheSystem{
	
    public CartSystem() throws FileNotFoundException {
    	super();
    }
    public void display() {
      HashMap<String, Item> current = this.getItemCollection();
      Iterator<String> it = current.keySet().iterator();
      
      System.out.println("Item Name Item Description Item Price Available Quantity");
      
      while(it.hasNext()) {
    	  System.out.println(current.get(it.next()).getItemName() + "  "
    			  + current.get(it.next()).getItemDesc() + "  "
    			  + current.get(it.next()).getItemPrice() + "  "
    			  + current.get(it.next()).getAvailableQuantity());
      }
    }
}
