package exceptions;

public class ContatoNaoCadastradoException extends ErroArquivoException {
	
	public ContatoNaoCadastradoException() {
		super("Contato nao cadastrado!");
	}

}
