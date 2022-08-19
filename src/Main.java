public class Main {
    Triangle triangle = new Triangle();
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Form[] form = new Form[5];
        for (int i = 0; i < form.length - 1; i++) {
            {form[i] = new Triangle();
                triangle.findPerimeter();}
            {form[i++]=new Circle();
                circle.findPerimetr();}
            {form[i++]=new Rectangle();
                rectangle.findPerimeter();}
            {form[i++]=new Rectangle();
                rectangle.findPerimeter();}
            {form[i++]=new Rectangle();
                rectangle.findPerimeter();}
            System.out.println(circle.perimetr+triangle.perimeter+ rectangle.perimeter*3);
        }

    }
}





