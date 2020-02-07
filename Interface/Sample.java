interface intFA
{
	public void d1();
}

interface intF
{
	public void d();
}

interface intFB extends intFA, intF
{
	public void d2();
}

class Sample implements intFB
{
	public void d1(){
		System.out.println("Display 1");
	}
	public void d2(){
		System.out.println("Display 2");
	}
	public void d(){
		System.out.println("Display");
	}

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.d1();
		obj.d2();
		obj.d();
	}
}