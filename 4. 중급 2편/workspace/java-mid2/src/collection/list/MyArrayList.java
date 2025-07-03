package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{

    private static final int DEFAULT_CAPACITY = 5; //수용량

    private Object[] elementData;
    private int size = 0; //리스트 크기


    public MyArrayList() { //생성해서 넣는다
        elementData = new Object[DEFAULT_CAPACITY]; //제네릭은 생성자에 사용할 수 없다
    }

    public MyArrayList(int initialCapacity){
        elementData = new Object[initialCapacity]; //배열의 크기를 직접정의
    }

    @Override
    public int size(){ //사이즈 반환
        return size;
    }

    //데이터 입력부분
    @Override
    public void add(E e){
        if(size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    //데이터 입력부분
    @Override
    public void add(int index, E e){
        if(size == elementData.length){
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }


    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--){
            elementData[i] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    //데이터 반환하는 부분
    @Override
    @SuppressWarnings("unchecked") //경고를 무시하겠다는 의미
    public E get(int index){
        return (E)elementData[index]; //E로 캐스팅
    }

    //데이터 입력부분
    @Override
    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public E remove(int index){
        E oldValue = get(index);
        shiftLeftFrom(index); //데이터 이동
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++){
            elementData[i] = elementData[i + 1];

        }
    }

    //데이터 입력 부분
    @Override
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        return Arrays.toString(
                Arrays.copyOf(elementData, size)) +
                " size= " + size + ", capacity= " + elementData.length;
    }
}









