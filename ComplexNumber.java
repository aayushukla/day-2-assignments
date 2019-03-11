class ComplexNumber {

	private double real;
	private double imaginary;
	
	public void settingComplexNumber(double real,double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}

	public void display()
	{
		System.out.println("The complex number is :"+ real + "+ i" + imaginary);		
	}

	public ComplexNumber additionOfComplexNumber(ComplexNumber c2)
	{
		ComplexNumber c3=new ComplexNumber();
		c3.real=this.real+c2.real;
		c3.imaginary=this.imaginary+c2.imaginary;
		return c3;
	}

}