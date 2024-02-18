public class SwapNumbers {

  public static void main(String[] args) {
    
    // 3 approaches

// 1.Creating an auxiliary memory cell in the memory.
// 2.Without creating any auxiliary(additional) memory cell
// 3.Using exclusive OR (Bitwise XOR) operator

      System.out.println("1. Swap two numbers By Creating an auxiliary memory cell in the memory.");
        

        int num1 = 10 ; 
        int num2 = 20; 
        int x ; 
                        System.out.println("num1 "  + num1 +  " num2 " + num2 );

        x = num1; 
        num1 = num2; 
        num2 = x; 
                System.out.println("After swap");

        System.out.println("num1 "  + num1 +  " num2 " + num2 );
        
        
      System.out.println("2. Swap two numbers Without creating any auxiliary(additional) memory cell");
    
    // : Swapping the Values Without Using Third Variable by using sum and differences concepts of maths.
    
    int m = 5 ;
    int n = 8 ; 
    
            System.out.println("m "  + m +  " n " + n );

        // Steps as listed in algorithm
 
        // Difference of 2nd from 1st
        // is stored in first variable
        //  m = 5-8 = -3
        m = m - n;
 
        // Sum is stored in second variable
        //  n = -3+8 = 5
        n = m + n;  
 
        // Difference of 1st from 2nd
        // is replaced in first variable
        // m = 5 - (-3) = 8
        m = n - m;
        
        System.out.println("After swap");
                    System.out.println("m "  + m +  " n " + n );
                    
     System.out.println("3. Using exclusive OR (Bitwise XOR) operator");
     
     int a = 5;
int b = 8;

                    System.out.println("a "  + a +  " b " + b );

// # Swapping without a temporary variable using XOR
a = a ^ b;  //# a = 5 ^ 8 = 13
b = a ^ b ; // b = 13 ^ 8 = 5
a = a ^ b  ;//a = 13 ^ 5 = 8

        System.out.println("After swap");

                    System.out.println("a "  + a +  " b " + b );



        
  }

}