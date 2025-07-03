package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;


    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }


    public MyArrayListV2(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        //코드 추가
        if(size == elementData.length){ //사이즈가 length에 도달한 상황이라면 배열의 길이를 추가한다(grow())
            grow();
        }

        elementData[size] = e;
        size++;
    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementData.length; //기존 capacity
        int newCapacity = oldCapacity * 2;    //새로운 배열 = 기존배열 크기 * 2
        elementData = Arrays.copyOf(elementData, newCapacity); //기존배열을 기반으로 새로운 데이터를 만든다
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }


    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(
                Arrays.copyOf(elementData, size)) +
                " size= " + size + ", capacity= " + elementData.length;
    }
}









