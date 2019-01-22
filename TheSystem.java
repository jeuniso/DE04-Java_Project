import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;
    
    protected TheSystem() throws FileNotFoundException {
        itemCollection = new HashMap<String, Item>();
        if(getClass().getSimpleName().equals("AppSystem")) {
        	Item pizza = new Item();
        	pizza.setItemName("Pizza");
        	pizza.setItemDesc("Really Good");
        	pizza.setItemPrice(12.30);
        	pizza.setAvailableQuantity(20);
        	itemCollection.put("Pizza", pizza);
        	
        	Item salad = new Item();
        	salad.setItemName("Salad");
        	salad.setItemDesc("Really Good");
        	salad.setItemPrice(15.50);
        	salad.setAvailableQuantity(30);
        	itemCollection.put("Salad", salad);
        	
        	Item hb = new Item();
        	hb.setItemName("Hunger Burger");
        	hb.setItemDesc("Really Good");
        	hb.setItemPrice(12.30);
        	hb.setAvailableQuantity(20);
        	itemCollection.put("Hunger Burger", hb);
        	
        	Item fc = new Item();
        	fc.setItemName("Fried Chicken Fried");
        	fc.setItemDesc("Really Good");
        	fc.setItemPrice(12.30);
        	fc.setAvailableQuantity(20);
        	itemCollection.put("Fried Chicken Fried", fc);
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
    	HashMap<String, Item> ic = new HashMap<String, Item>();
    	
    	Iterator<Entry<String, Item>> it = this.itemCollection.entrySet().iterator();
    	
    	while(it.hasNext()) {
    		Entry<String, Item> next = it.next();
    		ic.put(next.getKey(), next.getValue());
    	}
    	/*Iterator<String> iterator = this.itemCollection.keySet().iterator();
    	while(iterator.hasNext()) {
    		String next = iterator.next();
    		ic.put(next, itemCollection.get(next));
    	}*/
    	
		return ic;
    }
    
    public void setItemCollection(HashMap<String, Item> copy ){
      this.itemCollection = copy;
    }
    
    public Boolean add(Item item) {
      if(this.itemCollection.containsValue(item)) {
    	  item.setAvailableQuantity(item.getAvailableQuantity()+1);
    	  return true;
      }
      
      else if(!this.itemCollection.containsValue(item)) {
    	  this.itemCollection.put(item.getItemName(), item);
    	  return true;
      }
      
      return false;
    }
    public Item remove(String itemName) {
        Item item = null;
        if(this.itemCollection.containsKey(itemName)) {
        	Item removed = this.itemCollection.get(itemName);
        	this.itemCollection.remove(itemName);
        	return removed;
        }
        
        else return item;
    }
    public Boolean checkAvailability(Item item, Integer current) {
      //Fill the code here
    }
}
