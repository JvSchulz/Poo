package apresentação;

import javax.swing.table.AbstractTableModel;

import dados.Atores;

public class TabelaAtores extends AbstractTableModel {

	private String[] colunas = { "ID", "Nome", "Data de Nascimento", "Sexo"};

	private Atores ator = new Atores();
	private int i =1;
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
			if (ator.getIdApi() == null) {
				return " - ";
			} else {
				return ator.getIdApi();
			}

		case 1:
			if (ator.getIdApi() == null) {
				return " - ";
			} else {
				return ator.getNome();
			}
		case 2:
			if (ator.getIdApi() == null) {
				return " - ";
			} else {
				return ator.getDataDeNascimento();
			}
		case 3:
			if (ator.getIdApi() == null) {
				return " - ";
			} else {
				return ator.getSexo();
			}
		}

		return null;
	}

	public void pesquisaElenco(Atores ator) {
		this.ator = ator;
		fireTableStructureChanged();
	}
	public void setLinha(int i) {
		this.i = i;
	}

}
