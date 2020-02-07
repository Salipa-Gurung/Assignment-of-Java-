interface intFO
{
	public void dis();

	interface intFI
	{
		public void show();
	}
}

class test implements intFO.intFI, intFO
{
	public void show(){
		System.out.println("Nested interface");
	}

	public void dis(){
		System.out.println("Outer Interface");
	}

	public static void main(String[] args) {
		intFO.intFI obj = new test();
		intFO ob = new test();
			obj.show();
			ob.dis();
	}
}