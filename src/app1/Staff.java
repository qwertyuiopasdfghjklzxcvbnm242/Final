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
    public int x,y;

    private PApplet app;
    private PImage image;

    
    
    public Staff(PApplet p, int x , int y, String imagePath){
        super(p, x, y, imagePath);
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    
}

