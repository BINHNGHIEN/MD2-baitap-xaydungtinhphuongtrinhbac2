import java.util.Scanner;
public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){};

    public QuadraticEquation(double a, double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }

    public void setA(double a){
        this.a =a;
    }

    public void setB(double b){
        this.b =b;
    }

    public void setC(double c){
        this.c =c;
    }

    public double getA() { return a; }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }



    public double  getDiscriminant(){
        double delta= Math.pow(this.b,2)-4*this.a*this.c;
        return delta;
    }


    public double getRoot1(){
        double r1;
        r1 = (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        return r1;
    }


    public double getRoot2(){
        double r2;
        r2 = (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        return r2;
    }

    public String toString() {
        if (this.getDiscriminant() < 0) {
            return "The equation has no roots";
        } else if (this.getDiscriminant() == 0) {
            return "The equation has 2 roots r1 = r2 = " + this.getRoot1();
        } else {
            return "The equation has 2 roots r1 = " + this.getRoot1() + " , r2 = " + this.getRoot2();
        }
    }
}





