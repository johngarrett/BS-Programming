
var angle = 0;
var slider; //editing the angle
var weight; 

function setup() {
  createCanvas(400,400);
  slider = createSlider(0, PI/2,//from 0 to pi/2, chose values
   PI/6, 0.01) //start at pi/6 and incriment by .01
}

function draw() {
	background(24);
	weight = 10;
	strokeWeight(weight);
	angle = slider.value();//the slider in the range
	//the trunk
		stroke(255);
		translate(200, height);
	branch(150);
}

function branch(len, w){
	line (0,0,0, -len);
	translate(0,-len);
	//so it doesn't go on forver
	if(len > 2){
		strokeWeight(w);
		push();//save the curent state of the line
			rotate(angle);//rotate right
			branch(len*.7, w *.7);//draw another branch
		pop();//go back to the previous state

		push();
			rotate(-angle);//rotate left
			branch(len*.7, w *.7);
		pop();
	}
}