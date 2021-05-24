package Rectangle;

import java.util.Scanner;

public class Main {
    public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        float lengh = input_lenght();
        float width = input_width();

        Rectangle rectangle = new Rectangle(lengh, width);

        System.out.println(rectangle.toString());
        System.out.printf("Area : %.2f\n", rectangle.area());
        System.out.printf("circumference : %.2f\n", rectangle.circumference());

    }

    public static float input_lenght(){
        System.out.println("Input lenght rectangle: ");
        while (true){
            try {
                float lenght = Float.parseFloat(scanner.nextLine());
                return lenght;
            }catch (NumberFormatException ex){
                System.out.println("Anvalid! Please input lenght again");
            }
        }
    }

    public static float input_width(){
        System.out.println("Input width rectangle: ");
        while (true){
            try {
                float width = Float.parseFloat(scanner.nextLine());
                return width;
            }catch (NumberFormatException ex){
                System.out.println("Anvalid! Please input width again");
            }
        }
    }
}
