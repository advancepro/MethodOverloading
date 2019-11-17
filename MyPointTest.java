package sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class MyPointTest {
    private int i;

    @Test
    public void test(){
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());


        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i < points.length; i++);
        {
            points[i] = new MyPoint();
        }
        points[0].x = 10;
        points[0].y = 10;
    }
}