public class Rectangle{
    public static class ABC implements Triang {
        int l,b;
        ABC(int l,int b){
            this.l=l;
            this.b=b;
        }
        @Override
        public int area() {
            return l*b;
        }

        @Override
        public int perimeter() {
            int p=l+b;
            return 2*p;
        }
    }
}
