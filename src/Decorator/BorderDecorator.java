package Decorator;

public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();

        System.out.println("Adding border to the shape");
    }
}
