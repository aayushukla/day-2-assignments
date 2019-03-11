class RectangleResults {

	public static void main(String[] args)
	{
		Rectangle obj=new Rectangle(10,20);
		System.out.println("Area of rectangle A is="+obj.areaOfRectangle());
		System.out.println("Perimeter of rectangle A is="+obj.perimeterOfRectangle());
		
		Rectangle obj1=new Rectangle(20,10);
		System.out.println("Area of rectangle B is="+obj1.areaOfRectangle());
		System.out.println("Perimeter of rectangle B is="+obj1.perimeterOfRectangle());

		if(obj.areaOfRectangle()==obj1.areaOfRectangle())
		{
			System.out.println("Areas are even");
		}
	}
}