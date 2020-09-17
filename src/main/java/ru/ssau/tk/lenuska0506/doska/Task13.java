package ru.ssau.tk.lenuska0506.doska;public class Task13 {
}

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


}


class Points {
    private Points ( ) {

    }

    public static Point sum(Point x, Point y) {
        Point z = new Point(x.x + y.x, x.y + y.y, x.z + y.z);
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
}