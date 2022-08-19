public class Circle extends Form {
    private  double p=3.14;
    private int radius=20;
    private double square;
    public double perimetr;
    void findSquare(){
        square=0;
        square=p*(radius*2);
        System.out.println("Площадь круга равна числу пи умноженному на радиус в квадрате "+ square);
    }
    void findPerimetr(){
        perimetr=0;
        perimetr=radius*(p*2);
        System.out.println("Периметр круга равен числа пи умноженному на 2 умноженого на радиус "+perimetr );
    }

}
