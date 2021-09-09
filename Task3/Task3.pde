//Task 3
int  r = 255; // rød farve
int g = 255; //grøn farve
int b = 255; //blå farve
int background = 111; //grå baggrund
int slukket = 100;  //intet lys
int diam = 140;

void setup() {
  size(400, 600);
}

void draw() {
  background(background);
  fill(0);
  rectMode(CENTER);
  rect(width/2, height/2, 200, 500); //selve lyskurven
  fill(r, g, 0); // sæt farve til gul
  ellipse(width/2, height/2, diam,diam); //gul lys
  fill(r, 0, 0); //sæt farve til rød
  ellipse(width/2, height/2 - 160, diam, diam); // rød lys
  fill(0, 100, 0); //sæt farve til grøn
  ellipse(width/2, height/2 + 160, diam, diam); // grøn lys
}
