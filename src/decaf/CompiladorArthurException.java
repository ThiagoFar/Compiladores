package decaf;

@SuppressWarnings("serial")
public class CompiladorArthurException extends Exception {
	private String msg;
	
	public CompiladorArthurException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
	
	public static class VariavelNaoInstanciadaException extends CompiladorArthurException{
		public VariavelNaoInstanciadaException(String var) {
			super("Variavel '"+var+"' nao instanciada.");
		}
	}
	
	public static class MainNaoEncontradoException extends CompiladorArthurException{
		public MainNaoEncontradoException() {
			super("Metodo Main nao encontrado.");
		}
	}
	
	public static class TamanhoNaoValidoException extends CompiladorArthurException{
		public TamanhoNaoValidoException(String var) {
			super("Para array '"+var+"' tamanho tem que ser maior que 0.");
		}
	}
	
	public static class NumeroDeArgumentosMetodoInvalidoException extends CompiladorArthurException{
		public NumeroDeArgumentosMetodoInvalidoException(String nomeMetodo, String msg) {
			super("Numero de Argumentos para metodo '"+nomeMetodo+"' e "+msg+" que o instanciado");
		}
	}
	

}
