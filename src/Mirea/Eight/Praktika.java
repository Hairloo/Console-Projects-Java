package Mirea.Eight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Praktika {
}

enum DateLenght{
    SHORT,
    MIDDLE,
    LONG;
}

class Student {
    private Date birthdayDate;

    private int id;
    private String name;
    public Student(int id, String name, Date birthdayDate){
        this.id = id;
        this.name = name;
        this.birthdayDate = birthdayDate;
    }

    public int getId() {
        return id;
    }

    public String getDate(DateLenght lenght){
        try {
            switch (lenght){
                case SHORT -> new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(birthdayDate.toString());
                case MIDDLE -> new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH).parse(birthdayDate.toString());
                case LONG -> new SimpleDateFormat("d MMMM yyyy", Locale.ENGLISH).parse(birthdayDate.toString());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return name + " was born in "  + birthdayDate;
    }
}
class Test{
    public static void main(String[] args) throws ParseException {
        Student student = new Student(1, "Ilya", new SimpleDateFormat("MM-dd-yyyy").parse("07-10-2004"));
        System.out.println(student);
        System.out.println(student.getDate(DateLenght.MIDDLE));
    }
}
