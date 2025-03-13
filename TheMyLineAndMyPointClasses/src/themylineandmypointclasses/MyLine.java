/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themylineandmypointclasses;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class MyLine {
    
    private MyPoint begin;
    private MyPoint end;
    
    public MyLine() {
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }
    
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }
    
    public int[] getBeginXY() {
        int[] a = {begin.getX(), begin.getY()};
        return a; 
    }
    
    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }
    
    public int[] getEndXY() {
        int[] a = {end.getX(), end.getY()};
        return a; 
    }
    
    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }
    
    public double getLength() {
        return begin.distance(end);
    }
    
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    @Override
    public String toString() {
        return "MyLine[" + "begin = " + begin.toString() + ", end = " + end.toString() + "]";
    }
    
    
    
}
