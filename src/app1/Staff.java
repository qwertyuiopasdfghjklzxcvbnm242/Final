/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;

/**
 *
 * @author 242353497
 */

import processing.core.PApplet;
import processing.core.PImage;


/**
 *
 * @author 242353497
 */
public class Staff extends Tester{
    // Declare variables
    public int x,y;

    private PApplet app;
    private PImage image;

    
    // Constructor 
    public Staff(PApplet p, int x , int y, String imagePath){
        super(p, x, y, imagePath);
    }
    /*
    * this method sets x
    * @param x
    */
    public void setX(int x){
        this.x = x;
    }
    /*
    * this method sets y
    * @param y
    */
    public void setY(int y){
        this.y = y;
    }
    /*
    * This method chases mc
    * @ param dx
    * @ param dy
    */
    @Override
    public void chase(int dx, int dy){
        if (x > dx+100){
            move(0,-5);
        } else if (x < dx+100){
            move(0,5);
        }
        if (y > dy){
            move(-5,0);
        } else if (y < dy){
            move(5,0);
        }  
    }
}

