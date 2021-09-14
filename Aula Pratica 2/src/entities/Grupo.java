package entities;

public class Grupo {

	private Pessoa[] pessoas = new Pessoa[2];
	
	private int numPessoas = 0;	
	
	public Grupo() {
		
	}
	public void setPessoa(Pessoa p) {
		if(this.numPessoas < 2) {
			pessoas[this.numPessoas] = p;
			this.numPessoas++;
			
		}

	}
	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void ordena() {
		for(int i=0;i<2;i++) {
			for(int j= i+1;j<2;j++) {
				if(this.pessoas[j].calculoImc() > this.pessoas[i].calculoImc()) {
					Pessoa temp = this.pessoas[j];
					this.pessoas[j] = this.pessoas[i];
					this.pessoas[i] = temp;
				}
			}
		}
	}
	}

