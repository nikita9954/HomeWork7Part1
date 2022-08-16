public class Triangle extends Form {
    private int radius;
    private int p;
    private int firstSide=30;
    private int secondSide=15;
    private int thirdSide=10;
    private int squareTriangle;
    private int perimeter;


    public int getRadius() {
        System.out.println("Значение радиуса равно "+ radius);
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getFirstSide() {
        System.out.println(" Значение  первой стороны " + firstSide);
        return firstSide;

    }

    public int getSecondSide() {
        System.out.println(" Значение  второй стороны "+ secondSide);
        return secondSide;
    }

    public int getThirdSide() {
        System.out.println(" Значение  третьей стороны "+ thirdSide);
        return thirdSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }
    void findSquareTringle(int p){
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
