package class1;

public class ClassStart5 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //배열생성
        Student[] students = {student1, student2};

        for(int i = 0; i < students.length; i++){
            System.out.println("이름:" +  students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        //for문 최적화1(반복요소를 변수에 담아서 처리)
        for(int i = 0; i < students.length; i++){
            Student s = students[i]; //변수명을 줄여줌
            System.out.println("이름:" +  s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        //for문 최적화2(향상된 for문)
        for(Student s : students){  //iter
            System.out.println("이름:" +  s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
