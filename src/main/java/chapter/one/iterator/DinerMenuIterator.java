package chapter.one.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    public MenuItem next() {
        MenuItem item = list[position];
        position++;
        return item;
    }

    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        }
        return true;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (list[position-1] != null) {
            for (int i = position - 1; i < (list.length-1); i++) {
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
//        throw new UnsupportedOperationException("Remove from Diner Menu is not supported");
    }
}
