package br.com.domino.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaInstrucoes extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel labelTitulo;
	private JLabel labelTexto;
	private JButton btnProx = new JButton("Proximo");
	private JButton btnAnt = new JButton("Voltar");
	private static int cont;
	private String titulo1 = "Hist�ria do Domin�";
	private String titulo2 = "O Jogo";
	private String titulo3 = "Comecar";
	private String titulo4 = "Rodada";
	private String titulo5 = "Pontuacao";
	private String titulo6 = "Contagem";
	private String texto1 = "<html><p>O domin� � um jogo de mesa que pode ser considerado como uma extens�o dos dados. Embora imagina-se que sua origem � oriental e antiqu�ssima, n�o sabemos se a forma atual era conhecida na Europa at� a metade do s�culo XVIII, quando os italianos o introduziram..<br><br>Sua popularidade nos pa�ses latino-americanos � enorme, particularmente no Caribe (Porto Rico, Cuba, etc.).<br><br>O objetivo do jogo � colocar todas as suas pedras na mesa antes dos advers�rios e marcar pontos. O jogador que ganha uma rodada, marca pontos segundo as pedras que foram colocadas pelos seus advers�rios.</p></html>";
	private String texto2 = "<html><p>N�mero de Jogadores:  apenas dois jogadores por vez sendo um humano e o outro o computador.<br> <br>Total de Pedras: S�o 28.<br> O jogo deve ter dois modos de jogos no primeiro cada jogador receber� seis pe�as e o resto fica dispon�vel para que ambos jogadores possam pegar quando for a sua vez e n�o possuir uma pe�a jog�vel. O segundo modo cada jogador receber� sete pe�as e o resto fica dispon�vel para que ambos jogadores possam pegar quando for a sua vez e n�o possuir uma pe�a jog�vel.</p></html>";
	private String texto3 = "<html><p>Primeira Partida da Rodada: O jogador com a maior carro�a em m�os pode iniciar. Demais Partidas: O jogador que venceu a �ltima partida deve iniciar com a maior carro�a dispon�vel em m�os, caso n�o possua nenhuma carro�a pode iniciar com qualquer pe�a.<br> <h1>Tempo do Jogo</h1>Durante o Jogo ocorrer o tempo de cada partida deve ser marcado para que posteriormente seja adicionado ao Rank.<br></p></html>";
	private String texto4 = "<html><p>O jogo deve girar em torno de rodadas, vence uma rodada o jogador que vencer partidas e conquistar 6 pontos primeiro.<br><h1>Controles</h1>Para colocar uma pedra, deve-se simplesmente clicar sobre ela. <br><h1>Fim do Jogo</h1>O jogo acaba quando algu�m bate (ficar sem pedras na m�o) ou quando o jogo fica fechado, ou seja, quando n�o � mais poss�vel baixar pedras e o reposit�rio de pe�as estiver vazio vencer� o jogador que possuir a menor valor da soma de todas as pe�as em sua m�o.</p></html>";
	private String texto5 = "<html><p>A pontua��o dever� ser dada da seguinte forma:<br>1.Um ponto para o jogar que terminar o jogo em uma das cabe�as com pe�a simples(Batida normal).<br>2.Dois pontos para o jogador que terminar o jogo em uma das cabe�as com carro�a(Batida Carro�a).<br>3.Tr�s pontos para o jogador que terminar o jogo com uma pe�a normal que possa ser jogada em qualquer uma das duas cabe�as(Batida L� e L�).<br>4.Seis pontos para o jogador que terminar o jogo com uma carro�a que possa ser jogada em qualquer uma das duas cabe�as(Batida Quadrada ou batida Cruzada).<br>Ao final de cada rodada pontuação do jogador deve ser salva para que seja adicionada ao Rank.</p></html>";
	private String texto6 = "<html><p>Por Pontos - Quando um jogador bate, ele recebe pontos equivalentes as pedras nas m�os dos advers�rios, caso o jogo seja fechado o jogador que possuir menos pontos � o vencedor, e ganha todos os pontos dos jogadores advers�rios, no caso de empate os jogadores que empataram ganham os pontos dos advers�rios.<br><br>Por Batidas - Apenas uma batida simples ganha o jogo. Se o jogo for fechado o jogador que possuir menos pontos ser� o vencedor. no caso de empate os jogadores que empataram dividem as fichas.<br><br><h1>Ranking por Pontos</h1>Para participar do ranking deste jogo, � necess�rio estar cadastrado.</p></html>";

	public TelaInstrucoes() {

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 400, 450, 300);
		setSize(644, 410);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelTitulo = new JLabel();
		labelTitulo.setText(titulo1);
		labelTexto = new JLabel();
		labelTexto.setText(texto1);

		labelTitulo.setFont(new Font("Courier New", Font.BOLD, 24));
		labelTitulo.setBounds(90, 30, 300, 23);

		labelTexto.setFont(new Font("Courier New", Font.CENTER_BASELINE, 14));
		labelTexto.setBounds(90, 50, 500, 300);

		contentPane.add(labelTitulo);
		contentPane.add(labelTexto);

		btnProx.setForeground(Color.BLACK);
		btnProx.setBackground(Color.WHITE);
		btnProx.setBounds(460, 340, 124, 23);
		btnProx.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cont++;
				refreshProx(cont);
				//System.out.println(cont);
			}
		});
		contentPane.add(btnProx);

		btnAnt.setForeground(Color.BLACK);
		btnAnt.setBackground(Color.WHITE);
		btnAnt.setBounds(340, 340, 124, 23);
		btnAnt.setVisible(false);
		btnAnt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cont--;
				refreshAnt(cont);
				//System.out.println(cont);
			}
		});

		contentPane.add(btnAnt);

	}

	public void refreshProx(int contador) {
		if (contador == 1) {
			btnAnt.setVisible(true);
			labelTitulo.setText(titulo2);
			labelTexto.setText(texto2);
			labelTexto.setBounds(90, 10, 500, 300);
		}
		if (contador == 2) {
			labelTitulo.setText(titulo3);
			labelTexto.setText(texto3);
			labelTexto.setBounds(90, 10, 500, 300);
		}
		if (contador == 3) {
			labelTitulo.setText(titulo4);
			labelTexto.setText(texto4);
			labelTexto.setBounds(90, 50, 500, 300);
		}
		if (contador == 4) {
			labelTitulo.setText(titulo5);
			labelTexto.setText(texto5);
		}
		if (contador == 5) {
			labelTitulo.setText(titulo6);
			labelTexto.setText(texto6);
			btnProx.setVisible(false);
		}

	}

	public void refreshAnt(int contador) {
		if (contador == 0) {
			btnAnt.setVisible(false);
			labelTitulo.setText(titulo1);
			labelTexto.setText(texto1);
			labelTexto.setBounds(90, 50, 500, 300);
		}
		if (contador == 1) {
			labelTitulo.setText(titulo2);
			labelTexto.setText(texto2);
			labelTexto.setBounds(90, 10, 500, 300);
		}
		if (contador == 2) {
			labelTitulo.setText(titulo3);
			labelTexto.setText(texto3);
			labelTexto.setBounds(90, 10, 500, 300);
		}
		if (contador == 3) {
			labelTitulo.setText(titulo4);
			labelTexto.setText(texto4);
			labelTexto.setBounds(90, 50, 500, 300);
		}
		if (contador == 4) {
			labelTitulo.setText(titulo5);
			labelTexto.setText(texto5);
			btnProx.setVisible(true);
		}
		if (contador == 5) {
			labelTitulo.setText(titulo6);
			labelTexto.setText(texto6);

		}

	}

}
