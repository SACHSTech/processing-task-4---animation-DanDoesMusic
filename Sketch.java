import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(700,400);

  }

    float sky1 = 183;
    float sky2 = 8;
    float sky3 = 255;


    float Day = 500;


    float Night = 1000;
 

  public void draw() {

    background(sky1,sky2,sky3);
    sky1 = sky1 - 1;
    sky2 = sky2 - 1;
    sky3 = sky3 - 1;


    fill(255, 255, 0);
    ellipse(Day,75,80,80);
    Day = Day - 2;

    
    fill(255);
    ellipse(Night,75,80,80);
    Night = Night - 2;


    fill(107,208,76);
    rect(0,250,700,400);


    fill(32);
    rect(80,220,95,40);
        fill(255,115,15);
triangle(85, 220, 230, 80, 144, 200);


    if (Night < 0) {
      Day = 500;

      Day = Day - 2;

      
      Night = 100;
      
      Night = Night - 2;
      
      sky1 = 183;
      
      sky2 = 8;
      
      sky3 = 235;
      
      sky1 = sky1 - 1;
      
      sky2 = sky2 - 1;
      
      sky3 = sky3 - 1;
    }
    
  }

}