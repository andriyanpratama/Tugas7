package shape;

/**
 *
 * @author Andriyan
 */
public class Circle extends Shape {
    @Override
void resize()
{
System.out.println("Circle Resize");
}
@Override
 void drawShape()
{
System.out.println("Circle Shape");
}
public void posisition()
{
System.out.println(this.x+ '.'+ this.y);
}
    @Override
    public int getArea() {
    return this.getArea();
    }
    @Override
    public String getName() {
    return this.getName();
    }
}