package com.foxmula.Assignment_1;

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