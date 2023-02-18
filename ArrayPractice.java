class ArrayPractice 
{
	public static void main(String[] args) 
	{
		//Declaration of an array

		int a[] = new int[5]; //fixed : when we know the size

		//inserting values
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
					//inserting values
		int b[] = {10,20,30,40,50,60}; //dynamic : when we dont know the size
		
		//finding size of an array
		System.out.println("size of an array a: "+a.length);
		//reading an array
		for(int read:a)
		{
			System.out.println(read);
		}

		System.out.println("--------------------------------------------------");
		
		//finding size of an array
		System.out.println("size of an array b: "+b.length);
		for(int read:b)
		{
			System.out.println(read);
		}


		
	}
}
