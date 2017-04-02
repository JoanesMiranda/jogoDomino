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

	int aux = 0;
	int aux2 = 0;
	Actions al = new Actions();

	ArrayList<Pecas> arrayH = new ArrayList<Pecas>();
	ArrayList<Pecas> arrayM = new ArrayList<Pecas>();

	// se true a vez do jogo é do humano se false a vez do jogo é da maquina

	public void habilitaDesabilitaBotoes(boolean vezDoJogo) {
		if (vezDoJogo == true) {
			desabilitaBotoesMaquina();
			habilitaBotoesHumano();
		} else {
			desabilitaBotoesHumano();
			habilitaBotoesMaquina();
		}
	}

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
				Pecas p = array.get(0);
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l1 = ladoa + ladob;

				switch (aux2) {
				case 1:
					if (arrayTabuleiro.size() == 0) {
						arrayTabuleiro.add(p);
						btnhumano1.setEnabled(false);
						btn_1.setEnabled(true);
						btn_1.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					} else {
						if (al.verificaLadosPedra(arrayTabuleiro, 0, p) == true) {
							arrayTabuleiro.add(p);
							btnhumano1.setEnabled(false);
							btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
						} else {
							JOptionPane.showMessageDialog(null, "Pedra diferente");
						}
					}
					habilitaDesabilitaBotoes(false);

					break;
				case 2:
					arrayH.add(p);
					btnhumano1.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnhumano1.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnhumano1.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnhumano1.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnhumano1.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnhumano1.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnhumano1.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnhumano1.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnhumano1.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnhumano1.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnhumano1.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnhumano1.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnhumano1.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
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
			}
		});
		btnhumano3 = new JButton("");
		btnhumano4 = new JButton("");
		btnhumano5 = new JButton("");
		btnhumano6 = new JButton("");
		btnhumano7 = new JButton("");
		btnhumano8 = new JButton("");
		btnhumano9 = new JButton("");
		btnhumano10 = new JButton("");
		btnhumano11 = new JButton("");
		btnhumano12 = new JButton("");
		btnhumano13 = new JButton("");
		btnhumano14 = new JButton("");
		btnhumano15 = new JButton("");
		btnhumano16 = new JButton("");
		btnhumano17 = new JButton("");
		btnhumano18 = new JButton("");

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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l1 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca1.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca1.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
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

		JButton btnpeca2 = new JButton(pecavirada);
		btnpeca2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				Pecas p = array.get(1);
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l2 = ladoa + ladob;
				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca2.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca2.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l3 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca3.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca3.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l4 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca4.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));

					break;
				case 9:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca4.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l5 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca5.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca5.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l6 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca6.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca6.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l7 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca7.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca7.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l8 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca8.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca8.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l9 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca9.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca9.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l10 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca10.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca10.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l11 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca11.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca11.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l12 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca12.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca12.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l13 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca13.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca13.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l14 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca14.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca14.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l15 = ladoa + ladob;
				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca15.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca15.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l16 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca16.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca16.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l17 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca17.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca17.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l18 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca18.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca18.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l19 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca19.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca19.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l20 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca20.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca20.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l21 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca21.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca21.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l22 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca22.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca22.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l23 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca23.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca23.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l24 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca24.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca24.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l25 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca25.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca25.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l26 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca26.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca26.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
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
				l27 = array.get(26).toString();
				Pecas p = array.get(26);
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l27 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca27.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca27.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
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
				String ladoa = p.getLadoDireito().toString();
				String ladob = p.getLadoEsquerdo().toString();

				l28 = ladoa + ladob;

				switch (aux) {
				case 1:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 2:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 3:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 4:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 5:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 6:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 7:
					arrayH.add(p);
					btnpeca28.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 8:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 9:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 10:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 11:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 12:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 13:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 14:
					arrayM.add(p);
					btnpeca28.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
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
		btn_14.setBounds(385, 176, 70, 35);
		panel_tabuleiro.add(btn_14);

		btn_13 = new JButton("");
		btn_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_13.setEnabled(false);
		btn_13.setBounds(385, 210, 35, 70);
		panel_tabuleiro.add(btn_13);

		btn_15 = new JButton("");
		btn_15.setEnabled(false);
		btn_15.setBounds(454, 176, 70, 35);
		panel_tabuleiro.add(btn_15);

		btn_12 = new JButton("");
		btn_12.setEnabled(false);
		btn_12.setBounds(315, 245, 70, 35);
		panel_tabuleiro.add(btn_12);

		btn_16 = new JButton("");
		btn_16.setEnabled(false);
		btn_16.setBounds(524, 176, 70, 35);
		panel_tabuleiro.add(btn_16);

		btn_18 = new JButton("");
		btn_18.setEnabled(false);
		btn_18.setBounds(594, 245, 70, 35);
		panel_tabuleiro.add(btn_18);

		btn_11 = new JButton("");
		btn_11.setEnabled(false);
		btn_11.setBounds(315, 279, 35, 70);
		panel_tabuleiro.add(btn_11);

		btn_23 = new JButton("");
		btn_23.setEnabled(false);
		btn_23.setBounds(870, 315, 70, 35);
		panel_tabuleiro.add(btn_23);

		btn_10 = new JButton("");
		btn_10.setEnabled(false);
		btn_10.setBounds(246, 314, 70, 35);
		panel_tabuleiro.add(btn_10);

		btn_9 = new JButton("");
		btn_9.setEnabled(false);
		btn_9.setBounds(177, 314, 70, 35);
		panel_tabuleiro.add(btn_9);

		btn_8 = new JButton("");
		btn_8.setEnabled(false);
		btn_8.setBounds(108, 314, 70, 35);
		panel_tabuleiro.add(btn_8);

		btn_7 = new JButton("");
		btn_7.setEnabled(false);
		btn_7.setBounds(39, 314, 70, 35);
		panel_tabuleiro.add(btn_7);

		btn_6 = new JButton("");
		btn_6.setEnabled(false);
		btn_6.setBounds(39, 245, 35, 70);
		panel_tabuleiro.add(btn_6);

		btn_5 = new JButton("");
		btn_5.setEnabled(false);
		btn_5.setBounds(39, 176, 35, 70);
		panel_tabuleiro.add(btn_5);

		btn_17 = new JButton("");
		btn_17.setEnabled(false);
		btn_17.setBounds(559, 210, 35, 70);
		panel_tabuleiro.add(btn_17);

		btn_19 = new JButton("");
		btn_19.setEnabled(false);
		btn_19.setBounds(629, 280, 35, 70);
		panel_tabuleiro.add(btn_19);

		btn_20 = new JButton("");
		btn_20.setEnabled(false);
		btn_20.setBounds(663, 315, 70, 35);
		panel_tabuleiro.add(btn_20);

		btn_21 = new JButton("");
		btn_21.setEnabled(false);
		btn_21.setBounds(732, 315, 70, 35);
		panel_tabuleiro.add(btn_21);

		btn_22 = new JButton("");
		btn_22.setEnabled(false);
		btn_22.setBounds(801, 315, 70, 35);
		panel_tabuleiro.add(btn_22);

		btn_27 = new JButton("");
		btn_27.setEnabled(false);
		btn_27.setBounds(870, 74, 70, 35);
		panel_tabuleiro.add(btn_27);

		btn_24 = new JButton("");
		btn_24.setEnabled(false);
		btn_24.setBounds(905, 246, 35, 70);
		panel_tabuleiro.add(btn_24);

		btn_25 = new JButton("");
		btn_25.setEnabled(false);
		btn_25.setBounds(905, 177, 35, 70);
		panel_tabuleiro.add(btn_25);

		btn_26 = new JButton("");
		btn_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_26.setEnabled(false);
		btn_26.setBounds(905, 108, 35, 70);
		panel_tabuleiro.add(btn_26);

		btn_4 = new JButton("");
		btn_4.setEnabled(false);
		btn_4.setBounds(39, 107, 35, 70);
		panel_tabuleiro.add(btn_4);

		btn_3 = new JButton("");
		btn_3.setEnabled(false);
		btn_3.setBounds(39, 72, 70, 35);
		panel_tabuleiro.add(btn_3);

		btn_2 = new JButton("");
		btn_2.setEnabled(false);
		btn_2.setBounds(108, 72, 70, 35);
		panel_tabuleiro.add(btn_2);

		btn_1 = new JButton("");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_1.setEnabled(false);
		btn_1.setBounds(177, 72, 70, 35);
		panel_tabuleiro.add(btn_1);

		btn_28 = new JButton("");
		btn_28.setEnabled(false);
		btn_28.setBounds(801, 74, 70, 35);
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
