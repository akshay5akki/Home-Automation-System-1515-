import java.rmi.Remote;

public interface wm extends Remote 
{
	public int on=1, off=0;

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

	   public boolean isOn() 
	   {
			return on;
	   }
		
	   public void setOn(boolean on) 
	   {
			this.on = on;
	   }
	 

}
