
int radius;
double ratio;

int circle_count;
int total_count;


void setup(){
  radius = 250;
  size(610, 610);
  
  background(40);
  translate(width/2, height/2);
  
  stroke(255);
  noFill();
  strokeWeight(1);
  ellipse(0,0, radius * 2, radius * 2);
  rectMode(CENTER);
  rect(0,0,radius * 2, radius * 2);
}
void draw(){
   translate(width/2, height/2);  
  strokeWeight(.5);
 for(int i = 0; i < 40000; i++){
  darts();
  }
  println(4 * (double)(circle_count)/total_count);
}
void darts(){
  total_count++;
  float x = random(-radius, radius);
  float y = random(-radius, radius);
 
  double distance = ((double)x * x) + ((double)y * y);

//in the circle
 if (distance < radius * radius){//faster on the processor (sqrt is hard to do)
    stroke(0,255,0, 100);
    circle_count++;
 }
//outside the circle
 else {stroke(255,0,0,100);}
  point(x,y);
}