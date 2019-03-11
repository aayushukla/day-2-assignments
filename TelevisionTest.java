import java.util.*;
class TelevisionTest {

	public static void main(String[] args)
	{
		Television obj1=new Television();
		Scanner sc=new Scanner(System.in);		

		System.out.println("Wanna turn on the television? Press true to turn on else press false");
		
			obj1.state(sc.nextBoolean());
		
		System.out.println("How much volume you want?");
			obj1.changeVolume(sc.nextInt());

		System.out.println("Which channel number you wanna see?");
			obj1.changeChannel(sc.nextInt());
		obj1.displayStat();
	}
}
