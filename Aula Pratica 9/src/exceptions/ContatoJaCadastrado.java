package exceptions;

public class ContatoJaCadastrado extends ErroArquivoException{
	
	public ContatoJaCadastrado() {
		super("Contato ja cadastrado!");
	}

}
