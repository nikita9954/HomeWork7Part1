public class Rectangle {
    private int lenght;
    private int width;
    private int perimeter;
    private int square;

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        System.out.println("Значение длинны равно "+ lenght);
        return lenght;
    }

    public int getWidth() {
        System.out.println("Значение ширина равно "+ width);
        return width;
    }
    void findPerimeter() {
        perimeter = 0;
        perimeter = lenght * 2 + width *2;
        System.out.println("Периметр прямоугольника равен сумме его сторон " + perimeter);
    }
    void findSquare(){
        square=0;
        square=lenght*width;
        System.out.println("Площадь прямоугольник равна ширине умноженной на длинну  " + square);

        }
    }


