/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themycircleandmypointclasses;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class MyPoint {
    
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }
    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int[] getXY() {
        int[] a = {x,y};
        return a;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }
    
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((another.getX() - this.x), 2) + Math.pow((another.getY() - this.y), 2));
    }
    
    public double distance() {
        return Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
    }
}
