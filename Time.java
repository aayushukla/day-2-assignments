package com;
class Time {

	private int hours;
	private int minutes;

	public void setTime(int hours,int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}

	public void displayTime()
	{
		System.out.println(hours+":"+minutes);
	}

	public Time addTime(Time t)
	{
		Time obj4=new Time();
		obj4.hours=this.hours+t.hours;
		obj4.minutes=this.minutes+t.minutes;
		if(obj4.minutes>60)
		{
			obj4.minutes=obj4.minutes-60;
			obj4.hours+=1;
		}
		return obj4;
	}
}	