package classes;

import java.util.ArrayList;

public class Pessoa {
	public String nome;
	public int matricula;
	public ArrayList<ContraCheque> contracheques;
	
	public Pessoa() {
		contracheques = new ArrayList<ContraCheque>();
	}

}
