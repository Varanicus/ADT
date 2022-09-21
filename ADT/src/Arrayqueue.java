
public class Arrayqueue {
	private  int[] stapel;
	private  Arrayqueue stapel2;
	private  int tos;

	public Arrayqueue() {
		stapel = new int[100];
		tos = 0;
	}

	public void ausgabe() {

		int dummy = 0;
		while (dummy != tos) {

			System.out.print(stapel[dummy] + " ");
			dummy++;

		}
		System.out.println(" ");

	}

	public void enqueue(int x) {
		if (tos < 99) {

			stapel[tos] = x;
			// System.out.print(x + " ");
			tos++;

		}
	}

	public void dequeue() {
		for (int i = 0; i < tos; i++) {

			stapel[i] = stapel[i + 1];

		}
		tos--;
	}
	
	public void concet(Arrayqueue stapel2) {
		 this.stapel2=stapel2;
		tos++;
		while(!stapel2.empty()) {
			stapel[tos-1]=stapel2.front();
			stapel2.dequeue();
			tos++;
		}

	}
	

	public int front() {
		if (!empty())
			return stapel[0];
		else
			return -999;
	}

	public boolean empty() {
		return (tos == -1);
	}

}
