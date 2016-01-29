package arrayautos;
import java.util.*;
public class OrdenAutos {

	public static void main(String[] args) {

		Autos[] autos = new Autos[5];
		
		for(int i= 0; i < autos.length-1; i++) {
			String pat = "ABC"+i+i+i;
			System.out.println(pat);
			autos[i] = new Autos("Ford", "Fiesta", "rojo", pat);
		}
		autos[4] = new Autos("Ford", "Fiesta", "rojo", "AAA001");
		
		Arrays.sort(autos, 0, autos.length);
		
		for (Autos auto : autos) {
			System.out.println(auto.getInfo());
		}
	}
}
