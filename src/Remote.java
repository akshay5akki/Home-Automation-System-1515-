
public class Remote extends HAS {
	
	   private boolean on;
	private boolean Off;
	int volume;
	public Remote(String name, int no, int size) {
		super(name, no, size);
	}
	   public void turnOff() 
	   {
		   this.setOff(true);
	   }
	   
	   private void setOff(boolean off) 
	   {
		   this.Off = off;
	   }
	   
	   public boolean isOff() 
	   {
			return Off;
	   }
		
	   
	   public   void turnOn() 
	   {
	    	this.setOn(true);
	   }
	   
	   public int volumeUp() 
	   {
		   return volume++;
	   }
	   
	   public int volumeDown() 
	   {
		   return volume--;
	   }
	   
	   public boolean isOn() 
	   {
			return on;
	   }
		
	   public void setOn(boolean on) 
	   {
			this.on = on;
	   }
	 
}
