class Distance {

	int feet;
	double inches;

	public void set(int feet,double inches)
	{
		this.feet=feet;
		this.inches=inches;
	}

	public void display()
	{
		System.out.println(feet+" feet and"+ inches+" inches");
	}

	public Distance addDistance(Distance d)
	{
		Distance obj3=new Distance();
		obj3.feet=this.feet+d.feet;
		obj3.inches=this.inches+d.inches;
		return obj3;
	}

}