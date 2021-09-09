void setup() {
  MethodOne();
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  int max = 10;
  String output = "";

  if (i > max)
  {
       output = "i is greater than "+max+".";   

  }

  println(output);
}
