package Simulado;

public class Questao1 {
	public static void main(String[] args) {
		Competicao c1 = new Competicao();
		c1.setCidade("TB");
		Atleta a1 = new Atleta();
		Atleta a2 = new Atleta("Ana");
		Atleta a3 = new Atleta("Pedro",5,3);
		Atleta a4 = a1;
		a1.setPosicao(4);
		System.out.println(c1);//________________________________(0,5)
		System.out.println(a1);//________________________________(0,5)
		System.out.println(a2);//________________________________(0,5)
		System.out.println(a3);//________________________________(0,5)
		System.out.println(a4);//________________________________(0,5)
		Competicao c2 = c1.clone();
		c2.setNome("Meia Maratona");
		System.out.println(c2);//________________________________(0,5)
		}
}
