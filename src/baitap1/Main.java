package baitap1;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Resizeable-------------------");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.6);
        shapes[1] = new Rectangle();
        shapes[2] = new Square(3.5, "indigo", false);

        System.out.println("resizeable:");
        for (Shape sh : shapes) {
            if(sh instanceof Circle){
                System.out.println(sh);
            ((Circle)sh).resize(Math.random());
            System.out.println(sh);
        }
    }


        System.out.println("After-resizeable:");
        for (Shape sh : shapes) {
            System.out.println(sh);
        }

    }
}
