
public class ListenElement {

	private int inhalt;
	private ListenElement next;

	public ListenElement(int inhalt) {
		this.inhalt = inhalt;
	}

	public void add(ListenElement neu) {
		if (next == null) {
			next = neu;
		} else {
			next.add(neu);
		}
	}

	public ListenElement getNext() {
		return next;
	}

	public int getInhalt() {
		return inhalt;
	}

	public void remove(int wert) {
		if (next != null) {
			if (next.getInhalt() == wert) {
				if (next.getNext() != null) {
					next = next.getNext();
				} else {
					next = null;
				} 
			}
			else {
				if(next!=null) {next.remove(wert);}
			}
		}
		
	}

	public int find(int wert) {
		if (inhalt == wert) {
			return inhalt;
		} else {
			if (next == null) {
				return -1;
			} else {
				return next.find(wert);
			}
		}

	}

	public void firstLast() {
		if (next == null) {
			System.out.print(inhalt);
		} else {
			next.firstLast();
		}

	}

	public String toString() {
		if (next == null) {
			return "" + inhalt;
		} else {
			return "" + inhalt + " " + next.toString();
		}
	}

	public int count() {
		if (next == null) {
			return 1;
		} else {
			return 1 + next.count();
		}

	}

	public int addition() {
		if (next == null) {
			return inhalt;
		} else {
			return inhalt + next.addition();

		}

	}
	
public boolean isEmpty() {return true;}
	

	

	
	public void remove() {
		if(next==null) {
			System.out.println(inhalt);
		
	}else {
		next.remove();
	}
		return;
}
	
	 public int getGroesse(int anzahl){
		 int zahl = anzahl+1;
		 if(next!=null){
			return next.getGroesse(zahl);}
		 
		 return zahl;
			 
		 }
	 

	 }


