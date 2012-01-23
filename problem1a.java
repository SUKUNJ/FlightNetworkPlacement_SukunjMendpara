class stcdemo
{
	int []s=new int[9];
		
	int tos;
	
	stcdemo()
	{
		tos=-1;
	}

	void push(int n)
	{
		if(isfull())
		{
			System.out.println("Stack is full.....");
		}		
		else
		{
			if(tos==-1)
			{
				s[++tos]=n;		
				System.out.println("pushed element is....."+n);

			}
			else if(n==(s[tos]+1))
			{
				s[++tos]=n;		
				System.out.println("pushed element is....."+n);
			}
			else
			{
				System.out.println("wrong input...");
			}
		}
	}	

	int pop()
	{
		if(isempty())
		{
			System.out.println("Stack is empty.....");
			return 0;
		}
		else
		{
			return(s[tos--]);
		}
	}

	boolean isfull()
	{
		if(tos==9)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	boolean isempty()
	{
		if (tos<0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	void display()
	{
		for(int i=0;i<tos;i++)	
		{
			System.out.print("-->"+s[i]);
		}
	}
	
}


class problem1a
{
	public static void main(String[] a)
	{
		stcdemo obj=new stcdemo();
		
		for(int i=0;i<10;i++)
		{	
			
			if(a[i].equals("push"))
			{
				int ele1=Integer.parseInt(a[i+1]);	
				obj.push(ele1);
				i++;	
			}
			else if(a[i].equals("pop"))
			{
			//	System.out.println(obj.tos);
				while(obj.tos>0)
				{
					int ppv=obj.pop();
					System.out.println("popped element is..."+ppv);
					
				}
			int ppv=obj.pop();
			System.out.println("popped element is..."+ppv);
				
			}
			else
			{
					break;
			}

	
		}
	}
}