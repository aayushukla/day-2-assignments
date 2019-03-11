class timeTest {

	public static void main(String[] args)
	{
		Time obj1=new Time();
		Time obj2=new Time();

		obj1.setTime(10,45);
		obj1.displayTime();

		obj2.setTime(12,45);
		obj2.displayTime();	

		Time obj3;
		obj3=obj1.addTime(obj2);	
		obj3.displayTime();
	}

}	