import java.util.Scanner;
class AllBasicPrograms 
{
	public static void main(String[] args) 
	{ 
		//Even or Odd
		/*int n;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();

		if (n%2==0)
		{
			System.out.println(n+" is an even number");
		}
		else
			System.out.println(n+" is an odd number");
		*/

//--------------------------------------------------------------------

		//Largest number from 3 numbers
		/*int a,b,c;
		System.out.println("Enter number a :");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter number b :");
		b=sc.nextInt();
		System.out.println("Enter number c :");
		c=sc.nextInt();

		if (a>b && a>c)
		{
			System.out.println(a+"is greatest");
		}
		else if (b>c && b>a)
		{
			System.out.println(b+"is greatest");
		}
		else
			System.out.println(c+"is greatest");
			*/

//-------------------------------------------------------------------------------

		//swapping of 3 numbers

		/*int a=1,b=2,c=3,temp=0;

		temp=a;
		a=b;
		b=c;
		c=temp;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/

//--------------------------------------------------------------------

		//Multiplication table of a number
		
		//using for loop
		/*int n,result=1,i=1;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);

		for (n=sc.nextInt() ; i<=10 ;i++ )
		{
			result=n*i;
			System.out.println(result);
		}*/

		//using do while loop
		/*int n=5,i=1,result;
		do
		{
			result=n*i;
			i++;
			System.out.println(result);
		}
		while (i<=10);
		*/

		//using while loop
		/*int n=5,i=1,res;
		while (i<=10)
		{
			res=n*i;
			i++;
			System.out.println(res);
		}*/

//--------------------------------------------------------------------

		//positive negative number
		/*System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>0)
			System.out.println("number is positive");
		else
			System.out.println("number is negative");
		*/

//--------------------------------------------------------------------

		//count of numbers in digit
		/*int count=0;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		*/

//--------------------------------------------------------------------

		//factorial 
		/*int n,result=1;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();

		while(n>1)
		{
			result=result*n;
			n--;
		}
		System.out.println(result);
		*/


		

	}
}
