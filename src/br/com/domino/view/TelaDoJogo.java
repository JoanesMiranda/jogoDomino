package br.com.domino.view;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import br.com.domino.model.Actions;
import br.com.domino.model.Pecas;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class TelaDoJogo extends JFrame {

	String l1 = "", l2 = "", l3 = "", l4 = "", l5 = "", l6 = "", l7 = "", l8 = "", l9 = "", l10 = "", l11 = "",
			l12 = "", l13 = "", l14 = "", l15 = "", l16 = "", l17 = "", l18 = "", l19 = "", l20 = "", l21 = "",
			l22 = "", l23 = "", l24 = "", l25 = "", l26 = "", l27 = "", l28 = "";

	JButton btnhumano1;
	JButton btnhumano2;
	JButton btnhumano3;
	JButton btnhumano4;
	JButton btnhumano5;
	JButton btnhumano6;
	JButton btnhumano7;
	JButton btnhumano8;
	JButton btnhumano9;
	JButton btnhumano10;
	JButton btnhumano11;
	JButton btnhumano12;
	JButton btnhumano13;
	JButton btnhumano14;
	JButton btnhumano15;
	JButton btnhumano16;
	JButton btnhumano17;
	JButton btnhumano18;

	JButton btnmaquina1;
	JButton btnmaquina2;
	JButton btnmaquina3;
	JButton btnmaquina4;
	JButton btnmaquina5;
	JButton btnmaquina6;
	JButton btnmaquina7;
	JButton btnmaquina8;
	JButton btnmaquina9;
	JButton btnmaquina10;
	JButton btnmaquina11;
	JButton btnmaquina12;
	JButton btnmaquina13;
	JButton btnmaquina14;
	JButton btnmaquina15;
	JButton btnmaquina16;
	JButton btnmaquina17;
	JButton btnmaquina18;

	JButton btn_1;
	JButton btn_2;
	JButton btn_3;
	JButton btn_4;
	JButton btn_5;
	JButton btn_6;
	JButton btn_7;
	JButton btn_8;
	JButton btn_9;
	JButton btn_10;
	JButton btn_11;
	JButton btn_12;
	JButton btn_13;
	JButton btn_14;
	JButton btn_15;
	JButton btn_16;
	JButton btn_17;
	JButton btn_18;
	JButton btn_19;
	JButton btn_20;
	JButton btn_21;
	JButton btn_22;
	JButton btn_23;
	JButton btn_24;
	JButton btn_25;
	JButton btn_26;
	JButton btn_27;
	JButton btn_28;

	public void desabilitaBotoesHumano() {
		btnhumano1.setEnabled(false);
		btnhumano2.setEnabled(false);
		btnhumano3.setEnabled(false);
		btnhumano4.setEnabled(false);
		btnhumano5.setEnabled(false);
		btnhumano6.setEnabled(false);
		btnhumano7.setEnabled(false);
		btnhumano8.setEnabled(false);
		btnhumano9.setEnabled(false);
		btnhumano10.setEnabled(false);
		btnhumano11.setEnabled(false);
		btnhumano12.setEnabled(false);
		btnhumano13.setEnabled(false);
		btnhumano14.setEnabled(false);
		btnhumano15.setEnabled(false);
		btnhumano16.setEnabled(false);
		btnhumano17.setEnabled(false);
		btnhumano18.setEnabled(false);
	}

	public void habilitaBotoesHumano() {
		btnhumano1.setEnabled(true);
		btnhumano2.setEnabled(true);
		btnhumano3.setEnabled(true);
		btnhumano4.setEnabled(true);
		btnhumano5.setEnabled(true);
		btnhumano6.setEnabled(true);
		btnhumano7.setEnabled(true);
		btnhumano8.setEnabled(true);
		btnhumano9.setEnabled(true);
		btnhumano10.setEnabled(true);
		btnhumano11.setEnabled(true);
		btnhumano12.setEnabled(true);
		btnhumano13.setEnabled(true);
		btnhumano14.setEnabled(true);
		btnhumano15.setEnabled(true);
		btnhumano16.setEnabled(true);
		btnhumano17.setEnabled(true);
		btnhumano18.setEnabled(true);
	}

	public void desabilitaBotoesMaquina() {
		btnmaquina1.setEnabled(false);
		btnmaquina2.setEnabled(false);
		btnmaquina3.setEnabled(false);
		btnmaquina4.setEnabled(false);
		btnmaquina5.setEnabled(false);
		btnmaquina6.setEnabled(false);
		btnmaquina7.setEnabled(false);
		btnmaquina8.setEnabled(false);
		btnmaquina9.setEnabled(false);
		btnmaquina10.setEnabled(false);
		btnmaquina11.setEnabled(false);
		btnmaquina12.setEnabled(false);
		btnmaquina13.setEnabled(false);
		btnmaquina14.setEnabled(false);
		btnmaquina15.setEnabled(false);
		btnmaquina16.setEnabled(false);
		btnmaquina17.setEnabled(false);
		btnmaquina18.setEnabled(false);
	}

	public void habilitaBotoesMaquina() {
		btnmaquina1.setEnabled(true);
		btnmaquina2.setEnabled(true);
		btnmaquina3.setEnabled(true);
		btnmaquina4.setEnabled(true);
		btnmaquina5.setEnabled(true);
		btnmaquina6.setEnabled(true);
		btnmaquina7.setEnabled(true);
		btnmaquina8.setEnabled(true);
		btnmaquina9.setEnabled(true);
		btnmaquina10.setEnabled(true);
		btnmaquina11.setEnabled(true);
		btnmaquina12.setEnabled(true);
		btnmaquina13.setEnabled(true);
		btnmaquina14.setEnabled(true);
		btnmaquina15.setEnabled(true);
		btnmaquina16.setEnabled(true);
		btnmaquina17.setEnabled(true);
		btnmaquina18.setEnabled(true);
	}
	int contadorCompraMaquina = 7;
	public void insereImagenNoBotao(int contadorMaquina){
		++contadorMaquina;
		
		switch (contadorMaquina) {
		case 8:
			btnmaquina8.setEnabled(true);
			btnmaquina8.setIcon(new ImageIcon(".//resource//imagens//pecavirada.png"));
			break;
		default:
			break;
		}
	}
	
	int aux = 0;
	int aux2 = 0;
	
	boolean pedraDiferente = false;
	Actions al = new Actions();

	ArrayList<Pecas> arrayH = new ArrayList<Pecas>();
	ArrayList<Pecas> arrayM = new ArrayList<Pecas>();

	Boolean vezDoJogo = true;

	// recebe todas as pedras do caminho do jogo do domino
	ArrayList<Pecas> arrayTabuleiro = new ArrayList<Pecas>();

	private static final long serialVersionUID = 1L;

	public TelaDoJogo() {

		ArrayList<Pecas> array = new ArrayList<Pecas>();

		for (Pecas pecas : al.embaralhaPedrasDomino()) {
			array.add(pecas);
		}

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);

		JMenuItem mntmNovoJogo = new JMenuItem("Novo Jogo");
		mnMenu.add(mntmNovoJogo);

		JMenuItem mntmSalvarJogo = new JMenuItem("Salvar Jogo");
		mnMenu.add(mntmSalvarJogo);

		JMenuItem mntmInstrues = new JMenuItem("Instru\u00E7\u00F5es");
		mntmInstrues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaInstrucoes().setVisible(true);
			}
		});
		mnMenu.add(mntmInstrues);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnMenu.add(mntmSair);
		getContentPane().setLayout(null);

		ImageIcon iconMaquina = new ImageIcon(".//resource//imagens//sasuke.png");
		JLabel lblIconemaquina = new JLabel(iconMaquina);
		lblIconemaquina.setBounds(0, 0, 73, 100);
		getContentPane().add(lblIconemaquina);

		JLabel lblNomemaquina = new JLabel("JoanesMachine dos Santos");
		lblNomemaquina.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNomemaquina.setBounds(77, 32, 195, 25);
		getContentPane().add(lblNomemaquina);

		ImageIcon iconJogador = new ImageIcon(".//resource//imagens//naruto.png");
		JLabel lblIconejogador = new JLabel(iconJogador);
		lblIconejogador.setBounds(0, 561, 73, 100);
		getContentPane().add(lblIconejogador);

		JLabel lblNomejogador = new JLabel("Emerson Sousa Pereira");
		lblNomejogador.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNomejogador.setBounds(77, 596, 217, 36);
		getContentPane().add(lblNomejogador);

		JPanel panel_pecasMaquina = new JPanel();
		panel_pecasMaquina.setBounds(304, 0, 958, 81);
		getContentPane().add(panel_pecasMaquina);
		panel_pecasMaquina.setLayout(new GridLayout(1, 20, 0, 0));

		btnmaquina1 = new JButton("");
		btnmaquina1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnmaquina2 = new JButton("");
		btnmaquina3 = new JButton("");
		btnmaquina4 = new JButton("");
		btnmaquina5 = new JButton("");
		btnmaquina6 = new JButton("");
		btnmaquina7 = new JButton("");
		btnmaquina8 = new JButton("");
		btnmaquina8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnmaquina9 = new JButton("");
		btnmaquina10 = new JButton("");
		btnmaquina11 = new JButton("");
		btnmaquina12 = new JButton("");
		btnmaquina13 = new JButton("");
		btnmaquina14 = new JButton("");
		btnmaquina15 = new JButton("");
		btnmaquina16 = new JButton("");
		btnmaquina17 = new JButton("");
		btnmaquina18 = new JButton("");

		panel_pecasMaquina.add(btnmaquina1);
		panel_pecasMaquina.add(btnmaquina2);
		panel_pecasMaquina.add(btnmaquina3);
		panel_pecasMaquina.add(btnmaquina4);
		panel_pecasMaquina.add(btnmaquina5);
		panel_pecasMaquina.add(btnmaquina6);
		panel_pecasMaquina.add(btnmaquina7);
		panel_pecasMaquina.add(btnmaquina8);
		panel_pecasMaquina.add(btnmaquina9);
		panel_pecasMaquina.add(btnmaquina10);
		panel_pecasMaquina.add(btnmaquina11);
		panel_pecasMaquina.add(btnmaquina12);
		panel_pecasMaquina.add(btnmaquina13);
		panel_pecasMaquina.add(btnmaquina14);
		panel_pecasMaquina.add(btnmaquina15);
		panel_pecasMaquina.add(btnmaquina16);
		panel_pecasMaquina.add(btnmaquina17);
		panel_pecasMaquina.add(btnmaquina18);

		JPanel panel_pecasJogador = new JPanel();
		panel_pecasJogador.setBounds(304, 580, 958, 81);
		getContentPane().add(panel_pecasJogador);
		panel_pecasJogador.setLayout(new GridLayout(1, 20, 0, 0));

		btnhumano1 = new JButton("");
		btnhumano1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				++aux2;
				Pecas p1 = arrayH.get(0);
				
				String ladoa = p1.getLadoEsquerdo().toString();
				String ladob = p1.getLadoDireito().toString();

				System.out.println(l1 = ladoa + ladob);

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));

					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							// obs: tem que inverter os valores antes de inserir
							// no array.
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);

							btnhumano1.setEnabled(false);
							btn_1.setEnabled(true);
							btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_1.setEnabled(true);
								btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
								
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					
					/** Inteligência simples da maquina **/
					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						/**logica para a compra de peças do jogador maquina**/
						if (valor == "") {
							int i = al.maquinaCompraPassa();
							if(i == 0){
								JOptionPane.showMessageDialog(null, "Maquina: Passa Jogada ");
							}else{
								//escolhe a primeira pedra que encontrar no array e pega
								al.escolhePecaAleatorio(array, arrayM);
								
								//testa se a pedra comprada pode ser jogada no tabuleiro
								String p = al.testaPedraCompraMaquina(arrayTabuleiro, arrayM);
								
								if(p == ""){
									/**caso a pedra comprada não possa ser jogada no tabuleiro a maquina passa a jogada**/
									JOptionPane.showMessageDialog(null, "Maquina: Compra");
									insereImagenNoBotao(contadorCompraMaquina);
									JOptionPane.showMessageDialog(null, "Maquina: Passa Jogada ");
									
								}else{
									/**caso a pedra comprada  possa ser jogada no tabuleiro a maquina a insere no arrayTabuleiro**/
									JOptionPane.showMessageDialog(null, "Maquina: Compra");
									/** INSERE A IMAGEM NO BOTÃO CORRESPONDENTE**/
									insereImagenNoBotao(contadorCompraMaquina);
									JOptionPane.showMessageDialog(null, "Maquina: Joga");
									btn_2.setEnabled(true);
									btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ p + ".png"));
									++aux2;
									JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
								}
							}
							/**Finaliza o codigo de compra de peças do jogador maquina   **/
						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
				case 2:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_2.setEnabled(true);
						btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_2.setEnabled(true);
								btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 3:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_3.setEnabled(true);
						btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_3.setEnabled(true);
								btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
				case 4:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_4.setEnabled(true);
						btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							arrayTabuleiro.add(p1);
							btnhumano1.setEnabled(false);
							btn_4.setEnabled(true);

							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));

						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
								arrayTabuleiro.add(novop);
								btnhumano1.setEnabled(false);
								btn_4.setEnabled(true);
								btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 5:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_5.setEnabled(true);
						btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_5.setEnabled(true);
								btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));

							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 6:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_6.setEnabled(true);
						btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_6.setEnabled(true);

							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_6.setEnabled(true);
								btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 7:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_7.setEnabled(true);
						btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_7.setEnabled(true);
								btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 8:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_8.setEnabled(true);
						btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_8.setEnabled(true);
								btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 9:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_9.setEnabled(true);
						btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_9.setEnabled(true);
								btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 10:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_10.setEnabled(true);
						btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_10.setEnabled(true);
								btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 11:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p1);
						btnhumano1.setEnabled(false);
						btn_11.setEnabled(true);
						btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 1) {
							Pecas novop = new Pecas(p1.getLadoDireito(), p1.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano1.setEnabled(false);
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) == 2) {
								arrayTabuleiro.add(p1);
								btnhumano1.setEnabled(false);
								btn_11.setEnabled(true);
								btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p1) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_12.setEnabled(true);
							btn_12.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
			}
		});
		btnhumano2 = new JButton("");
		btnhumano2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				++aux2;
				Pecas p2 = arrayH.get(1);
				
	
				String ladoa = p2.getLadoEsquerdo().toString();
				String ladob = p2.getLadoDireito().toString();

				System.out.println(l2 = ladoa + ladob);

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_1.setEnabled(true);
							btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_1.setEnabled(true);
								btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));

							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 2:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_2.setEnabled(true);
						btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_2.setEnabled(true);
								btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 3:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_3.setEnabled(true);
						btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_3.setEnabled(true);
								btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 4:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_4.setEnabled(true);
						btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_4.setEnabled(true);
								btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 5:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_5.setEnabled(true);
						btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_5.setEnabled(true);
								btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;

				case 6:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_6.setEnabled(true);
						btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_6.setEnabled(true);
								btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}

					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
					
				case 7:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_7.setEnabled(true);
						btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_7.setEnabled(true);
								btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l2 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
					
				case 8:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_8.setEnabled(true);
						btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_8.setEnabled(true);
								btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 9:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_9.setEnabled(true);
						btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_9.setEnabled(true);
								btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 10:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_10.setEnabled(true);
						btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_10.setEnabled(true);
								btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 11:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p2);
						btnhumano2.setEnabled(false);
						btn_11.setEnabled(true);
						btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 1) {
							Pecas novop = new Pecas(p2.getLadoDireito(), p2.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) == 2) {
								arrayTabuleiro.add(p2);
								btnhumano2.setEnabled(false);
								btn_11.setEnabled(true);
								btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p2) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_12.setEnabled(true);
							btn_12.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

			}
		});
		btnhumano3 = new JButton("");
		btnhumano3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				++aux2;
				Pecas p3 = arrayH.get(2);
				
				
				
				String ladoa = p3.getLadoEsquerdo().toString();
				String ladob = p3.getLadoDireito().toString();

				System.out.println(l3 = ladoa + ladob);

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_1.setEnabled(true);
							btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_1.setEnabled(true);
								btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}

					break;
				case 2:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_2.setEnabled(true);
						btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_2.setEnabled(true);
								btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 3:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_3.setEnabled(true);
						btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano2.setEnabled(false);
								btn_3.setEnabled(true);
								btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 4:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_4.setEnabled(true);
						btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_4.setEnabled(true);
								btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 5:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_5.setEnabled(true);
						btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_5.setEnabled(true);

							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_5.setEnabled(true);
								btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 6:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_6.setEnabled(true);
						btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_6.setEnabled(true);
								btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 7:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_7.setEnabled(true);
						btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_7.setEnabled(true);
								btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l3 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
					
				case 8:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_8.setEnabled(true);
						btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_8.setEnabled(true);
								btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 9:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_9.setEnabled(true);
						btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_9.setEnabled(true);
								btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 10:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_10.setEnabled(true);
						btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_10.setEnabled(true);
								btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 11:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p3);
						btnhumano3.setEnabled(false);
						btn_11.setEnabled(true);
						btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 1) {
							Pecas novop = new Pecas(p3.getLadoDireito(), p3.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano3.setEnabled(false);
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) == 2) {
								arrayTabuleiro.add(p3);
								btnhumano3.setEnabled(false);
								btn_11.setEnabled(true);
								btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p3) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_12.setEnabled(true);
							btn_12.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

			}
		});
		btnhumano4 = new JButton("");
		btnhumano4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				++aux2;
				Pecas p4 = arrayH.get(3);
				
				
				String ladoa = p4.getLadoEsquerdo().toString();
				String ladob = p4.getLadoDireito().toString();

				System.out.println(l4 = ladoa + ladob);

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_1.setEnabled(true);
							btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_1.setEnabled(true);
								btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 2:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_2.setEnabled(true);
						btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_2.setEnabled(true);
								btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 3:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_3.setEnabled(true);
						btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_3.setEnabled(true);
								btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 4:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_4.setEnabled(true);
						btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_4.setEnabled(true);
								btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 5:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_5.setEnabled(true);
						btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_5.setEnabled(true);
								btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 6:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_6.setEnabled(true);
						btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_6.setEnabled(true);
								btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 7:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_7.setEnabled(true);
						btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_7.setEnabled(true);
								btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l4 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
					
				case 8:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_8.setEnabled(true);
						btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_8.setEnabled(true);
								btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 9:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_9.setEnabled(true);
						btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_9.setEnabled(true);
								btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 10:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_10.setEnabled(true);
						btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_10.setEnabled(true);
								btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 11:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p4);
						btnhumano4.setEnabled(false);
						btn_11.setEnabled(true);
						btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 1) {
							Pecas novop = new Pecas(p4.getLadoDireito(), p4.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano4.setEnabled(false);
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) == 2) {
								arrayTabuleiro.add(p4);
								btnhumano4.setEnabled(false);
								btn_11.setEnabled(true);
								btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p4) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_12.setEnabled(true);
							btn_12.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

			}
		});
		btnhumano5 = new JButton("");
		btnhumano5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				++aux2;
				Pecas p5 = arrayH.get(4);
			
				
				String ladoa = p5.getLadoEsquerdo().toString();
				String ladob = p5.getLadoDireito().toString();

				System.out.println(l5 = ladoa + ladob);

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_1.setEnabled(true);
							btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_1.setEnabled(true);
								btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));

							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 2:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_2.setEnabled(true);
						btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_2.setEnabled(true);
								btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 3:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_3.setEnabled(true);
						btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_3.setEnabled(true);
								btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 4:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_4.setEnabled(true);
						btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_4.setEnabled(true);
								btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 5:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_5.setEnabled(true);
						btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_5.setEnabled(true);
								btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 6:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_6.setEnabled(true);
						btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_6.setEnabled(true);
								btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 7:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_7.setEnabled(true);
						btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_7.setEnabled(true);
								btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l5 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
					
				case 8:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_8.setEnabled(true);
						btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_8.setEnabled(true);
								btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 9:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_9.setEnabled(true);
						btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_9.setEnabled(true);
								btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 10:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_10.setEnabled(true);
						btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_10.setEnabled(true);
								btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 11:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p5);
						btnhumano5.setEnabled(false);
						btn_11.setEnabled(true);
						btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 1) {
							Pecas novop = new Pecas(p5.getLadoDireito(), p5.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano5.setEnabled(false);
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) == 2) {
								arrayTabuleiro.add(p5);
								btnhumano5.setEnabled(false);
								btn_11.setEnabled(true);
								btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p5) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_12.setEnabled(true);
							btn_12.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
			}
		});
		btnhumano6 = new JButton("");
		btnhumano6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				++aux2;
				Pecas p6 = arrayH.get(5);
				
				
				String ladoa = p6.getLadoEsquerdo().toString();
				String ladob = p6.getLadoDireito().toString();

				System.out.println(l6 = ladoa + ladob);

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano2.setEnabled(false);
							btn_1.setEnabled(true);
							btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_1.setEnabled(true);
								btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));

							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}

					break;
				case 2:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_2.setEnabled(true);
						btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_2.setEnabled(true);
								btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 3:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_3.setEnabled(true);
						btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_3.setEnabled(true);
								btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 4:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_4.setEnabled(true);
						btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_4.setEnabled(true);

								btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 5:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_5.setEnabled(true);
						btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_5.setEnabled(true);
								btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 6:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_6.setEnabled(true);
						btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_6.setEnabled(true);
								btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 7:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_7.setEnabled(true);
						btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_7.setEnabled(true);
								btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l6 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
					
				case 8:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_8.setEnabled(true);
						btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_8.setEnabled(true);
								btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 9:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_9.setEnabled(true);
						btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_9.setEnabled(true);
								btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 10:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_10.setEnabled(true);
						btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_10.setEnabled(true);
								btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 11:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p6);
						btnhumano6.setEnabled(false);
						btn_11.setEnabled(true);
						btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 1) {
							Pecas novop = new Pecas(p6.getLadoDireito(), p6.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano6.setEnabled(false);
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) == 2) {
								arrayTabuleiro.add(p6);
								btnhumano6.setEnabled(false);
								btn_11.setEnabled(true);
								btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p6) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_12.setEnabled(true);
							btn_12.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

			}
		});
		btnhumano7 = new JButton("");
		btnhumano7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				++aux2;
				Pecas p7 = arrayH.get(6);
			
				
				String ladoa = p7.getLadoEsquerdo().toString();
				String ladob = p7.getLadoDireito().toString();

				System.out.println(l7 = ladoa + ladob);

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_1.setEnabled(true);
							btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_1.setEnabled(true);
								btn_1.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));

							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}

					break;
				case 2:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_2.setEnabled(true);
						btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_2.setEnabled(true);
							btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_2.setEnabled(true);
								btn_2.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 3:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_3.setEnabled(true);
						btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_3.setEnabled(true);
							btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_3.setEnabled(true);
								btn_3.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 4:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_4.setEnabled(true);
						btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_4.setEnabled(true);
							btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_4.setEnabled(true);
								btn_4.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 5:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_5.setEnabled(true);
						btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_5.setEnabled(true);
							btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_5.setEnabled(true);
								btn_5.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_6.setEnabled(true);
							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 6:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_6.setEnabled(true);
						btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_6.setEnabled(true);

							btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_6.setEnabled(true);
								btn_6.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
				case 7:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_7.setEnabled(true);
						btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_7.setEnabled(true);
							btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_7.setEnabled(true);
								btn_7.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l7 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					break;
					
				case 8:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_8.setEnabled(true);
						btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_8.setEnabled(true);
							btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_8.setEnabled(true);
								btn_8.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 9:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_9.setEnabled(true);
						btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_9.setEnabled(true);
							btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_9.setEnabled(true);
								btn_9.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 10:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_10.setEnabled(true);
						btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_10.setEnabled(true);
							btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_10.setEnabled(true);
								btn_10.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;
					
				case 11:
					if (arrayTabuleiro.isEmpty()) {
						arrayTabuleiro.add(p7);
						btnhumano7.setEnabled(false);
						btn_11.setEnabled(true);
						btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 1) {
							Pecas novop = new Pecas(p7.getLadoDireito(), p7.getLadoEsquerdo());
							arrayTabuleiro.add(novop);
							btnhumano7.setEnabled(false);
							btn_11.setEnabled(true);
							btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais2//" + ladob + ladoa + ".png"));
						} else {
							if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) == 2) {
								arrayTabuleiro.add(p7);
								btnhumano7.setEnabled(false);
								btn_11.setEnabled(true);
								btn_11.setIcon(new ImageIcon(".//resource//pecas//horizontais1//" + l1 + ".png"));
							} else {
								JOptionPane.showMessageDialog(null, "Pedra diferente");
								--aux2;
							}
						}
					}
					/** Inteligência simples da maquina **/

					if (al.verificaLadosPedraEsquerda(arrayTabuleiro, p7) != 0) {
						String valor = al.escolhePedraMaquina(arrayTabuleiro, arrayM);

						if (valor == "") {
							JOptionPane.showMessageDialog(null, "Maquina passa ou compra");

						} else {
							JOptionPane.showMessageDialog(null, "Jogador da vez: CPU");
							btn_12.setEnabled(true);
							btn_12.setIcon(new ImageIcon(".//resource//pecas//horizontais1//"+ valor + ".png"));
							++aux2;
							JOptionPane.showMessageDialog(null, "Jogador da vez: Homen");
						}
					}
					for(Pecas i: arrayTabuleiro){
						System.out.println("Array tabuliero: "+i.getLadoEsquerdo()+" "+i.getLadoDireito());
					}
					
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

			}
		});
		btnhumano8 = new JButton("");
		btnhumano8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnhumano9 = new JButton("");
		btnhumano9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnhumano10 = new JButton("");
		btnhumano11 = new JButton("");
		btnhumano12 = new JButton("");
		btnhumano13 = new JButton("");
		btnhumano14 = new JButton("");
		btnhumano15 = new JButton("");
		btnhumano16 = new JButton("");
		btnhumano17 = new JButton("");
		btnhumano18 = new JButton("");
		btnhumano18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		panel_pecasJogador.add(btnhumano1);
		panel_pecasJogador.add(btnhumano2);
		panel_pecasJogador.add(btnhumano3);
		panel_pecasJogador.add(btnhumano4);
		panel_pecasJogador.add(btnhumano5);
		panel_pecasJogador.add(btnhumano6);
		panel_pecasJogador.add(btnhumano7);
		panel_pecasJogador.add(btnhumano8);
		panel_pecasJogador.add(btnhumano9);
		panel_pecasJogador.add(btnhumano10);
		panel_pecasJogador.add(btnhumano11);
		panel_pecasJogador.add(btnhumano12);
		panel_pecasJogador.add(btnhumano13);
		panel_pecasJogador.add(btnhumano14);
		panel_pecasJogador.add(btnhumano15);
		panel_pecasJogador.add(btnhumano16);
		panel_pecasJogador.add(btnhumano17);
		panel_pecasJogador.add(btnhumano18);

		JPanel panel_pecasAescolher = new JPanel();
		panel_pecasAescolher.setBounds(0, 145, 330, 405);
		getContentPane().add(panel_pecasAescolher);
		panel_pecasAescolher.setLayout(new GridLayout(5, 6, 5, 5));

		ImageIcon pecavirada = new ImageIcon(".//resource//imagens//pecavirada.png");

		JButton btnpeca1 = new JButton(pecavirada);
		btnpeca1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(0);
				
				array.remove(0);
				Pecas vazia = new Pecas(null, null);
				array.add(0, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l1 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l1 + ".png"));
					break;

				default:
					if(arrayM.size() == 7 && arrayTabuleiro.size() == 0){
						JOptionPane.showMessageDialog(null, "Peças esgotadas");
					}
					break;
				}
			}
		});

		JButton btnpeca2 = new JButton(pecavirada);
		btnpeca2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(1);
				array.remove(1);
				Pecas vazia = new Pecas(null, null);
				array.add(1, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l2 = ladoa + ladob;
				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l2 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}

		});

		JButton btnpeca3 = new JButton(pecavirada);
		btnpeca3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(2);
				array.remove(2);
				Pecas vazia = new Pecas(null, null);
				array.add(2, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();
				l3 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas/verticais1///" + l3 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l3 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {
					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}
			}

		});

		JButton btnpeca4 = new JButton(pecavirada);
		btnpeca4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(3);
				array.remove(3);
				Pecas vazia = new Pecas(null, null);
				array.add(3, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l4 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));

					break;
				case 9:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l4 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {
					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}

		});

		JButton btnpeca5 = new JButton(pecavirada);
		btnpeca5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(4);
				
				array.remove(4);
				Pecas vazia = new Pecas(null, null);
				array.add(4, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l5 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l5 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}

		});

		JButton btnpeca6 = new JButton(pecavirada);
		btnpeca6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(5);
				array.remove(5);
				Pecas vazia = new Pecas(null, null);
				array.add(5, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l6 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l6 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}

		});

		JButton btnpeca7 = new JButton(pecavirada);
		btnpeca7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(6);
				array.remove(6);
				Pecas vazia = new Pecas(null, null);
				array.add(6, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();
				l7 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l7 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}

		});

		JButton btnpeca8 = new JButton(pecavirada);
		btnpeca8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(7);
				
				array.remove(7);
				Pecas vazia = new Pecas(null, null);
				array.add(7, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l8 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l8 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca9 = new JButton(pecavirada);
		btnpeca9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(8);
				array.remove(8);
				Pecas vazia = new Pecas(null, null);
				array.add(8, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l9 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l9 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca10 = new JButton(pecavirada);
		btnpeca10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(9);
				array.remove(9);
				Pecas vazia = new Pecas(null, null);
				array.add(9, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l10 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l10 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca11 = new JButton(pecavirada);
		btnpeca11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(10);
				array.remove(10);
				Pecas vazia = new Pecas(null, null);
				array.add(10, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l11 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l11 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca12 = new JButton(pecavirada);
		btnpeca12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(11);
				array.remove(11);
				Pecas vazia = new Pecas(null, null);
				array.add(11, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l12 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l12 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca13 = new JButton(pecavirada);
		btnpeca13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(12);
				array.remove(12);
				Pecas vazia = new Pecas(null, null);
				array.add(12, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l13 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l13 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca14 = new JButton(pecavirada);
		btnpeca14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(13);
				array.remove(13);
				Pecas vazia = new Pecas(null, null);
				array.add(13, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l14 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l14 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca15 = new JButton(pecavirada);
		btnpeca15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(14);
				array.remove(14);
				Pecas vazia = new Pecas(null, null);
				array.add(14, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l15 = ladoa + ladob;
				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l15 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca16 = new JButton(pecavirada);
		btnpeca16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(15);
				array.remove(15);
				Pecas vazia = new Pecas(null, null);
				array.add(15, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l16 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l16 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca17 = new JButton(pecavirada);
		btnpeca17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(16);
				array.remove(16);
				Pecas vazia = new Pecas(null, null);
				array.add(16, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l17 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l17 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}

		});

		JButton btnpeca18 = new JButton(pecavirada);
		btnpeca18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(17);
				array.remove(17);
				Pecas vazia = new Pecas(null, null);
				array.add(17, vazia);
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l18 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l18 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca19 = new JButton(pecavirada);
		btnpeca19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(18);
				array.remove(18);
				Pecas vazia = new Pecas(null, null);
				array.add(18, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l19 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l19 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca20 = new JButton(pecavirada);
		btnpeca20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(19);
				array.remove(19);
				Pecas vazia = new Pecas(null, null);
				array.add(19, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l20 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l20 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca21 = new JButton(pecavirada);
		btnpeca21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(20);
				array.remove(20);
				Pecas vazia = new Pecas(null, null);
				array.add(20, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l21 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l21 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca22 = new JButton(pecavirada);
		btnpeca22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(21);
				array.remove(21);
				Pecas vazia = new Pecas(null, null);
				array.add(21, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l22 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l22 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca23 = new JButton(pecavirada);
		btnpeca23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(22);
				array.remove(22);
				Pecas vazia = new Pecas(null, null);
				array.add(22, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l23 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas/verticais1///" + l23 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l23 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca24 = new JButton(pecavirada);
		btnpeca24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(23);
				array.remove(23);
				Pecas vazia = new Pecas(null, null);
				array.add(23, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l24 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l24 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca25 = new JButton(pecavirada);
		btnpeca25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(24);
				
				array.remove(24);
				Pecas vazia = new Pecas(null, null);
				array.add(24, vazia);
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l25 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l25 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca26 = new JButton(pecavirada);
		btnpeca26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(25);
				array.remove(25);
				Pecas vazia = new Pecas(null, null);
				array.add(25, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l26 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l26 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca27 = new JButton(pecavirada);
		btnpeca27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(26);
				array.remove(26);
				Pecas vazia = new Pecas(null, null);
				array.add(26, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();

				l27 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l27 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}

			}
		});

		JButton btnpeca28 = new JButton(pecavirada);
		btnpeca28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(27);
				
				array.remove(27);
				Pecas vazia = new Pecas(null, null);
				array.add(27, vazia);
				
				String ladoa = p.getLadoEsquerdo().toString();
				String ladob = p.getLadoDireito().toString();
				l28 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//verticais1//" + l28 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// verifica de quem é a vez do jogo
				if (arrayM.size() == 7) {

					if (al.jogaPrimeiro(arrayH, arrayM) == true) {
						desabilitaBotoesMaquina();
					} else {
						desabilitaBotoesHumano();
					}
				}
			}
		});

		panel_pecasAescolher.add(btnpeca1);
		panel_pecasAescolher.add(btnpeca2);
		panel_pecasAescolher.add(btnpeca3);
		panel_pecasAescolher.add(btnpeca4);
		panel_pecasAescolher.add(btnpeca5);
		panel_pecasAescolher.add(btnpeca6);
		panel_pecasAescolher.add(btnpeca7);
		panel_pecasAescolher.add(btnpeca8);
		panel_pecasAescolher.add(btnpeca9);
		panel_pecasAescolher.add(btnpeca10);
		panel_pecasAescolher.add(btnpeca11);
		panel_pecasAescolher.add(btnpeca12);
		panel_pecasAescolher.add(btnpeca13);
		panel_pecasAescolher.add(btnpeca14);
		panel_pecasAescolher.add(btnpeca15);
		panel_pecasAescolher.add(btnpeca16);
		panel_pecasAescolher.add(btnpeca17);
		panel_pecasAescolher.add(btnpeca18);
		panel_pecasAescolher.add(btnpeca19);
		panel_pecasAescolher.add(btnpeca20);
		panel_pecasAescolher.add(btnpeca21);
		panel_pecasAescolher.add(btnpeca22);
		panel_pecasAescolher.add(btnpeca23);
		panel_pecasAescolher.add(btnpeca24);
		panel_pecasAescolher.add(btnpeca25);
		panel_pecasAescolher.add(btnpeca26);
		panel_pecasAescolher.add(btnpeca27);
		panel_pecasAescolher.add(btnpeca28);

		JPanel panel_tabuleiro = new JPanel();
		panel_tabuleiro.setBorder(new LineBorder(Color.RED, 1, true));
		panel_tabuleiro.setBounds(361, 124, 979, 426);
		getContentPane().add(panel_tabuleiro);
		panel_tabuleiro.setLayout(null);

		btn_14 = new JButton("");
		btn_14.setEnabled(false);
		btn_14.setBounds(37, 145, 35, 70);
		panel_tabuleiro.add(btn_14);

		btn_13 = new JButton("");
		btn_13.setEnabled(false);
		btn_13.setBounds(37, 76, 35, 70);
		panel_tabuleiro.add(btn_13);

		btn_15 = new JButton("");
		btn_15.setEnabled(false);
		btn_15.setBounds(37, 214, 35, 70);
		panel_tabuleiro.add(btn_15);

		btn_12 = new JButton("");
		btn_12.setEnabled(false);
		btn_12.setBounds(37, 42, 70, 35);
		panel_tabuleiro.add(btn_12);

		btn_16 = new JButton("");
		btn_16.setEnabled(false);
		btn_16.setBounds(37, 283, 35, 70);
		panel_tabuleiro.add(btn_16);

		btn_18 = new JButton("");
		btn_18.setEnabled(false);
		btn_18.setBounds(106, 352, 70, 35);
		panel_tabuleiro.add(btn_18);

		btn_11 = new JButton("");
		btn_11.setEnabled(false);
		btn_11.setBounds(106, 42, 70, 35);
		panel_tabuleiro.add(btn_11);

		btn_23 = new JButton("");
		btn_23.setEnabled(false);
		btn_23.setBounds(451, 352, 70, 35);
		panel_tabuleiro.add(btn_23);

		btn_10 = new JButton("");
		btn_10.setEnabled(false);
		btn_10.setBounds(175, 42, 70, 35);
		panel_tabuleiro.add(btn_10);

		btn_9 = new JButton("");
		btn_9.setEnabled(false);
		btn_9.setBounds(244, 42, 70, 35);
		panel_tabuleiro.add(btn_9);

		btn_8 = new JButton("");
		btn_8.setEnabled(false);
		btn_8.setBounds(313, 42, 70, 35);
		panel_tabuleiro.add(btn_8);

		btn_7 = new JButton("");
		btn_7.setEnabled(false);
		btn_7.setBounds(382, 42, 70, 35);
		panel_tabuleiro.add(btn_7);

		btn_6 = new JButton("");
		btn_6.setEnabled(false);
		btn_6.setBounds(451, 42, 70, 35);
		panel_tabuleiro.add(btn_6);

		btn_5 = new JButton("");
		btn_5.setEnabled(false);
		btn_5.setBounds(520, 42, 70, 35);
		panel_tabuleiro.add(btn_5);

		btn_17 = new JButton("");
		btn_17.setEnabled(false);
		btn_17.setBounds(37, 352, 70, 35);
		panel_tabuleiro.add(btn_17);

		btn_19 = new JButton("");
		btn_19.setEnabled(false);
		btn_19.setBounds(175, 352, 70, 35);
		panel_tabuleiro.add(btn_19);

		btn_20 = new JButton("");
		btn_20.setEnabled(false);
		btn_20.setBounds(244, 352, 70, 35);
		panel_tabuleiro.add(btn_20);

		btn_21 = new JButton("");
		btn_21.setEnabled(false);
		btn_21.setBounds(313, 352, 70, 35);
		panel_tabuleiro.add(btn_21);

		btn_22 = new JButton("");
		btn_22.setEnabled(false);
		btn_22.setBounds(382, 352, 70, 35);
		panel_tabuleiro.add(btn_22);

		btn_27 = new JButton("");
		btn_27.setEnabled(false);
		btn_27.setBounds(728, 352, 70, 35);
		panel_tabuleiro.add(btn_27);

		btn_24 = new JButton("");
		btn_24.setEnabled(false);
		btn_24.setBounds(521, 352, 70, 35);
		panel_tabuleiro.add(btn_24);

		btn_25 = new JButton("");
		btn_25.setEnabled(false);
		btn_25.setBounds(590, 352, 70, 35);
		panel_tabuleiro.add(btn_25);

		btn_26 = new JButton("");
		btn_26.setEnabled(false);
		btn_26.setBounds(659, 352, 70, 35);
		panel_tabuleiro.add(btn_26);

		btn_4 = new JButton("");
		btn_4.setEnabled(false);
		btn_4.setBounds(589, 42, 70, 35);
		panel_tabuleiro.add(btn_4);

		btn_3 = new JButton("");
		btn_3.setEnabled(false);
		btn_3.setBounds(658, 42, 70, 35);
		panel_tabuleiro.add(btn_3);

		btn_2 = new JButton("");
		btn_2.setEnabled(false);
		btn_2.setBounds(727, 42, 70, 35);
		panel_tabuleiro.add(btn_2);

		btn_1 = new JButton("");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_1.setEnabled(false);
		btn_1.setBounds(796, 42, 70, 35);
		panel_tabuleiro.add(btn_1);

		btn_28 = new JButton("");
		btn_28.setEnabled(false);
		btn_28.setBounds(797, 352, 70, 35);
		panel_tabuleiro.add(btn_28);

		JLabel lblEscolhaSuasPecas = new JLabel("Escolha Suas Pecas");
		lblEscolhaSuasPecas.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEscolhaSuasPecas.setBounds(79, 98, 160, 36);
		getContentPane().add(lblEscolhaSuasPecas);

		setSize(1366, 720);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new TelaDoJogo();

	}
}
