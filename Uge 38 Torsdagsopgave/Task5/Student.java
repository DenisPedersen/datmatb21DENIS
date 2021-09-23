//3.b Create a new file called "Teacher" and another one called "Student". Save both files with the extension .java, and in the same folder as Datamatik.java
//3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.
//3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam"
//with the same data types used in 3.c
//3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d (you may use shaddowing with the keyword this)
public class Student {
  public String name;
  public int age;
  public boolean isFemale;
  public String datamatikerTeam;

  //laver lige fluks en class konstruktør for min Student class
  public Student(String tmpName, int tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam) {
     name = tmpName;
     age = tmpAge;
     isFemale = tmpIsFemale;
     datamatikerTeam = tmpDatamatikerTeam;
  }
  public static void main(String[] args) {

  }
}
