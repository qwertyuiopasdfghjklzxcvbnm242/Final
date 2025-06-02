/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app1;
import processing.core.PApplet;

public class MySketch extends PApplet {
  private Car car1;
  private Car car2; 
  private boolean showInfo1 = false;
  
  private boolean showInfo2 = false;
 
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255);
    car1 = new Car(this, 200, 200,5,"images/car.png");
    car2 = new Car(this, 50, 200,5,"images/car.png");
    
  }
  
  public void draw() {
    background(0,255,0);
    car1.draw();
    car2.draw();
    drawCollisions();
    if (keyPressed) {
        if (keyCode == LEFT) {
          car2.move(0, -5);
        } else if (keyCode == RIGHT) {
          car2.move(0, 5);
        } else if (keyCode == UP) {
          car2.move(-5, 0);
        } else if (keyCode == DOWN) {
          car2.move(5, 0);
        }
    }
    if (showInfo1){
        car2.displayInfo(this);
    }
    if (showInfo2){
        car1.displayInfo(this);
    }
    
  }
  public void drawCollisions(){
      if (car1.isCollidingWith(car2)) {
          fill(255,0,0);
          this.text("oouch", car2.x, car2.y);
      }
  }
  
  public void mousePressed(){
      if (car2.isClicked(mouseX, mouseY)){
          showInfo1 = !showInfo1;
      } else {
          showInfo1 = false;
      }
      if (car1.isClicked(mouseX, mouseY)){
          showInfo2 = !showInfo2;
      } else {
          showInfo2 = false;
      }
  }
}//end class
