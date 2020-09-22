package ru.ssau.tk.lenuska0506.doska;
import static java.lang.Math.*;

class Main1 {
    public static void main(String[] s) {
        Point o = new Point(1,4,5);
        Point o1 = new Point(2,3,4);

    }
};

class Point {
    public  final double x;
    public  final double y;
    public  final double z;

    public Point (double x1,double y1,double z1) {
        x = x1;
        y = y1;
        z = z1;
    }

    public double length( ){
        double d=sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2) );
        return d ;
    }

}

class Points {
    private Points ( ) {

    }
    public static double scalarProduct(Point x, Point y) {
       double z = x.x * y.x+x.y * y.y+x.z * y.z;
        return z;
    }
    public static Point vectorProduct(Point x, Point y) {
        Point z = new Point(x.y * y.z-y.y * x.z,-x.x * y.z+y.x+y.z,x.x*y.y-y.x*x.y);
        return z;
    }

    public static Point enlarge(Point x, double y) {
        Point z = new Point(x.x * y, x.y * y, x.z * y);
        return z;
    }
    public static Point opposite(Point x) {
        Point z = new Point(x.x * (-1), x.y * (-1), x.z * (-1));
        return z;
    }


    public static Point inverse(Point x) {
        Point z = new Point(1/x.x , 1/x.y , 1/x.z);
        return z;
    }

    public static Point sum(Point x, Point y) {
        Point z = new Point(x.x + y.x,x.y + y.y,x.z + y.z);
        return z;
    }

    public static Point subtract(Point x, Point y) {
        Point z = new Point(x.x - y.x, x.y - y.y, x.z - y.z);
        return z;
    }

    public static Point multiply(Point x, Point y) {
        Point z = new Point(x.x * y.x, x.y * y.y, x.z * y.z);
        return z;
    }

    public static Point divide(Point x, Point y) {
        Point z = new Point(x.x / y.x, x.y / y.y, x.z / y.z);
        return z;
    }

    public static double length(Point x ) {
        return x.length();

    }
}
class Main3 {
    public static void main(String[] s) {
        Point y = new Point(1,3,3);
        Point x = new Point(4,5,6);
        Point z = new Point(9,3,3);
        z=Points.sum(x,y);
        z=Points.subtract(x,y);
        z=Points.multiply(x,y);
        z=Points.divide(x,y);
    }
}
class Main4 {
    public static void main(String[] s) {
        double y = 4;
        Point x = new Point(4, 5, 6);
        Point z = new Point(9, 3, 3);
        z =Points.enlarge(x,y);

            }
}
class Main5 {
    public static void main(String[] s) {
        Point o = new Point(1,4,5);
        double o1 = Points.length(o);
        System.out.println(o1);
    }
};
class Main6 {
    public static void main(String[] s) {
        Point o = new Point(1,4,5);
        Point o1 = Points.inverse(o);
        System.out.println(o1);
    }
};
class Main7 {
    public static void main(String[] s) {
        Point o = new Point(1,4,5);
        Point o1 = Points.opposite(o);
        System.out.println(o1);
    }
};
class Main8 {
    public static void main(String[] s) {
        Point y = new Point(4, 5, 6);
        Point x = new Point(4,5,6);
       double z=Points.scalarProduct(x,y);
        System.out.println(z);
    }
};
