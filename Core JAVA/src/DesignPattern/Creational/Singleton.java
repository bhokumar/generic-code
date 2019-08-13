package DesignPattern.Creational;

import java.io.Serializable;

public class Singleton implements Serializable{

	private static final Singleton SINGLETON = new Singleton();
	
	private static Singleton ss;
	
	private static Singleton ss1;
	
	private static class BILL_PUGH{
		private static Singleton sso = new Singleton();
	}
	static {
		try
		{
			ss = new Singleton();
		}
		catch(Exception e)
		{
			
		}
	}
	private Singleton()
	{
		
	}
	
	public static void main(String[] args) {
		eagerInitialization();

	}
	
	public static Singleton eagerInitialization()
	{
		return SINGLETON;
	}

	public static Singleton staticBlockInitialization()
	{
		return ss;
	}
	

	public static Singleton lazyInitialization()
	{
		if(ss1 == null)
		{
			ss1 = new Singleton();
		}
		
		return ss1;
	}

	public static Singleton threadSafeInitialization()
	{
		if(ss1 == null)
		{
			synchronized (Singleton.class) {
				if(ss1 == null)
				{
					
					ss1 = new Singleton();
				}
			}
		}
		
		return ss1;
	}
	
	public static Singleton billPughInitialization()
	{
		return BILL_PUGH.sso;
	}
	
	private int i = 10;
	 
    public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
    
    protected Object readResolve() {
        return billPughInitialization();
    }
}
