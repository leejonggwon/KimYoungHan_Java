package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10]; //자료저장할 배열사용
    private int size = 0;


    //0(n): contains가 배열을 다뒤진다
    public boolean add(int value){
        if (contains(value)){ //중복된 값이 있는지 체크한다
            return false;     //중복이 있으면 false 반환한다
        }
        elementData[size] = value;
        size++;
        return true;
    }

    //배열에 값이 있는지 확인
    //0(n): 배열을 다뒤진다
    public boolean contains(int value) {
        for (int data : elementData) {
            if(data == value){
                return true;
            }
        }
        return false;
    }

    //사이즈 반환
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) + //elementData 배열을 size 길이만큼 복사해서 새로운 배열을 리턴한다
                ", size=" + size +
                '}';
    }
}
