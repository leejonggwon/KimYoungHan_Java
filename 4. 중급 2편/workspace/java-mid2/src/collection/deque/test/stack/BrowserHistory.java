package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null; //현재 페이지에 대한 정보


    public void visitPage(String url) {
        if(currentPage != null){
            history.push(currentPage); //null이 아니면 currentPage를 넣어주고
        }
        currentPage = url; //처음 currentPage에 담아두기만 한다
        System.out.println("방문: " + url);
    }



    public String goBack() {
       if (!history.isEmpty()){
           currentPage = history.pop();
           System.out.println("뒤로 가기: " + currentPage);
           return currentPage;
       }
       return null;
    }
}
