import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Auto> autos = new ArrayList<Auto>();
		autos.add(new Auto("Mercedes",1962));
		autos.add(new Auto("BMW",2001));
		autos.add(new Auto("Porsche",1999));
		autos.add(new Auto("VW",2007));
		autos.add(new Auto("Tesla",2019));
		autos.add(new Auto("Ferrari",2002));
		autos.add(new Auto("Maserati",1989));
		autos.add(new Auto("Range Rover",2010));
	
		
		for(Auto auto : autos) {
			System.out.println(auto);
		}
		
		System.out.println();
		
		Collections.sort(autos);
		for(Auto auto : autos) {
			System.out.println(auto);
		}
		Collections.reverse(autos);
		
		
		System.out.println();
		for(Auto auto : autos) {
			System.out.println(auto);
		}
	}
}

