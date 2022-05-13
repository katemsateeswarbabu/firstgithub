package edubridge;

public class Javaprogramsateeswarbabu {

	public static void main(String[] args) 
	{
		Operations op=new Operations();
		op.Addition();
		op.Subtraction();
		op.Multiplication();
		op.LogicalAND();
		op.LogicalOR();
		op.LogicalNOT();
		op.EqualsTo();
		op.Greater();
		op.Smaller();
		op.BitwiseAND();
		op.BitwiseOR();
	    op.BitwiseXOR();
	    op.Increment();
		op.Decrement();
	    

	}

}
class Operations implements Arithematic,Logical,Comparison,Bitwise,Incrementdecrement
{
	static int a=10,b=20,c=30;
	
	public void Addition()
	{
		System.out.println("Arithematic");
		System.out.println("Addition="+(a+b));
	}
	public void Subtraction()
	{
		System.out.println("Subtraction="+(a-b));
	}
	public void Multiplication()
	{
		System.out.println("Multiplication="+(a*b));
		System.out.println("------------------------------------------------------------------------------------");
	}
	
	public void LogicalAND()
	{
		System.out.println("Logical");
		System.out.println((a>b)&&(a>c));
		
	}
	public void LogicalOR()
	{
		System.out.println((a<b)||(a<c));
		
	}
	public void LogicalNOT()
	{
		System.out.println(!(a==b));
		System.out.println("------------------------------------------------------------------------------------");
	}
	
	
	public void EqualsTo()
	{
		System.out.println("Comparison");
		System.out.println(a==b);
	}
	public void Greater()
	{
		System.out.println(a>b);
	}
	public void Smaller()
	{
		System.out.println(a<b);
		System.out.println("------------------------------------------------------------------------------------");
	}
	
	public void BitwiseAND()
	{
		System.out.println("Bitwise");
		System.out.println("10=01010 & 20=10100=00000=="+(a&b));//both bits 1,it gives 1,else it gives 0;
	}
	public void BitwiseOR()
	{
		System.out.println("10=01010 | 20=10100=11110=="+(a|b));//either of bits is 1,it gives 1,else it gives 0;
	}
	public void BitwiseXOR()
	{
		System.out.println("10=01010 ^ 20=10100=11110=="+(a^b));//corresponding bits different,it gives 1,else it gives 0;
		System.out.println("------------------------------------------------------------------------------------");
	}
	
	
	public void Increment()
	{
		System.out.println("Increment and Decrement");
		System.out.println("before increment"+a++);
		System.out.println("before increment"+b++);
		System.out.println("after increment"+a);
		System.out.println("after increment"+b);
	}
	public void Decrement()
	{
		System.out.println("before decrement"+a--);
		System.out.println("before decrement"+b--);
		System.out.println("after decrement"+a);
		System.out.println("after decrement"+b);
		System.out.println("------------------------------------------------------------------------------------");
	}
	


}
interface Arithematic
{
	
	void Addition();
	public void Subtraction();
	public void Multiplication();
}
interface Logical
{
	void LogicalAND();
	void LogicalOR();
	void LogicalNOT();
	
}

interface Comparison
{
	
	void EqualsTo();
	void Greater();
	void Smaller();
	
}

interface Bitwise
{
	void BitwiseAND();
	void BitwiseOR();
	void BitwiseXOR();
	
}
interface Incrementdecrement
{
	void Increment();
	void Decrement();
}
