package Samsung;

import java.util.Locale;

public class Vector2D {
    public static int count = 0;
    public double vX, vY;

    public Vector2D(){
        vX = 1;
        vY = 1;
        count++;
    }
    public Vector2D(double vX,double vY){
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D copy){
        this.vX = copy.vX;
        this.vY = copy.vY;
        count++;
    }
    public void print(){
        System.out.println("(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }
    public double length(){
        return Math.sqrt(vX * vX + vY*vY);
    }
    public void add(Vector2D v){
        this.vX = this.vX + v.vX;
        this.vY = this.vY + v.vY;
    }
    public void sub(Vector2D v){
        this.vX = this.vX - v.vX;
        this.vY = this.vY - v.vY;
    }
    public void scale(double scaleFactor){
        this.vX = this.vX * scaleFactor;
        this.vY = this.vY * scaleFactor;
    }
    public void normalized(){
        double inv = 1 / this.length();
        this.vX = this.vX * inv;
        this.vY = this.vY * inv;
    }
    public double dotProduct(Vector2D v){
        return this.vX * v.vX + this.vY * v.vY;
    }
}
