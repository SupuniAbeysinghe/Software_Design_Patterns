package Decorator;

public class ColorDecorator extends ShapeDecorator {
    public ColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();

        System.out.println("Adding colour to the shape");
    }
}
