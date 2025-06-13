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
public class Demon extends Tester{
    // Declare variables
    public int x,y;
    private int age;
    private String name;
    private PApplet app;
    private PImage image;
    private int hp;

    
    // Constructure
    public Demon(PApplet p, int x , int y, String imagePath, int hp){
        super(p, x, y, imagePath);
        this.hp = hp;
    }
    /*
    * this method returns hp
    * @return hp
    */
    public int getHp(){
        return hp;
    }
    /*
    * this method sets hp
    * @param hp
    */
    public void setHp(int hp){
        this.hp = hp;
    }
    /*
    * this method reduces hp
    */
    public void hit(){
        hp--;
    }

    
    
    
    
    
}
