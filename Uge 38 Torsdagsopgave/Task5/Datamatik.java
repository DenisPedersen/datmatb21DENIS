//3.a Create a new file and save it by the name "Datamatik".
/*3.i Returning to the Datamatik class add a main() function and in this function,
create a new object/instance of the type Teacher and give it the name, age and gender of your teacher.*/
/*3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student. The first one,
with your own name, age and gender. The second one with the name, age and gender of a student in your study group. */
//3.k in the main() function print the name of the teacher
//3.l in the main() function print the names of both students and which teams they are from. Do this witout writing any toString() methods
class datamatik{

  public static void main(String[] args) {
    Student mySelf = new Student("Denis", 39, false, " Hold B" );
    Student notMySelf = new Student("Stevie Wonder", 72, false, " Hold B");

//5.a Add an array of Students with 10 elements in it. This should be a class variable (static).
//From the main method, add 10 student instances to the array. Each student must have a unique reference.
    Student[] arrayOfStudents = new Student[10];
    arrayOfStudents[0] = new Student ("John", 88, true, " Hold B") ;
    arrayOfStudents[1] = new Student ("Arne", 99, false, " Hold B");
    arrayOfStudents[2] = new Student ("Bjarne", 4, true, " Taberholdet");
    arrayOfStudents[3] = new Student ("Jan", 16, true, " Taberholdet");
    arrayOfStudents[4] = new Student ("Thobias", 60, true, " Taberholdet");
    arrayOfStudents[5] = new Student ("Krisser", 3, false, " Hold C");
    arrayOfStudents[6] = new Student ("Fede Allan", 19, true," Hold B");
    arrayOfStudents[7] = new Student ("Benny", 20, true, " Hold C");
    arrayOfStudents[8] = new Student ("Trampe-Ole", 22, false, "Hold A");
    arrayOfStudents[9] = new Student ("Michael", 19, false, "Hold B");
/*5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer.
The function should return the field "name" (the name of the student) and print it (the integer should be used as
 the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array)
from the main() of Datamatik.*/
    System.out.println(mySelf.name + mySelf.datamatikerTeam);
    System.out.println(notMySelf.name + notMySelf.datamatikerTeam);

  }
}
