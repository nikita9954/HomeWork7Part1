public class Rectangle extends Form {
    private int lenght = 5;
    private int width = 10;
    public int perimeter;
    private int square;
    void findPerimeter() {
        perimeter = 0;
        perimeter = lenght * 2 + width * 2;
        System.out.println("Периметр прямоугольника равен сумме его сторон " + perimeter);
    }
    void findSquare() {
        square = 0;
        square = lenght * width;
        System.out.println("Площадь прямоугольник равна ширине умноженной на длинну  " + square);
    }
}


