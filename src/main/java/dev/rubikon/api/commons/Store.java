package dev.rubikon.api.commons;

import java.util.Collection;
import java.util.HashMap;

/**
 * Store is a generic class that stores a key and a value.
 */
public class Store<U, T> {
    private final HashMap<U, T> store = new HashMap<>();

    public void add(U key, T value) {
        store.put(key, value);
    }

    public T get(U key) {
        return store.get(key);
    }

    public void remove(U key) {
        store.remove(key);
    }

    public Collection<T> values() {
        return store.values();
    }

    public Collection<U> keys() {
        return store.keySet();
    }

    public HashMap<U, T> getRawRepository() {
        return store;
    }
}