//1.a Create a file and name it Main.java, include a main method.
public class Main{
public static void main(String[] args) {
  emptyLinePrint( ); // kald funktionen som skriver en tom linje.
  stringParameter("detEtEllerAndetSomSkalPrintesIstringParameterFunktionen"); // kald funktionen som skriver etEllerAndetLangt.
  hejMedDig();
}
//1.b Write a function that prints an empty line and call it from main();
public static void emptyLinePrint() {  //funktionen som printer en tom linje.
   System.out.println();
}
//1.c Write a function that receives a string as a parameter and prints it. call this function from main()
public static void stringParameter(String etEllerAndet) {
   System.out.println(etEllerAndet);
}
//1.d Write a function that receives a string called "name" and an integer called "age" and call it from main with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".
public static void hejMedDig() {
  String name = "Denis";
  int age = 39;
  System.out.println("Hi! My name is " + name + " I am " + age + " years old! :)" );
}
}
