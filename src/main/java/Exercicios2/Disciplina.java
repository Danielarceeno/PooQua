package Exercicios2;

public class Disciplina {
	String nome;
	int cargH;
	private Professor professor = new Professor();

	public Disciplina() {
		setNome("POO");
	}
	
	public Disciplina(String nome, int cargH, Professor professor) {
		this.nome = nome;
		this.cargH = cargH;
		this.professor = professor;
		
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargH() {
		return cargH;
	}

	public void setCargH(int cargH) {
		this.cargH = cargH;
	}

	

}
