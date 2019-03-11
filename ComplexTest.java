class ComplexTest {

	public static void main(String[] args)
	{
		ComplexNumber obj= new ComplexNumber();
		ComplexNumber obj1=new ComplexNumber();

		obj.settingComplexNumber(1,2);
		obj.display();

		obj1.settingComplexNumber(1,2);
		obj1.display();

		ComplexNumber obj3;
		obj3=obj.additionOfComplexNumber(obj1);
		obj3.display();
			
	}
}