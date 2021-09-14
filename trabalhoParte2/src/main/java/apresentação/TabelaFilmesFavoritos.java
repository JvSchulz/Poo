package apresentação;

import javax.swing.table.AbstractTableModel;

import dados.Filmes;

public class TabelaFilmesFavoritos extends AbstractTableModel {

	private String[] colunas = { "ID", "Titulo", "Rank", "Ano" };

	private Filmes filme = new Filmes();
	private int i = 1;

	public String getColumnName(int column) {
		return colunas[column];
	}

	public int getColumnCount() {
		return colunas.length;
	}

	public int getRowCount() {
		return i;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			if (filme.getIdApi() == null) {
				return " - ";
			} else {
				return filme.getIdApi();
			}
		case 1:
			if (filme.getIdApi() == null) {
				return " - ";
			} else {
				return filme.getTitulo();
			}
		case 2:
			if (filme.getIdApi() == null) {
				return " - ";
			} else {
				return filme.getRank();
			}
		case 3:
			if (filme.getIdApi() == null) {
				return " - ";
			} else {
				return filme.getAno();
			}
		}

		return null;
	}

	public void pesquisaFilme(Filmes filme) {
		this.filme = filme;
		fireTableStructureChanged();
	}
	public void setLinha(int i) {
		this.i = i;
	}

}

