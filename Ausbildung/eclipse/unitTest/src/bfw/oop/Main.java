package bfw.oop;

public class Main {
	public static void main(String[] args) 
	{
	    Fakultaet f1 = new Fakultaet();
	    int nr = 0;
	    while(nr < 22)
	    {
	        try {
	            f1.print(nr);
	        }
	        catch(IllegalArgumentException e) {
	            System.out.println("number = " + nr + " : " + e.getMessage());
	        }
	        nr++;
	    }
	    f1.print(3);
	}
}