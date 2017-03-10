package st_lab1;

public class Triangle {
	
    public int getKind(int a, int b, int c)
    {
   	int Kind = 3;
		if(a + b <= c || a+c <= b || b+c <= a)
		{
			Kind = -1;
			return Kind;
		}
		
		if( a == b && b == c)
		{
			Kind = 0;
			return Kind;
		}
		else if(a == c || b == c || a == b)
		{
			Kind = 1;
			return Kind;
		}
		else
		{
			Kind = 2;
			return Kind;
		}
    }
    public static void main(String args[])
	{
		
		Triangle triangle = new Triangle();
		System.out.println(triangle.getKind(1, 2, 3));
		
	}



}
