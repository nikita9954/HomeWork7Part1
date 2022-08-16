import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Triangle triangle=new Triangle();
        triangle.setRadius(scanner.nextInt());
        triangle.getRadius();
        triangle.setFirstSide(scanner.nextInt());
        triangle.setSecondSide(scanner.nextInt());
        triangle.setThirdSide(scanner.nextInt());
        triangle.getFirstSide();
        triangle.getSecondSide();
        triangle.getThirdSide();
        triangle.findSquareTringle(3);   площадь треугольника
        triangle.findPerimeter();*/     // периметр треугольника
       /* Rectangle rectangle=new Rectangle();
        rectangle.setLenght(scanner.nextInt());
        rectangle.setWidth(scanner.nextInt());
        rectangle.getLenght();
        rectangle.getWidth();
        rectangle.findPerimeter();
        rectangle.findSquare();*/
        /*Circle circle=new Circle();
        circle.setRadius(scanner.nextInt());
        circle.setP(3);
        circle.getRadius();
        circle.getP();
        circle.findPerimetr();
        circle.findSquare();*/

        Form Form[] = new Form[5];
        for (int i = 0; i < 5; i++) {
            Form[0] = new Triangle() {
                @Override
                void findPerimeter() {
                    super.findPerimeter();
                }

            };
            Form[1] = new Circle() {
                @Override
                void findPerimetr() {
                    super.findPerimetr();
                }
            };
            Form[2] = new Rectangle() {
                @Override
                void findPerimeter() {
                    super.findPerimeter();
                }
            };
            Form[3] = new Triangle() {
                @Override
                void findPerimeter() {
                    super.findPerimeter();
                }
            };
            Form[4] = new Triangle() {
                @Override
                void findPerimeter() {
                    super.findPerimeter();
                }
            };
        }
    }
}




