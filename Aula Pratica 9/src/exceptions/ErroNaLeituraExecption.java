package exceptions;

public class ErroNaLeituraExecption extends ErroArquivoException {
	
	public ErroNaLeituraExecption() {
		super("Erro durante a leitura do arquivo");
	}

}
