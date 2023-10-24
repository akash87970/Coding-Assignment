//1-C. Check if the input is pangram or not.
public class pangram {
  private static boolean ispangram(String s){
    if(s.length()<26){
              return false;}
          else {
            for (char ch='a'; ch <= 'z'; ch++){
              if(s.indexOf(ch)< 0){
                  return false;
              }
          
            } 
          } 
          return true;}
    public static void main(String[]args){
    String s =" Brown jars prevented the mixture from freezing too quickly";
       
        System.out.println("Result   = "+ ispangram(s.toLowerCase()));//convert
        //to caseinsensitive 
        boolean Result =ispangram(s.toLowerCase());
      if(Result){
        System.out.println("  This is Pangram Sentence");}  
          else{
             System.out.println("Oops !! Not Pangram Sentence");
              }
  }
}