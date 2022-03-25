import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        QuadraticEquation result = new QuadraticEquation();



        result.setA(10);
        result.setB(2);
        result.setC(20);

        System.out.println(result.getRoot1());
        System.out.println(result.getRoot2());



    }
}
