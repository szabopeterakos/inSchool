package arrays;

import java.util.*;

public class test {
    public static void main(String[] args) {
        char[][] arr = {{'a', 'b', 'c'}, {'a', 'b', 'c'}, {'a', 'b', 'c'}};
        char[] arr2 = {'x', 'b', 'c'};

//      System.out.println(Arrays.toString(Arrays.sort(arr2))); // a tostring nem kaphat void-értéket

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        List<List<String>> tomi = new List<List<String>>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<List<String>> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(List<String> strings) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends List<String>> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends List<String>> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public List<String> get(int index) {
                return null;
            }

            @Override
            public List<String> set(int index, List<String> element) {
                return null;
            }

            @Override
            public void add(int index, List<String> element) {

            }

            @Override
            public List<String> remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<List<String>> listIterator() {
                return null;
            }

            @Override
            public ListIterator<List<String>> listIterator(int index) {
                return null;
            }

            @Override
            public List<List<String>> subList(int fromIndex, int toIndex) {
                return null;
            }
        };




    }


}

