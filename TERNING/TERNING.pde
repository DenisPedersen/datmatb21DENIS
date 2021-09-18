Die[] die = new Die[6];
DiceCup cup;

void setup() {
  size (475, 475);
  background(111);
    for (int i = 0; i < 6; i++) {
      die[i] = new Die(255, 0);
    }
  cup = new DiceCup();
    for(int i = 0; i <6; i++) {
      cup.addDie(die[i]);
    }
  cup.shake();
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
