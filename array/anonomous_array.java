class anonomous_array
{

	void add_array (int[] a)
	{
		int total=0;
		for(int i:a)
			total +=i;
		{
			System.out.println(total);
		}
	}
	public static void main(String[] args) {
		anonomous_array obj=new anonomous_array();
			obj.add_array(new int[] {1,2,3});
	}
}