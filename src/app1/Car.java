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
public class Car {
    public int x,y;
    private int age;
    private String name;
    private PApplet app;
    private PImage image;
    private int speed;
    public Car(PApplet p, int x , int y, int speed, String imagePath){
        this.app = p;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.image = app.loadImage(imagePath);
    }
    public void move(int dy, int dx){
        x += dx;
        y += dy;
    }
    public void draw(){
        app.image(image,x,y);
    }
    public boolean isCollidingWith(Car other){
        boolean isLeftOfOtherRight = x < other.x + other.image.pixelWidth;
        boolean isRightOfOtherLeft = x + image.pixelWidth > other.x;
        boolean isAboveOtherBottom = y < other.y + other.image.pixelHeight;
        boolean isBelowOtherTop = y + image.pixelHeight > other.y;
        
        return isLeftOfOtherRight && isRightOfOtherLeft
                && isAboveOtherBottom && isBelowOtherTop;
    }
    public boolean isClicked(int mouseX, int mouseY){
        int centerX = x +(image.pixelWidth/2);
        int centerY = y +(image.pixelHeight/2);
        float d = PApplet.dist(mouseX, mouseY, centerX, centerY);

        return d< 16;
    }
    public void displayInfo(PApplet p){
        app.fill(0);
        app.text("ASD"+ speed, x, y - 20);
    }
}
