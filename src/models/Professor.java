package models;

public class Professor extends Pessoa{
	private int siape;
	private String areaConcurso;
	
	
	public Professor(String nome, String dataNascimento, int siape, String areaConcurso){
		super(nome, dataNascimento);
		this.siape = siape;		
		this.areaConcurso = areaConcurso;
	}

	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}

	public String getAreaConcurso() {
		return areaConcurso;
	}

	public void setAreaConcurso(String areaConcurso) {
		this.areaConcurso = areaConcurso;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s , DataNascimento: %s, Siape: %d , AreaConcuros: %s ",this.getNome(), this.getDataNascimento(), this.getSiape(), this.getAreaConcurso());

	}
}
