//2.b Write a function that receives to integers as parameters and returns the sum of them.

public class Task2bcd{

public static void main(String[] args) {
  result();  //kald result-funktionen
  storeBogstaver(); //kald storeBogstaver-funktionen
  System.out.println(trueIfUpperCase("Hejsa"));
}
 public static void result() {
   int a = 2;  //første int
   int b = 5;  //andet int
   System.out.println("2 + 5 =");  //det svære regnestykke som cmd skal regne på
   System.out.println(a + b );  //cmd's resultat af det svære regnestykke
}
//2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()"
   public static void storeBogstaver(){
     String detSomSkalMedStort = "Hej, hvordan har du det?";  //String navngivet detSomSkalMedStort, som printer "Hej, hvordan har du det?".
     System.out.println(detSomSkalMedStort.toUpperCase());  //.toUpperCase() sørger for, at Stringen bliver skrevet med store bogstaver. Simple! :)
   }
   //2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
     public static boolean trueIfUpperCase(String stortBegyndelsesBogstav) {
     char chartemp;
     chartemp = stortBegyndelsesBogstav.charAt(0);

     boolean StortEllerEj = Character.isUpperCase(chartemp);

     return StortEllerEj;
   }
   }
