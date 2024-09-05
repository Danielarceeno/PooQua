package Prova;

public class Questao4 {

		 public static void main(String[] args) {
		
			        int integrantes = 10;
			        transforma(integrantes);  
			        
			        Banda b = new Banda();
			        b.cadastra("A", "B", integrantes);
			        System.out.println(b.exibir()); // 4a

			        b.setNrIntegrantes(transformaX(integrantes));
			        System.out.println(b.exibir()); // 4b

			        transforma(b);
			        System.out.println(b.exibir()); // 4c
			    }

			    public static void transforma(Banda x) {
			        x.setNome("X");
			    }

			    public static void transforma(int x) {
			        x = x + 2;  
			    }

			    public static int transformaX(int x) {
			        return x + 2;
			    }
			}