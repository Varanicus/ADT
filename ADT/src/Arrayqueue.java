
public class Arrayqueue {
	private static int[] stapel;
	private static int tos;

	public Arrayqueue() {
		stapel = new int[100];
		tos = 0;
	}

	public static void ausgabe() {

		int dummy = 0;
		while (dummy != tos) {

			System.out.print(stapel[dummy] + " ");
			dummy++;

		}

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

	public int top() {
		if (!empty())
			return stapel[0];
		else
			return -1;
	}

	public boolean empty() {
		return (tos == -1);
	}

}
