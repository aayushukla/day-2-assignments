class distanceTest {

	public static void main(String[] args)
	{
		Distance obj1=new Distance();
		Distance obj2=new Distance();

		obj1.set(10,6.5);
		obj1.display();

		obj2.set(14,3.56);
		obj2.display();	
		
		Distance obj4;
		obj4=obj1.addDistance(obj2);
		obj4.display();
	}

}	