package com.foxmula.Assignment_1;

class Quadrilateral
{
    int x1, x2, x3, x4, y1, y2, y3, y4;
    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4 )
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
        this.x4=x4;
        this.y4=y4;
    }
}
class Square extends Quadrilateral
{
    Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    double area()
    {
        double d = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d*d;
    }
}
class Rectangle extends Quadrilateral
{
    Rectangle( int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    double area()
    {
        double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double d2=(double)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return d1*d2;
    }
}

class Trapezoid extends Quadrilateral
{
    private final int height;
    Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height)
    {
        super(x1, y1, x2, y2, x3, y3 ,x4, y4);
        this.height = height;
    }
    double area()
    {
        double d1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double d2 = (double)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        return (double)((d1+d2)*height)/2;
    }
}

class Parallelogram extends Quadrilateral
{
    private final int height;
    Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height)
    {
        super(x1, y1, x2, y2, x3, y3, x4 ,y4);
        this.height = height;
    }
    double area()
    {
        double d1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d1*height;
    }
}
class Quadrilateral_area
{
    public static void main(String []args)
    {
        Square sq=new Square(2,1,7,9,2,2,1,3);
        System.out.println("Area Of The Square  " + sq.area());

        Rectangle rec = new Rectangle(1,4,1,1,1,3,2,6);
        System.out.println("Area Of The Rectangle  " + rec.area());

        Parallelogram p = new Parallelogram(1,2,2,1,5,2,0,2,8);
        System.out.println("Area Of The Parallelogram  " + p.area());

        Trapezoid t = new Trapezoid(2,2,2,5,3,2,1,3,8);
        System.out.println("Area Of The Trapezoid  " + t.area());
    }
}