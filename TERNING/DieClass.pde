//Die-classen (skabelonen AKA cookie-cutteren).

class Die {
  //alle variablerne som terningeclassen består af
  color eyeColor;
  color dieColor;
  int eyes;
  int roll;   //en variabel til min rollDie funktion
  int size;  //størrelse på terningen
  int x;  //x-position
  int y;  //y-position
  int draw;   // variabel til funktionen som viser min terning
  int smoothCorners; //hjørnerne på terningens varaibel
  int eyeSize;

  public Die(color dieColor, color eyeColor) { //terningekonstruktøren
    this.eyeColor = eyeColor;
    this.dieColor = dieColor;
  }
  public void roll() {  //roll funktionen
    eyes = (int) random(1, 7);
  }
  //vis terning med draw()-funktion
  public void draw(int x, int y, int size, int smoothCorners) {
    eyeSize = 9;
    this.x = x;
    this.y = y;  //lokale variabler
    fill(dieColor);
    rectMode(CENTER);
    rect(x, y, size, size, smoothCorners); //tegn terningen
    fill(eyeColor);
    if (eyes == 1) {  //tegn terningerne vha en if-løkke
      circle(x, y, eyeSize);
    } else if (eyes == 2) {
      circle (x+size*0.25, y+size*0.25, eyeSize);
      circle (x-size*0.25, y-size*0.25, eyeSize);
    } else if (eyes == 3) {
      circle (x+size*0.25, y+size*0.25, eyeSize);
      circle (x, y, eyeSize);
      circle (x-size*0.25, y-size*0.25, eyeSize);
    } else if (eyes == 4) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
    } else if (eyes == 5) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
      circle(x, y, eyeSize);
    } else if (eyes == 6) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
      circle (x+size*0.25, y, eyeSize);
      circle (x-size*0.25, y, eyeSize);
    }
  }
}
