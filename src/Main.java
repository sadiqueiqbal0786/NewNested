import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int a= sc.nextInt();
        System.out.println("Enter the breath");
        int b= sc.nextInt();
        System.out.println("Enter the num");
        int num = sc.nextInt();
        Triangle t= new Triangle(a,b);
        Rectangle.ABC R = new Rectangle.ABC(a,b);
        RevNum r = new RevNum(num);
        System.out.println( t.area());
        System.out.println(R.area()+" "+R.perimeter());
        System.out.println(r.reverse());
    }
}