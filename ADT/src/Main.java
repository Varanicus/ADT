import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	/*	Liste liste = new Liste(3);
		liste.add(5);
		liste.add(43);
		liste.add(9);
		liste.add(12);
		liste.add(13);
		liste.add(7);
		
		System.out.println(liste);
		
		liste.addHead(42);
		
		System.out.println(liste);
		
		
		System.out.println(liste.counter());
		
		liste.firstLast();
		
		System.out.println("\n"+liste.find(4));
		
		liste.remove(7);
		System.out.println(liste);*/
		
		Quicksort q= new Quicksort();
		int[] zuSortieren= {7,2,4,8,6,1,3,5,9,3};
		System.out.println(Arrays.toString(zuSortieren));
		q.quicksort(zuSortieren,0,9);
		System.out.println(Arrays.toString(zuSortieren));
	}

}
