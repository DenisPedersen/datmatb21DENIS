Die die1;
Die die2;
Die die3;
Die die4;
Die die5;
Die die6;
DiceCup cup;

void setup() {
  size (475, 475);
  background(111);
  die1 = new Die(255, 0);
  die2 = new Die(255, 0);
  die3 = new Die(255, 0);
  die4 = new Die(255, 0);
  die5 = new Die(255, 0);
  die6 = new Die(255, 0);
  cup = new DiceCup();
  cup.addDie(die1);
  cup.addDie(die2);
  cup.addDie(die3);
  cup.addDie(die4);
  cup.addDie(die5);
  cup.addDie(die6);
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
