interface InterfaceTest
{
	public void square(int a);

	default void show()
	{
		System.out.println("Default Method.");
	}
}

class testClass implements InterfaceTest
{
	public void square(int a)
	{
		System.out.println(a*a);
	}

	public static void main(String[] args) {
		testClass obj = new testClass();
		obj.square(4);
		obj.show();
	}
}