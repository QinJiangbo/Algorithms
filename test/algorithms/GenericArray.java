package algorithms;

import java.util.ArrayList;
import java.util.List;

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
        Fruit[] fruits = new Apple[10];
        List<? super Apple> fruitList = new ArrayList<>();
//      List<? extends Apple> fruitList = new ArrayList<>();
        fruitList.add(new Apple());
        fruitList.add(new Jonathan());
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

class Fruit {

}

class Apple extends Fruit {

}

class Jonathan extends Apple {

}
