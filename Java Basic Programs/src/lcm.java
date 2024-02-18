public class LCM {

  public static void main(String[] args) {
        
        // LCM (i.e. Least Common Multiple) is the largest of the two stated numbers 
        // that can be divided by both the given numbers.
        
        
        int a = 15 ; 
        int b = 25 ; 
        
        
        // find the smallest of both no. 
        
        int smallest = a > b ? b : a; 
        
        System.out.println("smallest of both is "  + smallest);
        
         // Checking for a smallest number that
        // can de divided by both numbers
        
        while(true)
        {
          if(smallest % a == 0 && smallest % b == 0)
        {
          System.out.println("LCM : " + smallest);
          break;
        }
        
          // System.out.println("common factors : " + smallest);

         smallest ++ ; 
        }
        
        
        
  }
  
  

}