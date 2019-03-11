class Television {

	boolean stateOfTelevision=false;
	int volume;
	int channelNumber;
	
	public void state(boolean stateOfTelevision)
	{
		this.stateOfTelevision=stateOfTelevision;
		if(stateOfTelevision)
		{
			System.out.println("Tv turned on!");
		}
		else
			System.out.println("Tv turned off!");
			System.exit(0);
	}
	
	public int changeVolume(int volume)
	{
		this.volume=volume;
		return volume;
	}

	public 	int changeChannel(int channelNumber)
	{
		this.channelNumber=channelNumber;
		return channelNumber;
	}

	public void displayStat()
	{	
		if(stateOfTelevision==true)
		{
			System.out.println("Status: ON");
		}
		else
		{
			System.out.println("Status: OFF");
		}
		System.out.println("Volume:"+" "+volume);
		System.out.println("Channel number:"+" "+channelNumber);
	}
}