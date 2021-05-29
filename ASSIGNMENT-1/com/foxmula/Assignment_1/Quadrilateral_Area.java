package com.foxmula.Assignment_1;

class Quadrilateral_Area
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