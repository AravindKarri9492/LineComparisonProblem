package com.bridgelabz;

public class LineComparison
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to line Comparison Computation Program");
        int x1=4,x2=5,y1=1,y2=6;
        double length = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        System.out.printf("length of line is = %.2f ",length);
    }
}

