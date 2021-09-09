//Task 3
int  r = 255; // rød farve
int g = 255; //grøn farve
int b = 255; //blå farve
int background = 111; //grå baggrund
int slukket = 100;  //intet lys
int diam = 140;
int slukketlys = 60;// gråt

void setup() {
  size(400, 600);
}

void draw() {
  background(background);
  fill(0);
  rectMode(CENTER);
  rect(width/2, height/2, 200, 500); //selve lyskurven 
  
  if (slukket== 1) {
    fill(r, 0, 0); //sæt farve til rød
    ellipse(width/2, height/4, diam, diam); // rød lys
    fill(slukketlys); // sæt farve til gul
    ellipse(width/2, height/2, diam,diam); //gul lys
    fill(slukketlys); //sæt farve til grøn
    ellipse(width/2, height/4*3, diam, diam); // grøn lys
  }
   if (slukket== 2) {
    fill(r, 0, 0); //sæt farve til rød
    ellipse(width/2, height/4, diam, diam); // rød lys
    fill(r, g, 0); // sæt farve til gul
    ellipse(width/2, height/2, diam,diam); //gul lys
    fill(slukketlys); //sæt farve til grøn
    ellipse(width/2, height/4*3, diam, diam); // grøn lys
  }
    
    if (slukket ==3) {
    fill(0, 255, 0); //sæt farve til grøn
    ellipse(width/2, height/4*3, diam, diam); // grøn lys
    fill(slukketlys);
    ellipse(width/2, height/4, diam, diam); // rød lys
    fill(slukketlys); // sæt farve til gul
    ellipse(width/2, height/2, diam,diam); //gul lys
    }
    if (slukket ==4) {
    fill(r, g, 0); // sæt farve til gul
    ellipse(width/2, height/2, diam,diam); //gul lys
       fill(slukketlys); //sæt farve til grøn
    ellipse(width/2, height/4*3, diam, diam); // grøn lys
    fill(slukketlys);
    ellipse(width/2, height/4, diam, diam); // rød lys
    }
  slukket++;
  if (slukket >4) {
    slukket=1;
  }
  delay(500);
}
