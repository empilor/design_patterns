package chapter.one.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }

//    public void remove() {
//        throw UnsupportedOperationException("You can't remove elements yet! Come later");
//    }
}
