package Tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        new NewInstance().good();
    }
    public void good() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Object object1 = Class.forName("java.lang.Object").newInstance();
        System.out.println(object1);
    }


}

class PersonTwo {
    private String name;
    private int uid;

    public PersonTwo() {
        this.name = "Maya Kumari";
        this.uid = 101;
    }

    public PersonTwo(String name) {
        this.name = name;
        this.uid = 102;
    }

    public PersonTwo(String name, Integer uid) {
        this.name = name;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public int getUid() {
        return uid;
    }

    // getters and setters...
    public static void main(String[] args) {
        try {
            Class.forName("Tests.PersonTwo");

            Constructor c1 = PersonTwo.class.getConstructor();
            PersonTwo p1 = (PersonTwo) c1.newInstance();
            System.out.println("Name: " + p1.getName());
            System.out.println("UID: " + p1.getUid());

            Constructor c2 = PersonTwo.class.getConstructor(String.class);
            PersonTwo p2 = (PersonTwo) c2.newInstance("James Gunn");
            System.out.println("Name: " + p2.getName());
            System.out.println("UID: " + p2.getUid());

            Constructor c3 = PersonTwo.class.getConstructor(String.class, Integer.class);
            PersonTwo p3 = (PersonTwo) c3.newInstance("Mark Brown", 103);
            System.out.println("Name: " + p3.getName());
            System.out.println("UID: " + p3.getUid());

        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException |
                 InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

class AL implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class BL extends AL{
    public static void main(String[] args) throws CloneNotSupportedException {
        BL bl = new BL();
        Object bl1 = bl.clone();
        
    }
}
