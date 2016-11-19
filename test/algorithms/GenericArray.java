package algorithms;

/**
 * Date: 19/11/2016
 * Author: qinjiangbo@github.io
 */
public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public static void main(String[] args) {
        GenericArray<Integer> genericArray = new GenericArray<>(10);
        Object[] objects = genericArray.rep();
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        System.out.println(array.getClass().getSimpleName());
        return array;
    }

}
