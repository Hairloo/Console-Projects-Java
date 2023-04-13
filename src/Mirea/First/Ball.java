package Mirea.First;

public class Ball {
    private int weight;
    private String brand;

    public Ball(String brand, int weight){
        this.brand = brand;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void jump(){
        System.out.println("Прыгнул");
    }
    public void destroy(){
        System.out.println("Разорвался");
    }

    @Override
    public String toString() {
        return "Ball have brand: " + brand + ", weight: " + weight;
    }
}

class TestBall{
    public static void main(String[] args) {
        Ball ball = new Ball("Nike", 18);
        System.out.println(ball.toString());
    }
}
