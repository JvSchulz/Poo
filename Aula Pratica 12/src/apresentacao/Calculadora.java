package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JTable tabelaValores;
	private TabelaValores valores = new TabelaValores();
	private JScrollPane painelScrollTabelaValores = new JScrollPane();
	private JTable tabelaResultados;
	private TabelaResultados resultados = new TabelaResultados();
	private JScrollPane painelScrollTabelaResultados = new JScrollPane();
	private JButton botaoFibo = new JButton("Fibonacci");
	private JButton botaoPrimo = new JButton("Primos");
	private JButton botaoNatural = new JButton("Naturais");
	private JButton botaoLimpar = new JButton("limpar");
	private JButton botaoLimpar2 = new JButton("limpar");
	private JButton botaoAdicionar = new JButton("adicionar");
	private JTextField caixaTexto = new JTextField();
	private JTextField caixaTextoGerador = new JTextField();
	private JLabel infoCaixaTexto = new JLabel("Digite um valor:");
	private JLabel infoCaixaTexto2 = new JLabel("Gerar Valores");
	private JPanel painelEntrada = new JPanel();
	private JPanel painelEntradaGerador = new JPanel();
	private JPanel painel = new JPanel();

	public static void main(String[] args) {
		Calculadora frame = new Calculadora();
		frame.setVisible(true);
	}

	/*painelScrollTabelaFilme.setBounds(25, 0, 483, 206);
		painelFilme.add(painelScrollTabelaFilme);
		tabelaFilmes = new JTable(tfilmes);*/
	public Calculadora() {

		setTitle("Calculadora Estatistica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 400);
		setContentPane(painel);
		painel.setLayout(null);
		painelEntrada.setBounds(15, 80, 280, 173);
		painelEntrada.setLayout(null);
		painel.add(painelEntrada);
		painelEntradaGerador.setBounds(610, 80, 280, 320);
		painelEntradaGerador.setLayout(null);
		painel.add(painelEntradaGerador);
		infoCaixaTexto.setBounds(30, 30, 200, 15);
		painelEntrada.add(infoCaixaTexto);
		infoCaixaTexto2.setBounds(30, 30, 200, 15);
		painelEntradaGerador.add(infoCaixaTexto2);
		caixaTexto.setBounds(30, 50, 200, 20);
		painelEntrada.add(caixaTexto);
		caixaTextoGerador.setBounds(30, 50, 200, 20);
		painelEntradaGerador.add(caixaTextoGerador);
		botaoAdicionar.setBounds(77, 94, 117, 25);
		painelEntrada.add(botaoAdicionar);
		botaoLimpar.setBounds(77, 136, 117, 25);
		painelEntrada.add(botaoLimpar);
		botaoLimpar2.setBounds(77, 220, 117, 25);
		painelEntradaGerador.add(botaoLimpar2);
		botaoFibo.setBounds(77,94,117,25);
		painelEntradaGerador.add(botaoFibo);
		botaoPrimo.setBounds(77, 136, 117, 25);
		painelEntradaGerador.add(botaoPrimo);
		botaoNatural.setBounds(77, 178, 117, 25);
		painelEntradaGerador.add(botaoNatural);
		painelScrollTabelaResultados.setBounds(10, 10, 880, 50);
		painel.add(painelScrollTabelaResultados);
		tabelaResultados = new JTable(resultados);
		painelScrollTabelaResultados.setViewportView(tabelaResultados);
		painelScrollTabelaValores.setBounds(370, 105, 173, 173);
		painel.add(painelScrollTabelaValores);
		tabelaValores = new JTable(valores);
		painelScrollTabelaValores.setViewportView(tabelaValores);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				valores.adicionaValor(Integer.parseInt(caixaTexto.getText()));
				resultados.atualizar();
				caixaTexto.setText("");
			}
		});
		botaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				valores.limpar();
				resultados.atualizar();
			}
		});
		botaoLimpar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				valores.limpar();
				resultados.atualizar();
			}
		});
		botaoFibo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				valores.gerarFibo(Integer.parseInt(caixaTextoGerador.getText()));
				resultados.atualizar();
				caixaTexto.setText("");
			}
		});
		botaoPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				valores.gerarPrimos(Integer.parseInt(caixaTextoGerador.getText()));
				resultados.atualizar();
				caixaTexto.setText("");
			}
		});
		botaoNatural.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				valores.gerarNaturais(Integer.parseInt(caixaTextoGerador.getText()));
				resultados.atualizar();
				caixaTexto.setText("");
			}
		});
	}

}
