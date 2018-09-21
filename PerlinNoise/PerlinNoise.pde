/*
John Garrett

this creates a random 'world', if you will, based on the perlin noise API

1-29-18
*/

int cols, rows;
int scl = 20;//size of each box
int w = 2500;//width of the terrian
int h = 1700; //depth of the terrian

float flying = 0;//how much to move the camera by

float[][] terrain;//array for height values

void setup() {
  size(1000, 600, P3D);//visible board... p3d is what adds the z axis
  cols = w / scl;//how many boxes along the x-axis
  rows = h/ scl;//boxes along the y-axis
  terrain = new float[cols][rows];//the z-values for each individual point
}


void draw() {

  flying -= 0.1;//move the camera

  float yoff = flying;//where to start y; once it is off the screen, stop generating values
  for (int y = 0; y < rows; y++) {//cycle through the rows
    float xoff = 0;//start creating z-values from the left
    for (int x = 0; x < cols; x++) {//cycle through the collums
    
    /*we are using xOff and yOFF instead of x and y because noise doesn't like whole integer changes;
      it wants small decimal changes*/
    
      terrain[x][y] = map(noise(xoff, yoff)//noise generates a random value between 0 and 1.. but not that random
      , 0, 1,//map the noise value from the original 0-1 range
      -100, 100);//to this new -100 to 100 range
      
      xoff += .15;//now incriment by a non-whole integer value
    }
    yoff += 0.15;
  }



  background(0);//black background
  stroke(255);
  noFill(); //wireframe
  translate(width/2, height/2+50);//having everything drawn to the center of the window
  rotateX(PI/3);//rotating the screen for depth
  translate(-w/2, -h/2);//after drawing in the center and then rotating, move it down
  
  for (int y = 0; y < rows-1; y++) {
    beginShape(TRIANGLE_STRIP);
    for (int x = 0; x < cols; x++) {
      //these two assign the vertexes to change after the triangle_strip converts the points to a triangle and not a rectangle
      vertex(x*scl, y*scl, terrain[x][y]);//the x, y and generated z at that location
      vertex(x*scl, (y+1)*scl, terrain[x][y+1]);//the bottom vertex
      //rect(x*scl, y*scl, scl, scl);
    }
    endShape();
  }
}