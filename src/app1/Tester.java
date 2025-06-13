/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author 242353497
 */
public class Tester {
    // Declare variables
    private static final int SPEED = 7;
    public int x,y;
    private PApplet app;
    public PImage image;
    // Constructor
    public Tester(PApplet p, int x , int y, String imagePath){
        this.app = p;
        this.x = x;
        this.y = y;
        this.image = app.loadImage(imagePath);
    }
    /*
    * This method sets imagepath
    * @param imagepath
    */
    public void setImagePath(String imagePath){
        this.image = app.loadImage(imagePath);
    }
    /*
    * this method draws
    */
    public void draw(){
        app.image(image,x,y);
    }
    /*
    * this method moves mc
    * @param dy
    * @param dx
    */
    public void move(int dy, int dx){
        x += dx;
        y += dy;
    }
    /*
    * Collision 
    * @param other
    */
    public boolean isCollidingWith(Tester other){
        int centerX = x +(image.pixelWidth/2);
        int centerY = y +(image.pixelHeight/2);
        int otherCenterX = other.x + (other.image.pixelWidth/2);
        int otherCenterY = other.y + (other.image.pixelHeight/2);
        float d = PApplet.dist(otherCenterX, otherCenterY, centerX, centerY);
        return d < 32;
    }
    /*
    * Collision square
    * @param other
    */
    public boolean isCollidingWith2(Tester other){
        boolean isLeftOfOtherRight = x < other.x + other.image.pixelWidth;
        boolean isRightOfOtherLeft = x + image.pixelWidth > other.x;
        boolean isAboveOtherBottom = y < other.y + other.image.pixelHeight;
        boolean isBelowOtherTop = y + image.pixelHeight > other.y;
        
        return isLeftOfOtherRight && isRightOfOtherLeft
                && isAboveOtherBottom && isBelowOtherTop;
    }
    /*
    * gets x
    * @param x
    */
    public int getX(){
        return x;
    }
    /*
    * gets y
    * @param x
    */
    public int getY(){
        return y;
    }
    /*
    * Chases mc
    * @param dx
    * @param dy
    */
    public void chase (int dx, int dy){
        if (x > dx+40){
            move(0,-1);
        } else if (x < dx+40){
            move(0,1);
        }
        if (y > dy){
            move(-1,0);
        } else if (y < dy){
            move(1,0);
        }  
    }
    /*
    * Chases mc
    * @param dx
    * @param dy
    */
    public void chase2 (int dx, int dy){
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
    /*
    * Chases mc
    * @param dx
    * @param dy
    */
    public void chase3 (int dx, int dy){
        if (x > dx+40){
            move(0,-7);
        } else if (x < dx+40){
            move(0,SPEED);
        }
        if (y > dy){
            move(-7,0);
        } else if (y < dy){
            move(SPEED,0);
        }  
    }
    /*
    * Chases mc
    * @param dx
    * @param dy
    */
    public void chase1_2 (int dx, int dy){
        if (x > dx-20){
            move(0,-1);
        } else if (x < dx-20){
            move(0,1);
        }
        if (y > dy-20){
            move(-1,0);
        } else if (y < dy-20){
            move(1,0);
        }  
    }
    
    
    /*
    * kills mob
    * @param dx
    * @param dy
    */
    public void die (int dx, int dy){
        if (x > dx+100){
            move(0,-1000);
        } else if (x < dx+100){
            move(0,1000);
        }
        if (y > dy){
            move(-1000,0);
        } else if (y < dy){
            move(1000,0);
        }  
    }

}
