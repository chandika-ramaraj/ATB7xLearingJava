package ex_20072024;

public class TriangleClassifier {

    public static void main(String[] args) {
        int a = 10, b = 1, c = 10;
        if (a == b && b == c )
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || c == a )
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
    }


