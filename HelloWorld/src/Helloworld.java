
public class Helloworld {
	public static void main(String[] args)
	{
		ausgabe();
		System.out.println("Die addition von a und b ist ="+addition(3, 4));
	}
	
	public static void ausgabe()
	{
		System.out.println("HalloWelt");
	}
	
	public static int addition(int a, int b)
	{
		return (a+b);
	}
	
}
