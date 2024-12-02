// Console base examination System

import java.util.*;

class Question
{
	int id;
	String name;
	String op1;
	String op2;
	String op3;
	String op4;
	String answer;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setOp1(String op1)
	{
		this.op1=op1;
	}
	public String getOp1()
	{
		return op1;
	}
	public void setOp2(String op2)
	{
		this.op2=op2;
	}
	public String getOp2()
	{
		return op2;
	}
	public void setOp3(String op3)
	{
		this.op3=op3;
	}
	public String getOp3()
	{
		return op3;
	}	
	public void setOp4(String op4)
	{
		this.op4=op4;
	}
	public String getOp4()
	{
		return op4;
	}	
	public void setAnswer(String answer)
	{
		this.answer=answer;
	}
	public String getAnswer()
	{
		return answer;
	}
}

class Exam
{
	int exid;
	String exname;
	Question q[];
	
	public void setExamId(int exid)
	{
		this.exid=exid;
	}
	public int getExamId()
	{
		return exid;
	}
	
	public void setExamName(String exname)
	{
		this.exname=exname;
	}
	public String getExamName()
	{
		return exname;
	}

	public void setQuestion(Question q[])	
	{
		this.q=q;
	}
	public Question []getQuestion()
	{
		return q;
	}
}

class Student
{
	int id;
	String name;
	String email;
	int count;
	String contact;
	float marks;
	Exam e;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
		return contact;
	}
	public void setMarks(int count)
	{
		this.count=count;
	}
	public int getMarks()
	{	
		return count;
	}
	
	public void setExam(Exam e)
	{
		this.e=e;
	}
	public Exam getExam()
	{
		return e;
	}
}
	
class Result
{
	void operation(Exam e,Question q[],Student std[])
	{
		
		Scanner sc=new Scanner(System.in);
		String answer;
		int count=0;
		for(int i=0;i<2;i++)
		{
			System.out.printf("Enter the %d Student Id\t",i+1);
			int stdid=sc.nextInt();
			sc.nextLine();
			System.out.printf("Enter the %d Student Name\t",i+1);
			String stdname=sc.nextLine();
			System.out.printf("Enter the %d Student Email\t",i+1);
			String stdemail = sc.nextLine();
			System.out.printf("Enter the %d Student Contact\t",i+1);
			String stdcontact=sc.nextLine();
	
			std[i]=new Student();
			std[i].setId(stdid);
			std[i].setName(stdname);
			std[i].setEmail(stdemail);
			std[i].setContact(stdcontact);
			count=0;
	
			std[i].setExam(e);
			for(int j=0;j<4;j++)
			{
				System.out.printf("%d\n",q[j].getId());
				System.out.printf("%s\n",q[j].getName());
				System.out.printf("%s\t%s\t%s\t%s\n",q[j].getOp1(),q[j].getOp2(),q[j].getOp3(),q[j].getOp4());
				System.out.println("Enter the Your Answer");
				 answer=sc.nextLine();
					if(answer.equals(q[j].getAnswer()))
					{
						count++;
					} 
				
			}
			std[i].setMarks(count);
		}
	}
	
	void show(Student std[])
	{
		System.out.println("Student Id\tStudent Name\tMArks");
		for(int i=0;i<2;i++)
		{
			System.out.printf("%d\t%s\t%d\n",std[i].getId(),std[i].getName(),std[i].getMarks());
		}
	}
	
	void topperStudent(Student std[])
	{
		int max=0;
		for(int i=0;i<2;i++)
		{
			if(max<std[i].getMarks())
			{
				max=std[i].getMarks();
			}
		}
		System.out.println("The Topper Student is ");
		for(int i=0;i<4;i++)
		{
			if(max==std[i].getMarks())
			{
				System.out.printf("%d\t%s\t%d\n",std[i].getId(),std[i].getName(),std[i].getMarks());
				break;	
			}
		}	
	}
	
	void firstThreeTopper(Student std[])
	{
		for(int i=0;i<2;i++)
		{
			for(int j=i+1;j<2;j++)
			{
				int m=std[i].getMarks();
				int m1=std[i+1].getMarks();
				if(m>m1)
				{
					int temp=m;
					m=m1;
					m1=temp;
				}
			}
		}
		for(int i=0;i<2;i++)
		{
			System.out.printf("%d\t%s\t%d\n",std[i].getId(),std[i].getName(),std[i].getMarks());
		}
	}
	void failStudent()
	{
	}

}

public class ExamApplication
{
	
	public static void main(String x[])
		{
			Scanner s = new Scanner(System.in);
			Student std[] = new Student[5];
		
		Exam e = new Exam();
		Question q[] = new Question[5];
		
		Result r = new Result();
/*---------------------------------------Exam class Data ------------------------*/
   
		System.out.println("Enter the Exam Id\t");
		int exid=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Exam Name");
		String exname = s.nextLine();
		e.setExamId(exid);
		e.setExamName(exname);
	
/*---------------------------------------------------------------------------------*/

//---------------------------------------Questions------------------------

	for(int i=0;i<4;i++)
	{
		System.out.printf("Enter the Id of Question\n");
		int qid=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Question");
		String question = s.nextLine();
		System.out.println("Enter the Option 1");
		String op1=s.nextLine();
		System.out.println("Enter the Option 2");
		String op2=s.nextLine();
		System.out.println("Enter the Option 3");
		String op3=s.nextLine();
		System.out.println("Enter the Option 4");
		String op4=s.nextLine();
		System.out.println("Enter the Option Answer");
		String answer=s.nextLine();
		
		q[i] = new Question();
		q[i].setId(qid);
		q[i].setName(question);
		q[i].setOp1(op1);
		q[i].setOp2(op2);
		q[i].setOp3(op3);
		q[i].setOp4(op4);
		q[i].setAnswer(answer);
		
	}
//--------------------------------------------------------------------------------

//-----------------------------------Students Info--------------------------------------
		e.setQuestion(q);
		
				
		int a=0;
		do
		{
			System.out.println("1. Give Exam");
			System.out.println("2. Show Student Wise Result");
			System.out.println("3. Show Topper");
			System.out.println("4 . Show First Three Topper");
			System.out.println("5. Show Failed Student");
			System.out.println("Enter the 0 for exit");
			System.out.println("Enter the Choice");
			int choice = s.nextInt();
			switch(choice)
			{		
				case 1:
					r.operation(e,q,std);
					break;
				case 2:
					r.show(std);
					break;
				case 3:
					r.topperStudent(std);
					break;
				case 4:
					r.firstThreeTopper(std);
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid Input");
			}
			System.out.println("Do You Want To Continue? Yes=1 or No 0");
			a=s.nextInt();
		}while(a!=0);	
		
	}
}