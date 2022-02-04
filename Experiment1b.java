class Experiment1b

{

	public static void main(String[] args)	{

		try

		{

			

			int a[] = {1,2,3,4};

			System.out.println(a[5]);

		}

		catch(ArrayIndexOutOfBoundsException e)

		{

			System.out.println(e);

		}

	}

}
