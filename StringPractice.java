class StringPractice 
{
	public static void main(String[] args) 
	{
		String s = "Pournima";
		String a = "PourNima";
		String s1 = "Ghanmode";
		String s2 = "      hello  ";
		String s3 = "Welcome to Java";
		String s4 = "INDIA";
		String s5 = "maharashtra";

		System.out.println(s); //printing string

		System.out.println("size of the string is :"+s.length()); //prints size of the string

		System.out.println(s.concat(s1)); //concatenation of two strings

		System.out.println(s2);

		System.out.println(s2.trim()); //trimming unwanted or extra part

		System.out.println(s.charAt(4)); //prints char value at the given index number

		System.out.println(s1.contains("nmo")); //returns true if this sequence is present in string

		System.out.println(s.equals(a)); //compares value with string returns true if right

		System.out.println(s.equalsIgnoreCase("pournima")); //ignores upper/lowercase returns same string

		System.out.println(s.replace('u','o')); //replaces old char with new

		System.out.println(s3.replace("Java","Selenium")); //replaces old word with new word

		System.out.println(s.substring(2,6)); //returns string from starting & ending point

		System.out.println(s4.toLowerCase()); //returns string in lowercase letter

		System.out.println(s5.toUpperCase()); //returns string in uppercase letter
	}
}
