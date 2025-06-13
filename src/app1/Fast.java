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
public class Fast extends Demon {
    // Declare varaibles
    
    public int x,y;
    private int age;
    private String name;
    private PApplet app;
    private PImage image;
    private int hp;
    
    
    // Constructor
    public Fast(PApplet p, int x , int y, String imagePath, int hp){
        super(p, x, y, imagePath, hp);
        this.hp = hp;
    }
}
