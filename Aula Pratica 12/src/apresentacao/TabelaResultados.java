package apresentacao;

import javax.swing.table.AbstractTableModel;

import dados.Gerador;

public class TabelaResultados extends AbstractTableModel {
	
	private String[] colunas = { "Sorteado", "Somatorio", "Media Aritmetica", "Media Geometrica", "Variancia",
			"Desvio Padrao", "Amplitude" };

	private Gerador gerador = Gerador.getInstance();

	public String getColumnName(int column) {
		return colunas[column];
	}
	
	public int getColumnCount() {
		return colunas.length;
	}

	public int getRowCount() {
		return 1;
	}

	

	public Object getValueAt(int rowIndex, int columnIndex) {
		if (!gerador.getValores().isEmpty()) {
			switch (columnIndex) {
			case 0:
				return gerador.sortear();
			case 1:
				return gerador.somatorio();
			case 2:
				return gerador.mediaAritmetica();
			case 3:
				return gerador.mediaGeometrica();
			case 4:
				return gerador.variancia();
			case 5:
				return gerador.desvioPadrao();
			case 6:
				return gerador.amplitude();
			}
		} else {
			return " - ";
		}
		return null;
	}

	public void atualizar() {
		fireTableStructureChanged();
	}
}
