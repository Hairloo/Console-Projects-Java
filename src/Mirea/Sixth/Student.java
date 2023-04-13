package Mirea.Sixth;

import java.util.*;

public class Student {
    private int id;
    public Student(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Sort{
    public static void sort(Student[] students){
        for(int i = 1; i < students.length; i++){
            Student currElem = students[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && students[prevKey].getId() > currElem.getId()){
                students[prevKey+1] = students[prevKey];
                prevKey--;
            }
            students[prevKey+1] = currElem;
        }
    }
}


class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getId() - o1.getId();
    }
}

class Test{
    public static void main(String[] args) {
        Set<Integer> ids = new HashSet<>();
        List<Student> studentList = new ArrayList<>();
        List<Student> studentList1 = new ArrayList<>();
        for(int i = 0; i < 81; i++){
            int a;
            while(true){
                a = Math.abs(new Random().nextInt() % 200);
                if(ids.add(a)){
                    break;
                }
            }
            studentList.add(new Student(a));
        }
        for(int i = 0; i < 19; i++)
        {
            int a;
            while(true){
                a = Math.abs(new Random().nextInt() % 200);
                if(ids.add(a)){
                    break;
                }
            }
            studentList.add(new Student(a));
        }
        List<Student> allStudents = new ArrayList<>();
        allStudents.addAll(studentList);
        allStudents.addAll(studentList1);
        Collections.sort(allStudents, new SortingStudentsByGPA());
        for(Student student : allStudents){
            System.out.print(student.getId() + " ");
        }
        Collections.sort(allStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });
        System.out.println();
        for(Student student : allStudents){
            System.out.print(student.getId() + " ");
        }
    }
}



