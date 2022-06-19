package ua.ithillel.java;

public class Main {

    public static void main(String[] args) {

        Square squareFirst = new Square();
        squareFirst.color = "Blue";
        squareFirst.sides = 4;
        squareFirst.sideLength = 4;
        squareFirst.perimeter = squareFirst.sides * squareFirst.sideLength;
        squareFirst.area = squareFirst.sideLength * squareFirst.sideLength;
        squareFirst.itEqual = squareFirst.perimeter == squareFirst.area;

        System.out.println("\n\tTask first Square:");
        System.out.println("\nSquare color = " + squareFirst.color);
        System.out.println("Square sides = " + squareFirst.sides);
        System.out.println("Side length = " + squareFirst.sideLength);
        System.out.println("Square perimeter = " + squareFirst.perimeter);
        System.out.println("Square area = " + squareFirst.area);
        System.out.println("Is the perimeter equal to the area? " + squareFirst.itEqual);
        System.out.println(squareFirst.perimeter);

        int a = 2;
        int b = 4;
        int c = a + a + a + a;
        int d = a * a;
        boolean e = c == d;

        System.out.println("\n\tVariable Two:");
        System.out.println("\nLength = " + a);
        System.out.println("Sides = " + b);
        System.out.println("Perimeter = " + c);
        System.out.println("Square = " + d);
        System.out.println("Is the perimeter equal to the area? " + e);

        byte b1 = 127;
        short s = b1;
        int i = s;
        long l = i;

        System.out.println("\n\tTask two Transformation:");
        System.out.println("\nByte = " + b1);
        System.out.println("Short = " + s);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);

        int z = 160_000;
        double x = z;

        System.out.println("\nInt = " + z);
        System.out.println("Double = " + x);

        short s1 = 30_000;
        float f1 = s1;
        double d1 = f1;

        System.out.println("\nShort s1 = " + s1);
        System.out.println("Float f1 = " + f1);
        System.out.println("Double d1 = " + d1);

        char ch = '9';
        int in = ch - 48;

        System.out.println("\nChar = " + ch);
        System.out.println("Char into int = " + in);

        int a2 = Integer.MAX_VALUE;
        float b2 = a2;

        System.out.println("\n\tTask three loss of precision:");
        System.out.println("\nInt a2 = " + a2);
        System.out.println("Float b2 = " + b2);

        byte bt = Byte.MAX_VALUE;
        bt++;

        byte by = Byte.MIN_VALUE;
        --by;

        System.out.println("\n\tTask four Mantissa");
        System.out.println("\nMax value byte = 127 and Min value = -128");
        System.out.println("Incrementation = " + bt);
        System.out.println("Decrementation = " + by);

        int k = 16783;
        double m = 1.83;
        double p = k * m - (560 + k / m);
        double o = k % m;
        boolean test1 = k <= m;
        boolean test2 = m >= k;
        double t = k *= m;
        double t1 = k /= m;
        
        System.out.println("\nTest: " + p);
        System.out.println("integer division " + o);
        System.out.println("Boolean test = " + test1);
        System.out.println("Boolean test 2 = " + test2);
        System.out.println("Operand multiplication = " + t);
        System.out.println("Operand division = " + t1);

    }
}
