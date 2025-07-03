package collection.list;

public interface MyList<E> {

    int size();

    void add(E e); //마지막에 데이터 추가

    void add(int index, E e); //특정 위치에 추가

    E get(int index); //특정위치에 데이터 조회

    E set(int index, E element); //특정위치에 요소를 추가

    E remove(int index);

    int indexOf(E o); //검색 //인덱스위치 반환

}
