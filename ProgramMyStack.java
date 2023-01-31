import java.util.Scanner;

class MyStack{
	int size;
    int arr[];
    int top;
 
    MyStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }
  public void reSize(int new_size)
   {
	   int newStack[]=new int[new_size];
	   for(int i=0;i<size;i++)
	   {
		   newStack[i]=arr[i];
		   
	   }
	  arr=newStack;
	  size=new_size;
   }
  public void reduce(int new_size)
  {
	   int newStack[]=new int[new_size];
	   for(int i=0;i<new_size;i++)
	   {
		   newStack[i]=arr[i];
		   
	   }
	  arr=newStack;
	  size=new_size;
  }
    public void push(int data) {
        if (!isFull()) {
            top++;
            arr[top] = data;
            System.out.println("Pushed element:" + data);
          
        } else {
        	int value=size*2;
        	
        	reSize(value);
        	top++;
        	arr[top]=data;
        }
    }
 
    public void pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);
       
           
        } else {
            System.out.println("Stack is empty !");
          
        }
    }
 
    public void peek() {
        if(!this.isEmpty())
                     System.out.println( "Peek Element: "+ arr[top]);
                  
                else
                {
                        System.out.println("Stack is Empty");
                        
                }
    }
 
    public boolean isEmpty() {
        return (top == -1);
    }
 
    public boolean isFull() {
        return (size - 1 == top);
    }
 
}
public class ProgramMyStack {
	static void menu()
	{
		
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. peek");
		System.out.println("4. exit");
		
	}

	public static void main(String[] args) {
		menu();
		Scanner sc=new Scanner(System.in);
		
		MyStack m=new MyStack(3);
		while(true) {
			
			System.out.println("Enter the choices :");
			int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			try{
			System.out.println("Enter the element: ");
			int value=sc.nextInt();
			m.push(value);
			}catch(Exception e)
			{
			System.out.println("Enter the valid element");
			}
			
			break;
		case 2:
			m.pop();
			break;
          case 3:
			m.peek();
			break;
          case 4:
        	  System.exit(0);
        	  
		}
		sc.close();
		}
		
		
	}

}
