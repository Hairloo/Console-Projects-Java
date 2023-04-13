package Tests;

public class Search {
}

interface Searchable { //интерфейс
    boolean matches(String searchTerm);// абстратный метод matches, принимающий слоко, которе будем искать
}

// Универсальный класс поиска
class UniversalSearch<T extends Searchable> {
    private T[] data; // поле, для  хранения массива интерфейсных ссылок (наш массив в котором искать будем)

    public UniversalSearch(T[] data) {
        this.data = data;
    }

    // Метод для выполнения поиска по заданному критерию
    public T search(String searchTerm) {
        for (T item : data) {
            if (item.matches(searchTerm)) {
                return item;
            }
        }
        return null; // Если ничего не найдено
    }

    public static void main(String[] args) {
        // Пример использования
        Searchable[] searchableArray = new Searchable[]{ // массив интерфейсных ссылок
                new Person("John"),
                new Animal("Dog"),
                new Car("Toyota")
        };

        UniversalSearch<Searchable> searcher = new UniversalSearch<>(searchableArray);
        //создание объект универсального класса и передаем конструктору массив
        // Пример поиска человека по имени
        Person resultPerson = (Person) searcher.search("John");
        Animal res = (Animal) searcher.search("dog");

        if (resultPerson != null) {
            System.out.println("Person found: " + resultPerson.getName());
        } else {
            System.out.println("Person not found.");
        }
        if (res != null) {
            System.out.println("Animal found: " + res.getSpecies());

        } else {
            System.out.println("Animal not found.");
        }
    }
}


class Person implements Searchable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean matches(String searchTerm) {
        return name.equalsIgnoreCase(searchTerm);
    }
}

class Animal implements Searchable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
    @Override
    public boolean matches(String searchTerm) {
        return species.equalsIgnoreCase(searchTerm);
    }
}

class Car implements Searchable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return  model;
    }
    @Override
    public boolean matches(String searchTerm) {
        return model.equalsIgnoreCase(searchTerm);
    }
}
