/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;
import processing.core.PApplet;

public class MySketch extends PApplet {
  private Tester test1;
  private Tester hpBar;
  private Tester testing;
  private Tester stage;
  private Demon small;
  private Demon small2;
  private Demon small3;
  private Demon small4;
  private Demon small5;
  private Demon small6;
  private Demon small7;

  private Staff staff;
              
  private boolean left = false;
  private boolean right = false;
  private boolean down = false;
  private boolean up = false;
  private int staffX;
  private int staffY;
  private int monkX;
  private int monkY;
  private int stageNum = 0;
  private int smallCount = 0;
  private int hpAllowCount = 0;
  private int hpHitAllowCount = 0;
  private int hpCount = 0;
  private int count = 0;
  private int staffCount = 0;
  private int idleCount = 0;
  private int bananaCount = 0;
  private int deathCount = 0;
  private boolean banana = false;
  public void settings() {
    size(1500, 800);
  }
  public void setup() {
    background(255);
    test1 = new Tester(this, 200, 200,"images/idle.png");
    hpBar = new Tester(this, 5, 5, "images/hp8.png");
    testing = new Tester(this, 600, 100, "images/demon1.png");
    small = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small2 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small3 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small4 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small5 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small6 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    staff = new Staff(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/staff5.png");
    stage = new Tester(this, 600, 50, "images/stageN1.png");
  }
  public void draw() {
    
    background(240,255,255);
    stage.draw();
    staff.chase2(staffX, staffY);
    staff.draw();
    test1.draw();
    hpBar.draw();
    small.draw();
    small2.draw();
    small3.draw();
    small4.draw();
    small5.draw();
    small6.draw();
    staffX = test1.getX();
    staffY = test1.getY();

    
    
    
    
    
    if(small.getHp() > 0){
        smallCount++;
        monkX = test1.getX();
        monkY = test1.getY();
        small.chase(monkX,monkY);
        if (smallCount <= 20) small.setImagePath("images/small1.png");
        if (smallCount <= 50 && smallCount > 20) small.setImagePath("images/small2.png");
        if (smallCount > 40) smallCount = 0;
    }
    if(small2.getHp() > 0){
        smallCount++;
        monkX = test1.getX();
        monkY = test1.getY();
        small2.chase(monkX,monkY);
        if (smallCount <= 20) small2.setImagePath("images/small1.png");
        if (smallCount <= 50 && smallCount > 20) small2.setImagePath("images/small2.png");
        if (smallCount > 40) smallCount = 0;
    }
    if(small3.getHp() > 0){
        smallCount++;
        monkX = test1.getX();
        monkY = test1.getY();
        small3.chase(monkX,monkY);
        if (smallCount <= 20) small3.setImagePath("images/small1.png");
        if (smallCount <= 50 && smallCount > 20) small3.setImagePath("images/small2.png");
        if (smallCount > 40) smallCount = 0;
    }
    if(small3.getHp() > 0){
        smallCount++;
        monkX = test1.getX();
        monkY = test1.getY();
        small3.chase(monkX,monkY);
        if (smallCount <= 20) small3.setImagePath("images/small1.png");
        if (smallCount <= 50 && smallCount > 20) small3.setImagePath("images/small2.png");
        if (smallCount > 40) smallCount = 0;
    }
    if(small4.getHp() > 0){
        smallCount++;
        monkX = test1.getX();
        monkY = test1.getY();
        small4.chase(monkX,monkY);
        if (smallCount <= 20) small4.setImagePath("images/small1.png");
        if (smallCount <= 50 && smallCount > 20) small4.setImagePath("images/small2.png");
        if (smallCount > 40) smallCount = 0;
    }
    if(small5.getHp() > 0){
        smallCount++;
        monkX = test1.getX();
        monkY = test1.getY();
        small5.chase(monkX,monkY);
        if (smallCount <= 20) small5.setImagePath("images/small1.png");
        if (smallCount <= 50 && smallCount > 20) small5.setImagePath("images/small2.png");
        if (smallCount > 40) smallCount = 0;
    }
    if(small6.getHp() > 0){
        smallCount++;
        monkX = test1.getX();
        monkY = test1.getY();
        small6.chase(monkX,monkY);
        if (smallCount <= 20) small6.setImagePath("images/small1.png");
        if (smallCount <= 50 && smallCount > 20) small6.setImagePath("images/small2.png");
        if (smallCount > 40) smallCount = 0;
    }
    
        if (hpCount == 1){
            hpBar.setImagePath("images/7hp.png");
        } else if (hpCount ==2) {
            hpBar.setImagePath("images/6hp.png");
        } else if (hpCount ==3) {
            hpBar.setImagePath("images/5hp.png");
        } else if (hpCount ==4) {
            hpBar.setImagePath("images/4hp.png");
        } else if (hpCount ==5) {
            hpBar.setImagePath("images/3hp.png");
        } else if (hpCount ==6) {
            hpBar.setImagePath("images/2hp.png");
        } else if (hpCount ==7) {
            hpBar.setImagePath("images/1hp.png");
        } else if (hpCount ==8) {
            hpBar.setImagePath("images/0hp.png");
        } else if (hpCount == 0){
            hpBar.setImagePath("images/hp8.png");
        }
    if (keyPressed) {
        
        count++;
        bananaCount++;
        hpAllowCount++;
        hpHitAllowCount++;
        staffCount++;
        if (keyCode == LEFT) {
            test1.move(0, -5);
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0;
            idleCount = 0;
        } else if (keyCode == RIGHT) {
            test1.move(0, 5);
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0;
            idleCount = 0;
        } else if (keyCode == UP) {
            test1.move(-5, 0);
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0;
            idleCount = 0;
        } else if (keyCode == DOWN) {
            test1.move(5, 0);
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0;
            idleCount = 0;
        } else if (keyCode == SHIFT){
            if (bananaCount <= 5) test1.setImagePath("images/b1.png");
            if (bananaCount <= 10 && bananaCount > 5) test1.setImagePath("images/b2.png");
            if (bananaCount <= 15 && bananaCount > 10) test1.setImagePath("images/b3.png");
            if (bananaCount <= 20 && bananaCount > 15) test1.setImagePath("images/b4.png");
            if (bananaCount <= 25 && bananaCount > 20) test1.setImagePath("images/b5.png");
            if (bananaCount <= 30 && bananaCount > 25) test1.setImagePath("images/b6.png");
            if (bananaCount <= 35 && bananaCount > 30) test1.setImagePath("images/b7.png");
            if (bananaCount <= 40 && bananaCount > 35) test1.setImagePath("images/b8.png");
            if (bananaCount <= 45 && bananaCount > 40) test1.setImagePath("images/b9.png");
            if (bananaCount <= 50 && bananaCount > 45) test1.setImagePath("images/b10.png");
            if (bananaCount <= 55 && bananaCount > 50) test1.setImagePath("images/b11.png");
            if (bananaCount <= 60 && bananaCount > 55) test1.setImagePath("images/b12.png");
            if (bananaCount <= 65 && bananaCount > 60) test1.setImagePath("images/b13.png");
            if (bananaCount <= 70 && bananaCount > 65) test1.setImagePath("images/b14.png");
            if (bananaCount <= 75 && bananaCount > 70) test1.setImagePath("images/b15.png");
            if (bananaCount <= 80 && bananaCount > 75) test1.setImagePath("images/b16.png");
            if (bananaCount <= 85 && bananaCount > 80) test1.setImagePath("images/b17.png");
            if (bananaCount <= 90 && bananaCount > 85) test1.setImagePath("images/b18.png");
            if (bananaCount <= 95 && bananaCount > 90) test1.setImagePath("images/b19.png");
            if (bananaCount <= 100 && bananaCount > 95) test1.setImagePath("images/b20.png");
            if (bananaCount <= 105 && bananaCount > 100) test1.setImagePath("images/b21.png");
            if (bananaCount <= 110 && bananaCount > 105) test1.setImagePath("images/b22.png");
            if (bananaCount <= 115 && bananaCount > 110) test1.setImagePath("images/b23.png");
            if (bananaCount <= 120 && bananaCount > 115) test1.setImagePath("images/b24.png");
            if (bananaCount <= 125 && bananaCount > 120) test1.setImagePath("images/b25.png");
            if (bananaCount <= 130 && bananaCount > 125) test1.setImagePath("images/b26.png");
            if (bananaCount <= 140 && bananaCount > 130) {
                test1.setImagePath("images/b27.png");
                if (hpCount > 0 && hpCount < 8 && bananaCount == 135) {
                    hpCount--;
                    hpAllowCount = 0;
                } 
            }
            if (bananaCount > 140) {
                bananaCount = 0;
            }
            idleCount = 0; 
        } else if (keyCode == CONTROL){      
            if (staffCount <= 5) staff.setImagePath("images/staff1.png");
            if (staffCount <= 10 && staffCount > 5) staff.setImagePath("images/staff2.png");
            if (staffCount <= 15 && staffCount > 10) staff.setImagePath("images/staff3.png");
            if (staffCount <= 25 && staffCount > 15) staff.setImagePath("images/staff4.png");
            if (staffCount > 20) staffCount = 0;
            idleCount = 0;
            
            if (staff.isCollidingWith2(small)){
                small.setImagePath("images/smallDeath.png");
                small.setHp(0);
                small.die(9999,9999);
                
            }
            if (staff.isCollidingWith2(small2)){
                small2.setHp(0);
                small2.die(9999,9999);
            }
            if (staff.isCollidingWith2(small3)){
                small3.setHp(0);
                small3.die(9999,9999);
            }
            if (staff.isCollidingWith2(small4)){
                small4.setHp(0);
                small4.die(9999,9999);
            }
            if (staff.isCollidingWith2(small5)){
                small5.setHp(0);
                small5.die(9999,9999);
            }
        }     
        }
    if (small.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small2.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small3.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small4.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small5.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small6.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    

    if (!keyPressed){
        idleCount++;
        staff.setImagePath("images/staff5.png");
        if (idleCount < 40) test1.setImagePath("images/monkeyidlepos1.png");
        if (idleCount < 80 && idleCount > 40) test1.setImagePath("images/monkeyidlepos2.png");
        if (idleCount > 80) idleCount = 0;
        if (idleCount > 10) count = 0; 

    }   
    }


    }//end class

