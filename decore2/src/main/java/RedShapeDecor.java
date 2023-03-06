public class RedShapeDecor extends ShapeDecorator{
    public RedShapeDecor(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border color: Red");
    }
}