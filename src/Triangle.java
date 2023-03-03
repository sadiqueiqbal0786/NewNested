public class Triangle implements Triang{
    protected int h;
    protected int b;
    Triangle(int h, int b){
        this.h=h;
        this.b=b;
    }
    @Override
    public int area() {
        return (int) (0.5*b*h);
    }

    @Override
    public int perimeter() {
        return 0;
    }
}
