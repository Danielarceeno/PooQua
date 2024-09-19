package Simulado;

public class Q4 {
	static int x = 10;
	int y = 5;

	public static void main(String[] args) {
		Q4 a = new Q4();
		Q4 b = new Q4();
		a.x = a.x + a.y;
		b.x = b.x + b.y;
		a.y = a.x + 1;
		b.y = a.y + b.y;
		Q4.x = 0;
		System.out.println(a.x);// ________________________________(0,5)
		System.out.println(a.y);// ________________________________(0,5)
		System.out.println(b.x);// ________________________________(0,5)
		System.out.println(b.y);// ________________________________(0,5)
	}

}
