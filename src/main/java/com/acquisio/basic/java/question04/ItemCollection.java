package com.acquisio.basic.java.question04;


import java.util.ArrayList;
import java.util.List;

/**
 * A collection of Items.
 * 
 * @author Alfred
 *
 * @param <T> The type of item that is stored in the collection.
 */
class ItemCollection<T extends Item> {

    private List<T> items = new ArrayList<>();

    /**
     * Adds the item to the collection.
     * @param item The item to add to the collection.
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Retrieves the first item in the collection.
     * @return The first item in the collection.
     */
    public T getFirst() {
        if (items.size() > 0) {
            return items.get(0);
        }
        return null;
    }

    /**
     * Retrieves the last item in the collection.
     * @return The last item in the collection.
     */
    public T getLast() {
        int size = items.size();
        if (size > 0) {
            return items.get(size - 1);
        }
        return null;
    }

    /**
     * Removes the item from the collection.
     * @param item The item to remove from the collection.
     * @return Whether the item was in the collection.
     */
    public boolean remove(T item) {
        return items.remove(item);
    }

    /**
     * Finds the first item in the collection by name.
     * @param name The name of the item to look for.
     * @return The item if found. null otherwise.
     */
    public T findFirst(String name) {
        for (T item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
