package baitap1;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square(5);

        for(Shape sh : shape){
            if (sh instanceof Circle){
               ;
                ((Circle) sh).resize(Math.random());
                System.out.println(sh);
            } else if (sh instanceof Rectangle) {

                ((Rectangle) sh).resize(Math.random());
                System.out.println("sau khi tăng: "+sh);
            }
        }
    }
}
