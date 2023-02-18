class StudentData
{
	int sid;
	String sname;
	int sub1;
	int sub2;
	int sub3;

	void getStuData(int id, String name)
	{
		sid=id;
		sname=name;
	}

	void getStuMarks(int english,int maths,int science)
	{
		sub1=english;
		sub2=maths;
		sub3=science;
	}

	void totalMarks()
	{
		int res = sub1+sub2+sub3;
		System.out.println(sid+" "+sname+" "+res);
	}
	public static void main(String[] args) 
	{
		StudentData stu1 = new StudentData();
		stu1.getStuData(101,"Henry");
		stu1.getStuMarks(78,85,88);
		stu1.totalMarks();

		StudentData stu2 = new StudentData();
		stu2.getStuData(102,"Cavill");
		stu2.getStuMarks(88,90,91);
		stu2.totalMarks();
	}
}
