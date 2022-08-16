public class Circle extends Form {
    private int p;
    private int radius;
    private int square;
    private int perimetr;

    public void setP(int p) {
        this.p = p;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getP() {
        System.out.println("Значение число пи равно "+ p);
        return p;
    }

    public int getRadius() {
        System.out.println("Значение  радиуса равно  "+ radius);
        return radius;
    }
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
