Die[] die = new Die[6];
DiceCup cup;

void setup() {
  size (475, 475);
  background(111);
    for (int i = 0; i < 6; i++) {  //kald de 6 terninger
      die[i] = new Die(255, 0);
    }
  cup = new DiceCup();
    for(int i = 0; i <6; i++) {  //kald dicecuppen med add.Die funktionen
      cup.addDie(die[i]);
    }
  cup.shake();  // kald shake-funktionen
}
void draw() {

  cup.draw(50, 50, 50, 5);
}
void keyPressed() {  //kald shake()-funktionen hver gang der trykkes på 's'.
  cup.shake();

  if (key == 's')
  {
    cup.sort();//kald den sort-funktion som ikke fungerer
  }
}
