package oop1.ex;

public class Rectangle {
    //속성
    int width;
    int height;

    //기능
    //static 뺀다, 매개변수 필요없다: 자기꺼 사용함
    int calculateArea(){
        return width * height;
    }
    int calculatePerimeter(){
        return 2 * (width + height);
    }
    boolean isSquare(){
        return width == height;
    }
}