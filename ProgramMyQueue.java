class MyQueue
{
	int arr[];
	int size;
	int front;
	int rear;
	int count=0;
	public MyQueue( int size) {
		super();
		this.size = size;
		this.arr = new int[size];
		this.front = 0;
		this.rear = -1;
		
	}
	public boolean isQueueFull()
	{
		if(rear==size-1)
		{
			return true;
		}
		return false;
	}
	public boolean isQueueEmpty()
	{
		if(count==0)
			return true;
		return false;
	}
	
	public void reSize(int new_size)
	{
      int newQueue[]=new int[new_size];
      for(int i=0;i<size;i++)
      {
    	  newQueue[i]=arr[i];
      }
      arr=newQueue;
      size=new_size;
	}
	
    public void enqueue(int n)
    {
    	if(!isQueueFull())
    	{
    		count++;
    		rear++;
    		arr[rear]=n;
    		System.out.println("enqueue element: "+n);
    	}else
    	{
            count++;
    		reSize(size*2);
    		rear++;
    		System.out.println(size);
    		arr[rear]=n;
    		System.out.println("enqueue element: "+n);
    	}
    }
    public void dequeue()
    {
    	if(isQueueEmpty())
    	{
    		System.out.println("Queue is Empty");
    	}
    	else
    	if(!isQueueEmpty()) {
        	front++;
        	count--;
        	System.out.println("dequeue element: "+arr[front-1]);
        	
        	}
    }
    public void front()
    {
    	if(!isQueueEmpty()) {
        
        	System.out.println("front element: "+arr[front]);
        	
        	}else {
        		System.out.println("Queue is empty!");
        	}
    }
    public void rear()
    {
    	if(!isQueueEmpty()) {
        	
        	System.out.println("rear element: "+arr[rear]);
        	
        	}else {
        		System.out.println("Queue is empty!");
        	}
    }
    public void display()
    {
    	if(isQueueEmpty())
    	{
    		System.out.println("Queue is empty!");
    	}else {
    	for(int i=front;i<=rear;i++)
    	{
    		System.out.print(arr[i]+", ");
    	}}
    }

}
public class ProgramMyQueue {

	public static void main(String[] args) {
		
	   
	}

}
