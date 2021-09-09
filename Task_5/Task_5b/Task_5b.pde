/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/

void setup(){
  MethodTwo();
}
void MethodTwo() 
{
  int weekDay = 4; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
 
  if (weekDay < 5)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }

  // Print the name of the weekday here: 
    if(weekDay==0) {println("Det er mandag");
    }else if (weekDay == 1) {println("Det er tirsdag");
    } else if (weekDay == 2)  {println("Det er onsdag");
    }else if (weekDay == 3) {println("Det er torsdag");
    } else if(weekDay == 4) {println("Det er fredag");
    }else if(weekDay == 5) {println("Det er lørdag");
    }else {println("Det er søndag");
    }
    
  // Print if it is weekend here:
  
    if (weekDay <=5){ println("Det er ikke weekend");
    } else {println("Det er WEEKEND!");
    }
}
