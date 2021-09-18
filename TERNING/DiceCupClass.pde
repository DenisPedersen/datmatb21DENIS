class DiceCup {
  //alle variablerne som DiceCup-klassen består af
  Die[] cup;
  int amount;  // antallet af terninger i DiceCup
  Die[] spot1 = new Die [6];
  Die[] spot2 = new Die [6];
  Die[] spot3 = new Die [6];
  Die[] spot4 = new Die [6];
  Die[] spot5 = new Die [6];
  Die[] spot6 = new Die [6];

  DiceCup() {
    amount = 0;  //sæt startantallet af terninger til 0
    cup = new Die[6]; //cup giver ny array af terninger
  }



  void addDie(Die die) {
    amount++;
    cup [amount-1] = die;
  }
  public void shake() {  //shake-funktionen
    for (int i = 0; i < amount; i ++) {
      cup[i].roll();
    }
  }
  public void draw(int x, int y, int dieSize, int smoothCorners) { //draw-funktionen som tegner mine terninger
    int xPos = x;
    for (int i = 0; i < amount; i++) {
      cup[i].draw(xPos, y, dieSize, smoothCorners);
      xPos += 1.5 * dieSize;
    }
  }

  public void sort() {  //sort funktionen som skulle sortere efter øjne, den lykkedes ikke helt ...
    for (int i = 0; i < amount; i++) {
      if (cup[i].eyes== 1) {
        spot1[i]=cup[i];
      }
      if (cup[i].eyes==2) {
        spot2[i]=cup[i];
      }
      if (cup[i].eyes==3) {
        spot3[i]=cup[i];
      }
      if (cup[i].eyes==4) {
        spot4[i]=cup[i];
      }
      if (cup[i].eyes==5) {
        spot5[i]=cup[i];
      }
      if (cup[i].eyes==6) {
        spot6[i]=cup[i];
      }
    }
    for (int i = 0; i < spot1.length; i++) {
      //   if (spot1[i] != null) {
      // println("hej");
    }
  }
}
