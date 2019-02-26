package chapter.one.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie Burger on a whole wheat bun",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of soup of the day with a chicken",
                false, 3.39);
        addItem("Burrito",
                "A large burrito, with whole pinto beans",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
