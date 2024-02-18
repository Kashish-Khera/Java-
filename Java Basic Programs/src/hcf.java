public class HCF {


 public static void main(String[] args) {
   
 
   
//   The algorithm steps are as follows:

// Step 1: Initially set HCF to 1
// Step 2: Run a loop between [1, min(num1, num2)] throughout the iteration of (i).
// Step 3: List the largest number that divides both numbers 1 and 2 in your notes.
// Step 4: If i meets the conditions (num1% i == 0 && num2% i == 0), then i is the new HCF value.
// Step 5: HCF value printed


int num1 = 24, num2 = 36, hcf=0;
    for (int i = 1; i <= num1 || i <= num2; i++)
      {
     if (num1 % i == 0 && num2 % i == 0)
        hcf = i;
      }
    System.out.println("The HCF: "+ hcf);
 }
 
}