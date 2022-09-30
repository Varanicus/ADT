import java.util.ArrayList;

public class PQueue {

	ArrayList<Notruf> pqueue;
	
	public PQueue() {
		pqueue = new ArrayList<Notruf>();
	}
	
	public void insert(Notruf notruf) {
		
		pqueue.add(notruf);
	}
	
	public void output() {
		int i=0;
		while(i<8) {
			System.out.println("Number:" +pqueue.get(i).number +
					" Beschreibung:"+ pqueue.get(i).beschreibung +
					" Uhrzeit:"+pqueue.get(i).stunde+":"+pqueue.get(i).minute+":"+pqueue.get(i).sekunde+
					" Prio:"+pqueue.get(i).prio);
			
			i++;
		}
		
	}
	
	public int max() {
		int i=0;
		int dummyprio=1;
		while(dummyprio<4) {
			while(!empty()) {
				if(pqueue.get(i).prio==dummyprio) {
					return pqueue.get(i).number;
				}
				i++;
			}
			dummyprio++;
		}
		
		return 0;
		//s
	}
	
	
	
	public boolean empty(){
		return pqueue.isEmpty();
	}
}
