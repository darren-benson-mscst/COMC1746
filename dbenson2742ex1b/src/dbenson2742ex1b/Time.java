package dbenson2742ex1b;

import java.text.DecimalFormat;

public class Time {
	
	private int hours;
	private int minutes;
	
	public Time(int hours, int minutes) {
		super();
		this.setHours(hours);
		this.setMinutes(minutes);
	}
	
	public Time() {
		super();
		this.hours = 0;
		this.minutes = 0;
	}
	
	public Time(Time time) {
		super();
		this.hours = time.hours;
		this.minutes = time.minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		
		if (hours >= 0)
			this.hours = hours;
		else
			System.out.println("Invalid Hours: " + hours);
			
		
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		
		if (minutes >=0){
			this.minutes = minutes;
			this.simplify();
		}
		else
			System.out.println("!!! Invalid Minutes: " + minutes);
		
	}

	public void setTime(int hours, int minutes){
		
		this.setHours(hours);
		this.setMinutes(minutes);
	}
	
	public boolean equals(Time time2){
		
		boolean status;
		
		if (hours == time2.hours &&
			minutes == time2.minutes)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public Time copy(){
		
		Time timeObject = new Time(hours, minutes);
		
		return timeObject;
	}
	
	public Time simplify(){
		
		Time convert = new Time();
	
		if (minutes > 59){
			this.hours = hours + (minutes / 60);
			this.minutes = minutes % 60;
		}
		
		return convert;
	}

	@Override
	public String toString() {
		DecimalFormat fmt = new DecimalFormat("00");
		return        fmt.format(getHours()) + ":" +  fmt.format(getMinutes());
	}
	
}
