package view;

import models.Estudante;
import models.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Estudante aluno = new Estudante("Liver", "22/01/2000" , 12, "ADS");
		Professor profissao = new Professor("Jose" , "25/03/1989", 564 , "Ads");
		
		System.out.println(aluno);
		System.out.println(profissao);
	}

}
