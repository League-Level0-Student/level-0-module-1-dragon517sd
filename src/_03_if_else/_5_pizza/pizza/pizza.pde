PImage olive;
PImage mushroom;

void setup() {
    size(500,500);
     fill(#F5E9A6);
     noStroke();
     ellipse(250,250,400,400);
     fill (#E50E0E);
     ellipse(250,250,350,350);
     fill(#FFFED8);
     ellipse(250,250,325,325);
     olive=loadImage("olive.png");
     mushroom= loadImage("mushroom.png");
     olive.resize(30,30);
     mushroom.resize(50,50);
}
void draw() {
  if(mousePressed && (mouseButton== LEFT)){
   image(olive, mouseX,mouseY);
  }
  if(mousePressed && (mouseButton == RIGHT)){
   image(mushroom,mouseX,mouseY);
  }
}
