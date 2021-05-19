package Interview.DesignPatterns;

public class FactoryPatternEg {
    public static void main(String[] args) {
        Shape f1 = FactoryMethodImpl.getInstance("Square");
        System.out.println(f1.area(new int[]{4, 4}));

        Shape f2 = FactoryMethodImpl.getInstance("Rectangle");
        System.out.println(f2.area(new int[]{6, 4}));
    }
}

class FactoryMethodImpl {
    public static Shape getInstance( String type) {
        if(type.equals("Square")) {
            return new Square();
        }
        if(type.equals("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

abstract class Shape{
    abstract double area(int... a);
    void printArea(double res) {
        System.out.println(res);
    }
}

class Square extends Shape {

    @Override
    double area(int... inp) {
        int out = 1;
        for(int val: inp) {
            out *= val;
        }
        return out;
    }
}

class Rectangle extends  Shape {

    @Override
    double area(int... inp) {
        int out = 1;
        for(int val: inp) {
            out *= val;
        }
        return out;
    }
}