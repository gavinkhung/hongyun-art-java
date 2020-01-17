/**
 * Carpet.java
 * This program creates a sierpinski square using recursion. In each method call,
 * the new squares have a length which is one third the pervious and they
 * are positioned about the square.
 *
 * @author Gavin Hung
 * @version 1.0
 * @since 1/16/2020
 */

import java.awt.Color;

public class Carpet {
    
    /**
     *  This is the main method that starts the program.
     */
    public static void main(String[] args){
        int temp = 6;
        if(args.length>0){
            temp = Integer.parseInt(args[0]);
        }
        Carpet recursion = new Carpet();
        recursion.draw(temp);
    }
    
    /**
     *  This is the that starts the recursive call.
     */
    public void draw(int n){
        StdDraw.setCanvasSize(700, 700);
        double xc = 0.5, yc = 0.5, length = 1.0/3;
        sierpinski(n, length, xc, yc);
    }
    
    /**
     *  This is the recursive method calls sierpinski again with updated
     *  xs, ys, and lengths
     */
    public void sierpinski(int n, double length, double xc, double yc){
        
        if(n==0){
            return;
        }
        drawSquare(length, xc, yc);
        sierpinski(n-1, length/3, xc+length, yc+length);
        sierpinski(n-1, length/3, xc, yc+length);
        sierpinski(n-1, length/3, xc-length, yc+length);
        sierpinski(n-1, length/3, xc-length, yc);
        sierpinski(n-1, length/3, xc-length, yc-length);
        sierpinski(n-1, length/3, xc, yc-length);
        sierpinski(n-1, length/3, xc+length, yc-length);
        sierpinski(n-1, length/3, xc+length, yc);
    }
    
    /**
     *  This method draws the square.
     */
    public void drawSquare(double length, double xc, double yc){
        StdDraw.setPenColor(new Color((int)(255*xc), (int)(255*yc), (int)(255*yc), 100+(int)(156*yc)));
        StdDraw.filledRectangle(xc, yc, length/2, length/2);
    }
    
}