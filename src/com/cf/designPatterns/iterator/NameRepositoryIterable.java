package com.cf.designPatterns.iterator;

import java.util.Iterator;

public class NameRepositoryIterable implements Iterable<String>{
    private String[] names = {"John", "Jane", "Jack", "Jill"};

    @Override
    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
