
public class Clock {
	private int seconds;
	private int minutes;
	private int hours;
	
	public void setHours(int h) {
		if(h >= 0 && h <= 23) {
			hours = h;
		} else {
			hours = 0;
		}
		
	}
	
	public void setMinutes(int m) {
		if(m >= 0 && m <= 59) {
			minutes = m;
		} else {
			minutes = 0;
		}
	}
	
	public void setSeconds (int s) {
		if(s >= 0 && s <= 59) {
			seconds = s;
		} else {
			seconds = 0;
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void printclock() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}

}
