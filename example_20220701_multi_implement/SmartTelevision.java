package sec03.exam03_multi_implement_class;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println(" ");
	}	
	public void turnOff() {
		System.out.println(" ");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" " + volume);
	}
	
	public void search(String url) {
		System.out.println(url + " ");
	}
}
