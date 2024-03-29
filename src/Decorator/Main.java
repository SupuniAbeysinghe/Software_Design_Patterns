package Decorator;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape rectangleWithBorder = new BorderDecorator(rectangle);
        Shape rectangleWithBorderAndColor = new ColorDecorator(rectangleWithBorder);
        rectangleWithBorder.draw();

        rectangleWithBorderAndColor.draw();

        Shape circle = new Circle();
        Shape circleWithBorder = new BorderDecorator(circle);
        circleWithBorder.draw();



//        Shape circle = new Circle();
//        circle.draw();
    }
}
