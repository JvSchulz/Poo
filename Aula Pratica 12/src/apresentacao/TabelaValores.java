package apresentacao;

import javax.swing.table.AbstractTableModel;

import dados.Gerador;
import dados2.Fibonacci;
import dados2.Naturais;
import dados2.Primos;

public class TabelaValores extends AbstractTableModel {

	private String[] colunas = { "Valores" };
	private Fibonacci fibo = new Fibonacci();
	private Naturais naturais = new Naturais();
	private Primos primos = new Primos();

	private Gerador gerador = Gerador.getInstance();

	public int getColumnCount() {
		return 1;
	}

	public int getRowCount() {
		return gerador.getValores().size();
	}

	public String getColumnName(int column) {
		return colunas[column];
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return gerador.getValores().get(rowIndex);
	}

	public void adicionaValor(int valor) {
		gerador.adicionarValor(valor);
		fireTableStructureChanged();
	}
	
	public void gerarFibo(int valor) {
		gerador.setSequencia(fibo.gerar(valor));
		fireTableStructureChanged();
	}
	
	public void gerarNaturais(int valor) {
		gerador.setSequencia(naturais.gerar(valor));
		fireTableStructureChanged();
	}
	public void gerarPrimos(int valor) {
		gerador.setSequencia(primos.gerar(valor));
		fireTableStructureChanged();
	}

	public void limpar() {
		gerador.limparValores();
		fireTableStructureChanged();
	}
}
