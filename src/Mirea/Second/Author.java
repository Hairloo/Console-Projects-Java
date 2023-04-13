package Mirea.Second;

class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Ilya", "yrufiruiogfioh@gmail.com", 'M');
        System.out.println(author);
    }
}
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        if(gender == 'M'){
            return name + " (m) at " + email;
        }
        if(gender == 'F'){
            return name + " (ms) at " + email;
        }
        else {
            return name + " (unk) at " + email;
        }
    }
}
