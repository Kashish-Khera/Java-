
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * PATTERNS RULES : 1. Pattern have nested loops . 2. for the outer loop , count
		 * the no. of rows 3. for inner loop , focus on the coloumns and connect them
		 * with the rows 4. print * in side the inner for loop 5. observe the symmetry
		 * (optional)
		 * 
		 */

		System.out.println("-------Pattern - 1--------\n");

//		*****
//		*****
//		*****
//		*****
//		*****

		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("-------Pattern - 2--------\n");

//		*
//		**
//		***
//		****
//		*****

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------Pattern - 3--------\n");

//		1
//		12
//		123
//		1234
//		12345

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("-------Pattern - 4--------\n");

//		1
//		22
//		333
//		4444
//		55555

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("-------Pattern - 5--------\n");

//	*****
//	****
//	***
//	**
//	*

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------Pattern - 6--------\n");

//	54321
//	5432
//	543
//	54
//	5

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("-------Pattern - 7--------\n");

//12345
//1234
//123
//12
//1

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("-------Pattern - 8--------\n");

//    *    
//   ***   
//  *****  
// ******* 
//*********

		for (int i = 0; i < n; i++) {
//		space
			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print(" ");
			}

//		star
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}

//		space
			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}

		System.out.println("-------Pattern - 9--------\n");

//	*********
//	 ******* 
//	  *****  
//	   ***   
//	    * 

		for (int i = 1; i <= n; i++) {
//		space

			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}

//		star

			for (int k = 0; k < 2 * n - 2 * i + 1; k++) {
				System.out.print("*");
			}

//		space

			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}

			System.out.println();

		}

		System.out.println("-------Pattern - 10--------\n");

//	    *    
//	   ***   
//	  *****  
//	 ******* 
//	*********
//	*********
//	 ******* 
//	  *****  
//	   ***   
//	    *    

		for (int i = 0; i < n; i++) {
//		space
			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print(" ");
			}

//		star
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}

//		space
			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
//		space

			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}

//		star

			for (int k = 0; k < 2 * n - 2 * i + 1; k++) {
				System.out.print("*");
			}

//		space

			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}

			System.out.println();

		}

		System.out.println("-------Pattern - 11--------\n");

//	
//	 1 
//	 0  1 
//	 1  0  1 
//	 0  1  0  1 
//	 1  0  1  0  1 

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(" 1 ");
				} else {
					System.out.print(" 0 ");
				}
			}

			System.out.println();

		}

		System.out.println("-------Pattern - 12--------\n");

//1        1
//12      21
//123    321
//1234  4321
//1234554321

		for (int i = 1; i <= n; i++) {

//		number

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
//		space

			for (int z = 1; z <= 2 * (n - i); z++) {
				System.out.print(" ");
			}

//		no
			for (int k = i; k >= 1; k--) {
				System.out.print(k);

			}

			System.out.println();

		}

		System.out.println("-------Pattern - 13--------\n");

//	
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 

		int count = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}

			System.out.println();
		}

		System.out.println("-------Pattern - 14--------\n");

//	A
//	AB
//	ABC
//	ABCD
//	ABCDE

		for (int i = 0; i <= n; i++) {
			char alphabet = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(alphabet++);
			}

			System.out.println();
		}

		System.out.println("-------Pattern - 15--------\n");

//	A 
//	B B 
//	C C C 
//	D D D D 
//	E E E E E 

//	In ASCII encoding, 
//		'A' starts at 65, 'B' is 66, 'C' is 67, and so on.

		int alphabet = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alphabet + " ");
			}
			alphabet++;
			System.out.println();

		}

		System.out.println("-------Pattern - 16--------\n");

//		ABCDE
//		ABCD
//		ABC
//		AB
//		A

		int letter;

		for (int i = 1; i <= n; i++) {

			letter = 65;
			for (int j = n; j >= i; j--) {
				System.out.print((char) letter);
				letter++;
			}

			System.out.println();
		}

		System.out.println("-------Pattern - 17--------\n");

//	     A
//	    ABA
//	   ABCBA
//	  ABCDCBA
//	 ABCDEDCBA

		int i = 0;
		int j = 0;
		for (i = 1; i <= n; i++) {

			for (j = 1; j <= n - i; j++) {
				System.out.printf(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.printf("%c", (char) (j + 64));
			}
			for (j = i - 1; j >= 1; j--) {
				System.out.printf("%c", (char) (j + 64));
			}

			System.out.println();
		}

	}
}
