import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class AppSystem extends TheSystem {
	
    public AppSystem() throws FileNotFoundException {
    	super();
    }
    
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
        
       // Iterator<String> it = current.keySet().iterator();
        int count = 1;
        
        System.out.println("Item Name Item Description Item Price Available Quantity");
        for(Entry<String, Item> e : current.entrySet()) {
        	System.out.println(count + " " + e.getValue().getItemName() + " "
        			+ e.getValue().getItemDesc() + " "
        			+ e.getValue().getItemPrice() + " "
        			+ e.getValue().getAvailableQuantity());
        	count++;
        }
       /* while(it.hasNext()) {
        	System.out.println(count + " " + it.next()  + " " 
        			+ current.get(it.next()).getItemDesc() + " "
        			+ current.get(it.next()).getItemPrice() + " "
        			+ current.get(it.next()).getAvailableQuantity());
        	count++;
        }*/
    }
    
    public Boolean add(Item item) {
    	HashMap<String, Item> current = this.getItemCollection();
    	HashMap<String, Item> added = new HashMap<String, Item>();
    	
    	for(Entry<String, Item> e : current.entrySet()) {
    		added.put(e.getKey(), e.getValue());
    	}
    	
    	if(current.containsValue(item)) {
    		System.out.println(item.getItemName() + " is already in the " + getClass().getName());
    		return false;
    	}
    	
    	else {
    		added.put(item.getItemName(), item);
    		setItemCollection(added);
    		return true;
    	}
    }
}
