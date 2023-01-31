import java.util.Scanner;

public class SwitchStack {
public void switchStack()
{
	Scanner sc =new Scanner(System.in); 
	MyStack st=new MyStack(3);
	boolean b=true;
	try {
	while(b)
	{
		
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.println("4.Exit");
	System.out.println("Enter the choice ");
	
	int	ch=sc.nextInt();
		switch(ch)
		{
		case 1 :
			try {
			System.out.println("Enter the Element :");
			int value=sc.nextInt();
			st.push(value);
			}catch(Exception e)
			{
				System.out.println("Enter the integer input");
			}
		break;
		
		case 2:
			st.pop();
			break;
		case 3:
			st.peek();
			break;
		case 4:
			b=false;
			break;
		}
		System.out.println();
		System.out.println("--------xxx---------xxx---------");
		
	}
		
	}catch(Exception e)
	{
		System.out.println("Enter the Valid Value");
	}
	

}
}
