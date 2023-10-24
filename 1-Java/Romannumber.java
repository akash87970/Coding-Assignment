//1-B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)
import java.util.*;

public  class Romannumber{
  public int getValue(char ch)
  {
    switch(ch)
  {

    case 'I' : return 1;
    case 'V' : return 5;
    case 'X' : return 10;
    case 'L' : return 50;
    case 'C' : return 100;
    case 'D' : return 500;
    case 'M' : return 1000;
    default :  return 0; 
  }  
}
public int RomanToInteger(String s){ 
  int n=s.length();
  int sum =0;
  for(int i=0; i<n; i++)
  {
    char ch1=s.charAt(i);
    if((i+1)<n && getValue(ch1)< getValue(s.charAt(i+1)))
    sum=sum-getValue(ch1);
    else
      sum=sum+getValue(ch1);
  }
  return sum; 
}

  public static void main(String[] args){
    System.out.println("Please Enter Roman number to convert into integer");
    Scanner sc =new Scanner(System.in);
    String s =sc.nextLine();
    Romannumber a =new Romannumber();
       System.out.println(a.RomanToInteger(s)); 
  

  }
}
