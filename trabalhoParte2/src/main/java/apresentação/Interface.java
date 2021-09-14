package apresentação;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import dados.Atores;
import dados.Filmes;
import exception.InsertException;
import exception.SelectException;
import negocio.Sistema;
import request.Api;

public class Interface extends JFrame {

	private Api api = Api.getInstance();
	private JPanel contentPane = new JPanel();
	private Filmes filme = new Filmes();
	private JButton botaoFavFilme = new JButton("Salvar Filme");
	private JButton botaoPesquisa = new JButton("Pesquisar");
	private JPanel painelPesquisa = new JPanel();
	private TabelaFilmes tFilmes = new TabelaFilmes();
	private TabelaFilmesFavoritos tFilmesFav = new TabelaFilmesFavoritos();
	private JTextField pesquisaTitulo = new JTextField();
	private JScrollPane painelScrollTabelaFilme = new JScrollPane();
	private JScrollPane painelScrollTabelaFilmeFav = new JScrollPane();
	private JScrollPane painelScrollTabelaAtoresFav = new JScrollPane();
	private JTable tabelaFilmes;
	private JTable tabelaFilmesFav;
	private JTable tabelaAtoresFav;
	private TabelaAtores tAtores = new TabelaAtores();
	private JComboBox<String> comboBox = new JComboBox<String>();
	private HashMap<String, Atores> atores = new HashMap<String, Atores>();
	private JButton botaoVerAtor = new JButton("Ver ator");
	private URL url = new URL("https://c4.wallpaperflare.com/wallpaper/783/279/828/simple-background-simple-space-astronaut-wallpaper-preview.jpg");
	private JLabel caixaTextoPesquisa = new JLabel("Digite o titulo do filme:");
	private final JLabel imgFilme = new JLabel("");
	private final JLabel backGround = new JLabel("New label");
	private final JLabel imgAtor = new JLabel("");

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interface() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 620);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Calibri", Font.PLAIN, 18));

		painelPesquisa.setBounds(22, 45, 236, 13);
		contentPane.add(painelPesquisa);
		painelPesquisa.setLayout(null);
		caixaTextoPesquisa.setBounds(1, 1, 251, 12);
		painelPesquisa.add(caixaTextoPesquisa);
		caixaTextoPesquisa.setForeground(Color.BLACK);
		caixaTextoPesquisa.setBackground(Color.LIGHT_GRAY);
		caixaTextoPesquisa.setFont(new Font("Castellar", Font.PLAIN, 15));
		botaoPesquisa.setBounds(306, 59, 99, 23);
		contentPane.add(botaoPesquisa);

		botaoPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				try {
					textArea.setText(null);
					imgAtor.setIcon(null);
					comboBox.removeAllItems();
					filme = api.procuraFilme(pesquisaTitulo.getText());
					tFilmes.pesquisaFilme(filme);
					for (Atores ator : filme.getElenco()) {
						atores.put(ator.getNome(), ator);
						comboBox.addItem(ator.getNome());
					}
					comboBox.setLayout(new BorderLayout());
					BufferedImage image = null;
					image = ImageIO.read(filme.getUrl());
					Image dImg = image.getScaledInstance(imgFilme.getWidth(), imgFilme.getHeight(), Image.SCALE_SMOOTH);
					imgFilme.setIcon(new ImageIcon(dImg));

				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		botaoFavFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				try {
					Sistema sistema = new Sistema("967252");
					sistema.inserirFilmes(filme);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (SelectException e) {
					e.printStackTrace();
				} catch (InsertException e) {
					e.printStackTrace();
				}

			}
		});
		pesquisaTitulo.setBounds(22, 60, 274, 21);
		contentPane.add(pesquisaTitulo);
		pesquisaTitulo.setToolTipText("Ex.: Game of Thrones");
		tabelaFilmes = new JTable(tFilmes);
		painelScrollTabelaFilme.setBounds(20, 104, 385, 53);
		contentPane.add(painelScrollTabelaFilme);
		painelScrollTabelaFilme.setViewportView(tabelaFilmes);
		comboBox.setBounds(22, 175, 275, 20);
		contentPane.add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(21, 208, 385, 333);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		botaoVerAtor.setBounds(306, 175, 99, 20);
		contentPane.add(botaoVerAtor);

		botaoVerAtor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				String nome = (String) comboBox.getSelectedItem();
				Atores atorSelecionado = atores.get(nome);
				textArea.setText(getInfoAtor(atorSelecionado));
				try {
					BufferedImage image = null;
					image = ImageIO.read(atorSelecionado.getUrl());
					Image dImg = image.getScaledInstance(imgAtor.getWidth(), imgAtor.getHeight(), Image.SCALE_SMOOTH);
					imgAtor.setIcon(new ImageIcon(dImg));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		botaoFavFilme.setBounds(22, 547, 104, 23);
		contentPane.add(botaoFavFilme);
		JButton botaoFilmesFav = new JButton("Filmes Fav.");
		botaoFilmesFav.setBounds(312, 547, 96, 23);
		contentPane.add(botaoFilmesFav);
		tabelaFilmesFav = new JTable(tFilmesFav);
		painelScrollTabelaFilmeFav.setBounds(10, 10, 350, 60);
		painelScrollTabelaFilmeFav.setViewportView(tabelaFilmesFav);

		botaoFilmesFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				try {
					Sistema sistema = new Sistema("967252");
					List<Filmes> filmes = new LinkedList<Filmes>();
					Popup p;
					JFrame f = new JFrame("Pop");
					f.setSize(390, 300);
					PopupFactory pf = new PopupFactory();
					JPanel p2 = new JPanel();
					p2.setSize(400, 60);
					p = pf.getPopup(f, p2, 10, 10);
					for (Filmes filme : sistema.selectFilmes()) {
						filmes.add(filme);
					}
					for (Filmes filmes1 : filmes) {
						tFilmesFav.pesquisaFilme(filmes1);
					}
					p2.setLayout(null);
					p2.add(painelScrollTabelaFilmeFav);
					f.add(p2);
					p2.add(backGround);
					f.setVisible(true);
					p.show();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (SelectException e) {
					e.printStackTrace();
				}
			}
		});

		JButton botaoAtoresFav = new JButton("Atores Fav.");
		botaoAtoresFav.setBounds(220, 547, 100, 23);
		contentPane.add(botaoAtoresFav);
		botaoAtoresFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				try {
					Sistema sistema = new Sistema("967252");
					int i = sistema.selectA();
					tAtores.setLinha(i);
					Popup p;
					JFrame f = new JFrame("Pop");
					f.setSize(390, 300);
					PopupFactory pf = new PopupFactory();
					JPanel p2 = new JPanel();
					p2.setSize(400, 60);
					p = pf.getPopup(f, p2, 10, 10);
					tabelaAtoresFav = new JTable(tAtores);
					painelScrollTabelaAtoresFav.setBounds(10, 10, 350, 70);
					painelScrollTabelaAtoresFav.setViewportView(tabelaAtoresFav);
					for (Atores ator : sistema.selectAtores()) {
						tAtores.pesquisaElenco(ator);
					}
					p2.setLayout(null);
					p2.add(painelScrollTabelaAtoresFav);
					f.add(p2);
					p2.add(backGround);
					f.setVisible(true);
					p.show();
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				} catch (SQLException e) {

					e.printStackTrace();
				} catch (SelectException e) {

					e.printStackTrace();
				}

			}
		});

		JButton botaoAtorFav = new JButton("Salvar Ator");
		botaoAtorFav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				try {
					Sistema sistema = new Sistema("967252");
					String nome = (String) comboBox.getSelectedItem();
					Atores ator = atores.get(nome);
					sistema.inserirAtor(ator);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (SelectException e) {
					e.printStackTrace();
				} catch (InsertException e) {
					e.printStackTrace();
				}
			}
		});
		botaoAtorFav.setBounds(122, 547, 100, 23);
		contentPane.add(botaoAtorFav);
		imgFilme.setHorizontalAlignment(SwingConstants.TRAILING);
		imgFilme.setBounds(682, 13, 316, 528);
		contentPane.add(imgFilme);
		imgAtor.setHorizontalAlignment(SwingConstants.CENTER);
		imgAtor.setBounds(413, 208, 259, 333);
		contentPane.add(imgAtor);
		backGround.setBounds(0, 0, 1008, 581);
		contentPane.add(backGround);
		BufferedImage back = ImageIO.read(url);
		Image dBack = back.getScaledInstance(backGround.getWidth(), backGround.getHeight(), Image.SCALE_SMOOTH);
		backGround.setIcon(new ImageIcon(dBack));

	}

	private String getInfoAtor(Atores ator) {
		return "-Nome: " + ator.getNome() + "\n-ID: " + ator.getIdApi() + "\n-Data de Nascimento: "
				+ ator.getDataDeNascimento() + "\n-Sexo: " + ator.getSexo() + "\n-Mini Biografia: \n "
				+ ator.getMiniBiografia();
	}
}
