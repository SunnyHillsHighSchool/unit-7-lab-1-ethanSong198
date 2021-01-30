//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
  //create variable called sum
  int sum = 0;

  //for each loop of array list with int x
  for(int x: ray){
    //have sum be sum plus x
    sum = sum + x;
    //end for loop
  }

  //return sum
  return sum;
 }
}