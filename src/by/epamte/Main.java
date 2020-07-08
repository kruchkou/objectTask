package by.epamte;

import by.epamte.entity.ShopItem;
import by.epamte.utils.Shop;

import java.util.List;

public class Main {



    public static void main(String[] args) {
	    String className = "Laptop";
	    String parameter = "MEMORY_ROM";
	    String value = String.valueOf(8000);

	    Shop shop = new Shop();

	    List<ShopItem> items = shop.filteredItems(className,parameter,value);
		System.out.println("End.");
    }
}
