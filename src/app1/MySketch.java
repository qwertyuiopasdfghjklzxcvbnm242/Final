/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import processing.core.PApplet;

public class MySketch extends PApplet {
  // Declare variables
  // Stage 1
  private Tester test1;
  private Tester hpBar;
  private Tester testing;
  private Tester stage1;
  private Tester stage2;
  private Tester stage3;
  private Tester stage4;
  private Tester stage5;
  private Demon small;
  private Demon small2;
  private Demon small3;
  private Demon small4;
  private Demon small5;
  private Demon small6;
  private Demon small7;
  private Staff staff;       
  // Stage 2
  private Demon small2_1;
  private Demon small2_2;
  private Demon small2_3;
  private Demon small2_4;
  private Demon small2_5;
  private Demon small2_6;
  private Demon demon2_1;
  // Stage 3
  private Demon demon3_1;
  private Demon demon3_2;
  private Demon demon3_3;
  private Demon demon3_4;
  private Demon demon3_5;
  private Demon demon3_6;
  // Stage 4
  private Demon demon4_1;
  private Demon demon4_2;
  private Demon demon4_3;
  private Demon demon4_4;
  private Demon demon4_5;
  private Demon demon4_6;
  private Demon fast4_1;
  // Stage 5
  private Demon fast5_1;
  private Demon fast5_2;
  private Demon fast5_3;
  private boss Boss5_1;
  // Game materials
  private Tester scriptures; 
  private Tester grat;
  private Tester bud;
  private Tester d1;
  private Tester d2;
  private Tester d3;
  private coord bosscoord;
  private Tester gameOver;
  // Variables
  private boolean left = false;
  private boolean right = false;
  private boolean down = false;
  private boolean up = false;
  private int staffX;
  private int staffY;
  private int monkX;
  private int monkY;
  private int stageNum = -1;
  private int smallDemonCount;
  private int stage2Count;
  private int stage3Count;
  private int stage4Count;
  private int stage5Count;
  private int stage6Count;
  private int smallCount = 0;
  private int hpAllowCount = 0;
  private int hpHitAllowCount = 0;
  private int hpCount = 0;
  private int count = 0;
  private int staffCount = 0;
  private int idleCount = 0;
  private int bananaCount = 0;
  private int deathCount = 0;
  private int tutCount = 0;
  private boolean banana = false;
  public void settings() {
    size(1500, 750); // Set size
  }
  public void setup() {
    // Instantiate 
    background(255);
    test1 = new Tester(this, 200, 600,"images/idle.png");
    hpBar = new Tester(this, 5, 5, "images/hp8.png");
    testing = new Tester(this, 600, 100, "images/demon1.png");
    staff = new Staff(this, 200, 200, "images/staff5.png");
    bosscoord = new coord((int)(Math.random() * 1000), (int)(Math.random() * 1000));
    
    // Stage 1
    small = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png");
    small2 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png");
    small3 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png");
    small4 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png");
    small5 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png");
    small6 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png");

    
    // Stage 2
    small2_1 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small2_2 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small2_3 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small2_4 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small2_5 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    small2_6 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/small1.png", 1);
    demon2_1 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    
    // Stage 3
    demon3_1 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon3_2 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon3_3 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon3_4 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon3_5 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon3_6 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    
    // Stage 4
    demon4_1 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon4_2 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon4_3 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon4_4 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon4_5 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    demon4_6 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/demon1.png", 50);
    fast4_1 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/test1.png", 1);
    
    // Stage 5
    fast5_1 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/fast1.png", 1);
    fast5_2 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/fast1.png", 1);
    fast5_3 = new Demon(this, (int)(Math.random() * 1000), (int)(Math.random() * 1000), "images/fast1.png", 1);
    Boss5_1 = new boss(this, bosscoord , "images/boss1.png", 500);
    
    // Stage 6
    scriptures = new Tester(this, 2000, 200,"images/scroll.png");
    grat = new Tester (this, 450, 50,"images/congrat.png");
    // Game material
    bud = new Tester (this, 450, 200, "images/buddha.png");
    d1 = new Tester (this, 450, 50, "images/d1.png");
    d2 = new Tester (this, 500, 50, "images/d2.png");
    d3 = new Tester (this, 550, 50, "images/d3.png");
    
    // Stages
    stage1 = new Tester(this, 500, 50, "images/stageN1.png");
    stage2 = new Tester(this, 500, 50, "images/stageN2.png");
    stage3 = new Tester(this, 500, 50, "images/stageN3.png");
    stage4 = new Tester(this, 500, 50, "images/stageN4.png");
    stage5 = new Tester(this, 500, 50, "images/stageN5.png");
    gameOver = new Tester(this, 0, 0, "images/tt5.png");
    // File data 
    int lines = countLines("stageFile");
    int [] stageNumCounters = new int [lines];
    String [] stringStageNumCounters = take(lines, "stageFile");
    // Convert to int
    for (int i = 0; i < stringStageNumCounters.length;i++){
        stageNumCounters[i] = Integer.parseInt(stringStageNumCounters[i]);
    }
    // Set values
    smallDemonCount = stageNumCounters[0];
    stage2Count = stageNumCounters[1];
    stage3Count = stageNumCounters[2];
    stage4Count = stageNumCounters[3];
    stage5Count = stageNumCounters[4];
    stage6Count = stageNumCounters[5];
    // Size of file for win count
    int winCount = countLines("winRecords");
    winCount--;
    System.out.print("Total wins: ");
    System.out.print(winCount);
    
  }
  public void draw() {
      // Draw starting
    background(240,255,255);
    staff.chase2(staffX, staffY);
    staff.draw();
    test1.draw();
    hpBar.draw();
    // Get coords
    staffX = test1.getX();
    staffY = test1.getY();
    // Stage transitioners
    if (smallDemonCount == 0){
        stageNum = 1;
        smallDemonCount = 10;
    } 
    if (stage2Count == 0){
        stageNum = 2;
        stage2Count = 10;
    }
    if (stage3Count == 0){
        stageNum = 3;
        stage3Count = 10;
    }
    if (stage4Count == 0){
        stageNum = 4;
        stage4Count = 10;
    }
    if (stage5Count == 0){
        stageNum = 5;
        stage5Count = 10;
    }
    if (stage6Count == 0){
        grat.draw();
    }
    if (stageNum == 7){
        gameOver.draw();
    }
    // Start
    if (stageNum == -1){
        tutCount++;
        bud.draw();
        if (tutCount < 300 && tutCount > 100) {
            d1.draw();
        }
        if (tutCount > 300 && tutCount < 400) {
            d2.draw();
        }
        if (tutCount > 400 && tutCount < 500) {
            d3.draw();
        }
        if (tutCount > 500){
            stageNum = 0;
        }
    }
    
    
    // Stage 1
    if (stageNum == 0){
        // Draw mobs
        stage1.draw();
        stage1.chase(460, -500);
        small.draw();
        small2.draw();
        small3.draw();
        small4.draw();
        small5.draw();
        small6.draw();
        // Mobs
        if(small.getHp() > 0){
            // increase counter
            smallCount++; 
            // Get wukong coords
            monkX = test1.getX(); 
            monkY = test1.getY();
            // Follow method
            small.chase(monkX,monkY);
            // Animation change
            if (smallCount <= 20) small.setImagePath("images/small1.png");
            if (smallCount <= 50 && smallCount > 20) small.setImagePath("images/small2.png");
            if (smallCount > 40) smallCount = 0; // reset animation
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
    }
    if (stageNum == 1){
        // Draw starting 
        stage2.draw();
        stage2.chase(460, -500);
        small2_1.draw();
        small2_2.draw();
        small2_3.draw();
        small2_4.draw();
        small2_5.draw();
        small2_6.draw();
        demon2_1.draw();
        // Mobs
        if(small2_1.getHp() > 0){
            // Increase counter
            smallCount++;
            // Get wukong coords
            monkX = test1.getX();
            monkY = test1.getY();
            // Call follow method
            small2_1.chase(monkX,monkY);
            // animation
            if (smallCount <= 20) small2_1.setImagePath("images/small1.png");
            if (smallCount <= 50 && smallCount > 20) small2_1.setImagePath("images/small2.png");
            if (smallCount > 40) smallCount = 0; // reset 
        }
        if(small2_2.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            small2_2.chase(monkX,monkY);
            if (smallCount <= 20) small2_2.setImagePath("images/small1.png");
            if (smallCount <= 50 && smallCount > 20) small2_2.setImagePath("images/small2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(small2_3.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            small2_3.chase(monkX,monkY);
            if (smallCount <= 20) small2_3.setImagePath("images/small1.png");
            if (smallCount <= 50 && smallCount > 20) small2_3.setImagePath("images/small2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(small2_4.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            small2_4.chase(monkX,monkY);
            if (smallCount <= 20) small2_4.setImagePath("images/small1.png");
            if (smallCount <= 50 && smallCount > 20) small2_4.setImagePath("images/small2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(small2_5.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            small2_5.chase(monkX,monkY);
            if (smallCount <= 20) small2_5.setImagePath("images/small1.png");
            if (smallCount <= 50 && smallCount > 20) small2_5.setImagePath("images/small2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(small2_6.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            small2_6.chase(monkX,monkY);
            if (smallCount <= 20) small2_6.setImagePath("images/small1.png");
            if (smallCount <= 50 && smallCount > 20) small2_6.setImagePath("images/small2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon2_1.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon2_1.chase(monkX,monkY);
            if (smallCount <= 20) demon2_1.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon2_1.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }  
    }
    if (stageNum == 2){
        // Draw starting
        demon3_1.draw();
        demon3_2.draw();
        demon3_3.draw();
        demon3_4.draw();
        demon3_5.draw();
        demon3_6.draw();
        stage3.draw();
        stage3.chase(460, -500);
        // Mobs
        if(demon3_1.getHp() > 0){
            // Increase counter
            smallCount++;
            // Get Wukong coords
            monkX = test1.getX();
            monkY = test1.getY();
            // Call follow method
            demon3_1.chase(monkX,monkY);
            // Animation
            if (smallCount <= 20) demon3_1.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon3_1.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0; // Reset
        }
        if(demon3_2.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon3_2.chase(monkX,monkY);
            if (smallCount <= 20) demon3_2.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon3_2.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon3_3.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon3_3.chase(monkX,monkY);
            if (smallCount <= 20) demon3_3.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon3_3.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon3_4.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon3_4.chase(monkX,monkY);
            if (smallCount <= 20) demon3_4.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon3_4.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon3_5.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon3_5.chase(monkX,monkY);
            if (smallCount <= 20) demon3_5.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon3_5.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon3_6.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon3_6.chase(monkX,monkY);
            if (smallCount <= 20) demon3_6.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon3_6.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
    }
    if (stageNum == 3){
        // Draw starting
        demon4_1.draw();
        demon4_2.draw();
        demon4_3.draw();
        demon4_4.draw();
        demon4_5.draw();
        demon4_6.draw();
        fast4_1.draw();
        stage4.draw();
        stage4.chase(460, -500);
        
        // Mobs        
        if(demon4_1.getHp() > 0){
            // Increase counter
            smallCount++;
            // Get coords
            monkX = test1.getX();
            monkY = test1.getY();
            // Call follow method
            demon4_1.chase(monkX,monkY);
            // Animation
            if (smallCount <= 20) demon4_1.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon4_1.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0; // reset
        }
        if(demon4_2.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon4_2.chase(monkX,monkY);
            if (smallCount <= 20) demon4_2.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon4_2.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon4_3.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon4_3.chase(monkX,monkY);
            if (smallCount <= 20) demon4_3.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon4_3.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon4_4.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon4_4.chase(monkX,monkY);
            if (smallCount <= 20) demon4_4.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon4_4.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon4_5.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon4_5.chase(monkX,monkY);
            if (smallCount <= 20) demon4_5.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon4_5.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(demon4_6.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            demon4_6.chase(monkX,monkY);
            if (smallCount <= 20) demon4_6.setImagePath("images/demon1.png");
            if (smallCount <= 50 && smallCount > 20) demon4_6.setImagePath("images/demon2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(fast4_1.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            fast4_1.chase3(monkX,monkY);
            if (smallCount <= 20) fast4_1.setImagePath("images/fast1.png");
            if (smallCount <= 50 && smallCount > 20) fast4_1.setImagePath("images/fast2.png");
            if (smallCount > 40) smallCount = 0;
        }
    }
    if (stageNum == 4){
        // Draw starting
        stage5.draw();
        stage5.chase(460, -500);
        fast5_1.draw();
        fast5_2.draw();
        fast5_3.draw();
        Boss5_1.draw();
        // Mobs
        if(fast5_1.getHp() > 0){
            // increase counter
            smallCount++;
            // get coords
            monkX = test1.getX();
            monkY = test1.getY();
            // call method following
            fast5_1.chase3(monkX,monkY);
            // animation
            if (smallCount <= 20) fast5_1.setImagePath("images/fast1.png");
            if (smallCount <= 50 && smallCount > 20) fast5_1.setImagePath("images/fast2.png");
            if (smallCount > 40) smallCount = 0; //reset
        }
        if(fast5_2.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            fast5_2.chase3(monkX,monkY);
            if (smallCount <= 20) fast5_2.setImagePath("images/fast1.png");
            if (smallCount <= 50 && smallCount > 20) fast5_2.setImagePath("images/fast2.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(fast5_3.getHp() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            fast5_3.chase3(monkX,monkY);
            if (smallCount <= 20) fast5_1.setImagePath("images/fast2.png");
            if (smallCount <= 50 && smallCount > 20) fast5_3.setImagePath("images/fast1.png");
            if (smallCount > 40) smallCount = 0;
        }
        if(Boss5_1.getHP() > 0){
            smallCount++;
            monkX = test1.getX();
            monkY = test1.getY();
            Boss5_1.chase1_2(monkX,monkY);
            if (smallCount <= 20) Boss5_1.setImagePath("images/boss1.png");
            if (smallCount <= 50 && smallCount > 20) Boss5_1.setImagePath("images/boss2.png");
            if (smallCount > 40) smallCount = 0;
        }
    }
    if (stageNum == 5){
        // Draw starting
        scriptures.draw();
        monkX = test1.getX();
        monkY = test1.getY();
        // Chase main
        scriptures.chase(monkX, monkY);
    }
        // HP BAR
        // Detect hp value
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
            stageNum = 7; // End game at 0 hp
        } else if (hpCount == 0){
            hpBar.setImagePath("images/hp8.png");
            
        }
    // CONTROLS
    if (keyPressed) {
        // increase counters
        count++;
        bananaCount++;
        hpAllowCount++;
        hpHitAllowCount++;
        staffCount++;
        // left arrow
        if (keyCode == LEFT) {
            // move chara
            test1.move(0, -5);
            // animation
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0; //reset counter
            idleCount = 0; // reset idle
        // right arrow
        } else if (keyCode == RIGHT) {
            test1.move(0, 5);
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0;
            idleCount = 0;
        // up arrow
        } else if (keyCode == UP) {
            test1.move(-5, 0);
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0;
            idleCount = 0;
        // down
        } else if (keyCode == DOWN) {
            test1.move(5, 0);
            if (count <= 20) test1.setImagePath("images/monkeyM1.png");
            if (count <= 40 && count > 20) test1.setImagePath("images/monkeyM2.png");
            if (count <= 70 && count > 40) test1.setImagePath("images/monkeyM3.png");
            if (count > 60) count = 0;
            idleCount = 0;
        // shift (Healing animation)
        } else if (keyCode == SHIFT){
            // Animation 
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
                // Disallow healing at 0 and 8
                if (hpCount > 0 && hpCount < 8 && bananaCount == 135) {
                    hpCount--; // Heal 
                    hpAllowCount = 0; // Reset to 0
                } 
            }
            if (bananaCount > 140) {
                bananaCount = 0; // reset count
            }
            idleCount = 0; // reset count 
        // CONTROL (ATK)
        } else if (keyCode == CONTROL){   
            // Animation
            if (staffCount <= 5) staff.setImagePath("images/staff1.png");
            if (staffCount <= 10 && staffCount > 5) staff.setImagePath("images/staff2.png");
            if (staffCount <= 15 && staffCount > 10) staff.setImagePath("images/staff3.png");
            if (staffCount <= 25 && staffCount > 15) staff.setImagePath("images/staff4.png");
            if (staffCount > 20) staffCount = 0; // reset counter
            idleCount = 0; // reset counter
            // Stage 1
            if (staff.isCollidingWith2(small)){
                // animation
                small.setImagePath("images/smallDeath.png");
                // set hp to 0 
                small.setHp(0);
                // Kill mob
                small.die(9999,9999);
                smallDemonCount--; // reduce for stage counter
            }
            if (staff.isCollidingWith2(small2)){
                small2.setHp(0);
                small2.die(9999,9999);
                smallDemonCount--;
            }
            if (staff.isCollidingWith2(small3)){
                small3.setHp(0);
                small3.die(9999,9999);
                smallDemonCount--;
            }
            if (staff.isCollidingWith2(small4)){
                small4.setHp(0);
                small4.die(9999,9999);
                smallDemonCount--;
            }
            if (staff.isCollidingWith2(small5)){
                small5.setHp(0);
                small5.die(9999,9999);
                smallDemonCount--;
            }
           if (staff.isCollidingWith2(small6)){
                small6.setHp(0);
                small6.die(9999,9999);
                smallDemonCount--;
            }
           // Stage 2
            if (staff.isCollidingWith2(small2_1)){
                // Set hp 0
                small2_1.setHp(0);
                // Kill
                small2_1.die(9999,9999);
                // Reduce for stage counter
                stage2Count--;
            }
            if (staff.isCollidingWith2(small2_2)){
                small2_2.setHp(0);
                small2_2.die(9999,9999);
                stage2Count--;
            }
            if (staff.isCollidingWith2(small2_3)){
                small2_3.setHp(0);
                small2_3.die(9999,9999);
                stage2Count--;
            }
            if (staff.isCollidingWith2(small2_4)){
                small2_4.setHp(0);
                small2_4.die(9999,9999);
                stage2Count--;
            }
            if (staff.isCollidingWith2(small2_5)){
                small2_5.setHp(0);
                small2_5.die(9999,9999);
                stage2Count--;
            }
           if (staff.isCollidingWith2(small2_6)){
                small2_6.setHp(0);
                small2_6.die(9999,9999);
                stage2Count--;
            }
           if (staff.isCollidingWith2(demon2_1)){
                demon2_1.hit();
                if (demon2_1.getHp() <= 0){
                    demon2_1.die(9999,9999);
                    stage2Count--;
                }
            }
           // Stage 3
           if (staff.isCollidingWith2(demon3_1)){
               // Call hit to lower hp
                demon3_1.hit();
                // When dead 
                if (demon3_1.getHp() <= 0){
                    demon3_1.die(9999,9999);
                    stage3Count--;
                }
            }
           if (staff.isCollidingWith2(demon3_2)){
                demon3_2.hit();
                if (demon3_2.getHp() <= 0){
                    demon3_2.die(9999,9999);
                    stage3Count--;
                }
            }
           if (staff.isCollidingWith2(demon3_3)){
                demon3_3.hit();
                if (demon3_3.getHp() <= 0){
                    demon3_3.die(9999,9999);
                    stage3Count--;
                }
            }
           if (staff.isCollidingWith2(demon3_4)){
                demon3_4.hit();
                if (demon3_4.getHp() <= 0){
                    demon3_4.die(9999,9999);
                    stage3Count--;
                }
            }
           if (staff.isCollidingWith2(demon3_5)){
                demon3_5.hit();
                if (demon3_5.getHp() <= 0){
                    demon3_5.die(9999,9999);
                    stage3Count--;
                }
            }
           if (staff.isCollidingWith2(demon3_6)){
                demon3_6.hit();
                if (demon3_6.getHp() <= 0){
                    demon3_6.die(9999,9999);
                    stage3Count--;
                }
            }
           // Stage 4
           if (staff.isCollidingWith2(demon4_1)){
               // Call hit to lower hp
                demon4_1.hit();
                // when dead
                if (demon4_1.getHp() <= 0){
                    demon4_1.die(9999,9999);
                    stage4Count--;
                }
            }
           if (staff.isCollidingWith2(demon4_2)){
                demon4_2.hit();
                if (demon4_2.getHp() <= 0){
                    demon4_2.die(9999,9999);
                    stage4Count--;
                }
            }
           if (staff.isCollidingWith2(demon4_3)){
                demon4_3.hit();
                if (demon4_3.getHp() <= 0){
                    demon4_3.die(9999,9999);
                    stage4Count--;
                }
            }
           if (staff.isCollidingWith2(demon4_4)){
                demon4_4.hit();
                if (demon4_4.getHp() <= 0){
                    demon4_4.die(9999,9999);
                    stage4Count--;
                }
            }
           if (staff.isCollidingWith2(demon4_5)){
                demon4_5.hit();
                if (demon4_5.getHp() <= 0){
                    demon4_5.die(9999,9999);
                    stage4Count--;
                }
            }
           if (staff.isCollidingWith2(demon4_6)){
                demon4_6.hit();
                if (demon4_6.getHp() <= 0){
                    demon4_6.die(9999,9999);
                    stage4Count--;
                }
            }
           if (staff.isCollidingWith2(fast4_1)){
                fast4_1.hit();
                if (fast4_1.getHp() <= 0){
                    fast4_1.die(9999,9999);
                    stage4Count--;
                }
            }
           // Stage 5
           if (staff.isCollidingWith2(fast5_1)){
               // call hit to lower hp
                fast5_1.hit();
                // when dead
                if (fast5_1.getHp() <= 0){
                    fast5_1.die(9999,9999);
                    stage5Count--;
                }
            }
           if (staff.isCollidingWith2(fast5_2)){
                fast5_2.hit();
                if (fast5_2.getHp() <= 0){
                    fast5_2.die(9999,9999);
                    stage5Count--;
                }
            }
           if (staff.isCollidingWith2(fast5_3)){
                fast5_3.hit();
                if (fast5_3.getHp() <= 0){
                    fast5_3.die(9999,9999);
                    stage5Count--;
                }
            }
           if (staff.isCollidingWith2(Boss5_1)){
                Boss5_1.hit();
                if (Boss5_1.getHP() <= 0){
                    Boss5_1.die(9999,9999);
                    stage5Count--;
                }
            }
        }     
        }
    
    //COLLOSIONS 
    // Stage 1
    if (small.isCollidingWith(test1)){
        // Hit immunity (prevent 60 hits a second) 
        if (hpHitAllowCount > 15) {
            hpCount++; // increase counter
            hpHitAllowCount = 0; // allolw hits
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
    
    // Stage 2
    if (small2_1.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small2_2.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small2_3.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small2_4.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small2_5.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    } 
    if (small2_6.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon2_1.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    // Stage 3
    if (demon3_1.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon3_2.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon3_3.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon3_4.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon3_5.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon3_6.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    // Stage 4
    if (demon4_1.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon4_2.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon4_3.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon4_4.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon4_5.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (demon4_6.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (fast4_1.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    // Stage 5
    if (fast5_1.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (fast5_2.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (fast5_3.isCollidingWith(test1)){
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    if (Boss5_1.isCollidingWith(test1)){
        
        if (hpHitAllowCount > 15) {
            hpCount++;
            hpHitAllowCount = 0;
        }
    }
    // Stage 6
    if (scriptures.isCollidingWith(test1)){
        // Move scriptures off screen
        scriptures.die(9999999, 9999999);
        // Wrtie to file
        try{
            // Printwriter/file
            FileWriter writer = new FileWriter("winRecords", true);
            PrintWriter q = new PrintWriter(writer);
            q.print("\n 1"); // Writing
            q.close(); // Close
        } catch (IOException p){
                System.out.print("Java Exception " + p);
            }
        stage6Count--;
        
        

        
    }
    // Idle animation
    if (!keyPressed){
        // Increase counter
        idleCount++;
        // Set animations
        staff.setImagePath("images/staff5.png");
        if (idleCount < 40) test1.setImagePath("images/monkeyidlepos1.png");
        if (idleCount < 80 && idleCount > 40) test1.setImagePath("images/monkeyidlepos2.png");
        if (idleCount > 80) idleCount = 0;
        if (idleCount > 10) count = 0;
    }   
    }

    /**
     * Counts line in file
     * @return lineCount
     */
    private int countLines(String filename){
        // Declare Variables
        int lineCount = 0;
        // Try catch
        try {
            // Loop through data.txt if there is a next line
            Scanner fileInput = new Scanner(new File(filename));
            while (fileInput.hasNextLine()){
                fileInput.nextLine();
                lineCount++; // Add one to counter
            }
            fileInput.close(); // Close scanner
           
        } catch(IOException e){
            System.out.print("Java Exception" + e);
        }
        return lineCount; // Return lineCount
    }
    /**
     * Take questions from file
     * @param lineCount This creates the array size
     * @return questions This holds the questions in an array
     */
    private String [] take(int lineCount, String filename){
        // Declare Variables
        int count = 0;
        String [] Q = new String [lineCount];
        // Try catch
         try{
             // Loop through data.txt and store questions
            Scanner fileInput = new Scanner(new File(filename));
            while(fileInput.hasNext()){
                String output = fileInput.nextLine();
                // Store values
                Q[count] = output;
                count++; // Add to counter
            }
        } catch (IOException e){
            System.err.println("Java Exception: " + e);
        } catch (StringIndexOutOfBoundsException p) {
            System.err.println("Java Exception: " + p);
        }

        return Q; // Return array
    }
  
  
  
  
  
  
    }//end class

