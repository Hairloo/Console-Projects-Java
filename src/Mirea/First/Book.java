package Mirea.First;

public class Book {
    private int pageCount;
    private String name;
    private String author;
    private boolean isReaded = false;

    public Book(int pageCount, String name, String author) {
        this.pageCount = pageCount;
        this.name = name;
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void read(boolean isReaded){
        this.isReaded = isReaded;
    }

    public boolean isReaded() {
        System.out.println(isReaded ? "Прочитана" : "Не прочитана");
        return isReaded;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isReaded=" + isReaded +
                '}';
    }
}
