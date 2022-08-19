public class Triangle extends Form {
    private int radius=13;
    private double p=3.14;
    private int firstSide=30;
    private int secondSide=15;
    private int thirdSide=10;
    private double squareTriangle;
    public int perimeter;
    void findSquareTringle(){
        squareTriangle=0;
        squareTriangle=radius*radius*p;
        System.out.println("Площадь треугольника равна радиусу в квадрате умноженному на число пи " + squareTriangle);
    }
    void findPerimeter(){
        perimeter=0;
        perimeter=firstSide+secondSide+thirdSide;
        System.out.println("Периметр треугольника равен сумме его сторон "+perimeter);
    }
}
