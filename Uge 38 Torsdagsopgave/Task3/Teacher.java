//3.b Create a new file called "Teacher" and another one called "Student". Save both files with the extension .java, and in the same folder as Datamatik.java
//3.f in the Teacher class, declare the class "Teacher" and add 3 fields: "name", "age", "isFemale", using appropriate data types for each.
//3.g in the Teacher class, add a constructor that takes in 3 parameters with the names "tmpName", "tmpAge", "tmpIsFemale" with the same datatypes used in 3.f
//3.h populate the fields created in 3.f with the parameters of the constructor added in 3.g
public class Teacher {
  String name;
  int age;
  boolean isFemale;
//Teacher-konstruktøren
  public Teacher(String tmpName, int tmpAge, boolean tmpIsFemale) {
   name = tmpName;
   age = tmpAge;
   isFemale = tmpIsFemale;
}
 public String toString() {
   String tmp = "";
   tmp += name;
   tmp += ", ";
   tmp += age;
   if (isFemale==true) {
     tmp += ", er en pige";
   } else {
     tmp += " er en drengerøv!";
   }
   return tmp;

 }
}
