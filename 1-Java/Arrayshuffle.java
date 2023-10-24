//1. A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Random;

public class Arrayshuffle{
public static void shuffle(int[] arr){
  Random obj = new Random();
  for(int i=0; i < arr.length; i++){
    int randomnumber = obj.nextInt(arr.length);
    int temp =arr[i];
    arr[i]=arr[randomnumber];
    arr[randomnumber]=temp;
  }
   for(int i=0; i < arr.length; i++){
    System.out.print(arr[i]+" ");
}

 System.out.println();
}

  public static void main(String[]args){
   int arr[]={1,2,3,4,5,6,7};
   for (int i=0; i<5; i++){ // we suffle array 5 times . for single time we remove the  for loop.
       Arrayshuffle.shuffle(arr);
   }

  }
  
}
