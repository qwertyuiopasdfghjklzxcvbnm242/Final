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
public class boss extends Tester{
    private coord c;
    public int x,y;
    private int age;
    private String name;
    private PApplet app;
    private PImage image;
    private int hp;
    public boss(PApplet p, coord c, String imagePath, int hp){
        super(p, c.getX(), c.getY(), imagePath);
        this.hp = hp;
    }
    
    public void hit(){
        hp--;
    }

    
}
