public class Largest_of_three {

 public static void main(String[] args) {
   
//   Algo : 
   
//   1. Start
// 2. Read the three numbers to be compared, as A, B and C
// 3. Check if A is greater than B.

//   3.1 If true, then check if A is greater than C
//         If true, print 'A' as the greatest number
//           If false, print 'C' as the greatest number

//   3.2 If false, then check if B is greater than C
//         If true, print 'B' as the greatest number
//         If false, print 'C' as the greatest number
// 4. End


int a = 10 ; 
int b = 60 ; 
 int c = 30 ; 
 
    System.out.println("Approach 1 : if else case");

     
     if(a > b  && a > c)
     {
       System.out.println("a is largest");
       
     }
    else if (b > a && b > c)
    {
         System.out.println("b is largest");
    
    }
    else 
    {
         System.out.println("c is largest");
    
    }

    System.out.println("Approach 2 : Using ternary operator");
    
//     algo : 
//     x = 5, y= 10, z = 3

// largest  = 3>(5>10 ? 5:10) ? 3: ((5>10) ? 5:10);
// largest  = 3>10 ? 3 : 10
// largest  = 10
    
    int largest = a > (b > c ? b : c) ? a : ((b>c) ? b : c) ;
    System.out.println( largest + " is largest");
    
    



}
}