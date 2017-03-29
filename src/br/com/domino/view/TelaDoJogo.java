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
import br.com.domino.model.Aleatorio;
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
	int aux = 0;
	Aleatorio al = new Aleatorio();

	private static final long serialVersionUID = 1L;
	private JButton btnhumano10;

	public TelaDoJogo() {

		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int num : al.geraNumerosAleatorios()) {
			array.add(num);
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
		mnMenu.add(mntmInstrues);

		JMenuItem mntmSair = new JMenuItem("Sair");
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

		JButton btnmaquina1 = new JButton("");
		btnmaquina1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		JButton btnmaquina2 = new JButton("");
		JButton btnmaquina3 = new JButton("");
		JButton btnmaquina4 = new JButton("");
		JButton btnmaquina5 = new JButton("");
		JButton btnmaquina6 = new JButton("");
		JButton btnmaquina7 = new JButton("");
		JButton btnmaquina8 = new JButton("");
		JButton btnmaquina9 = new JButton("");
		JButton btnmaquina10 = new JButton("");
		JButton btnmaquina11 = new JButton("");
		JButton btnmaquina12 = new JButton("");
		JButton btnmaquina13 = new JButton("");
		JButton btnmaquina14 = new JButton("");
		JButton btnmaquina15 = new JButton("");
		JButton btnmaquina16 = new JButton("");
		JButton btnmaquina17 = new JButton("");
		JButton btnmaquina18 = new JButton("");

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

		JButton btnhumano1 = new JButton("");
		btnhumano1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JButton btnhumano2 = new JButton("");
		btnhumano2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JButton btnhumano3 = new JButton("");
		JButton btnhumano4 = new JButton("");
		JButton btnhumano5 = new JButton("");
		JButton btnhumano6 = new JButton("");
		JButton btnhumano7 = new JButton("");
		JButton btnhumano8 = new JButton("");
		JButton btnhumano9 = new JButton("");
		btnhumano10 = new JButton("");
		JButton btnhumano11 = new JButton("");
		JButton btnhumano12 = new JButton("");
		JButton btnhumano13 = new JButton("");
		JButton btnhumano14 = new JButton("");
		JButton btnhumano15 = new JButton("");
		JButton btnhumano16 = new JButton("");
		JButton btnhumano17 = new JButton("");
		JButton btnhumano18 = new JButton("");

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
				l1 = array.get(0).toString();
				switch (aux) {
				case 1:
					btnpeca1.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 2:
					btnpeca1.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 3:
					btnpeca1.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 4:
					btnpeca1.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 5:
					btnpeca1.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 6:
					btnpeca1.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 7:
					btnpeca1.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 8:
					btnpeca1.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 9:
					btnpeca1.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 10:
					btnpeca1.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 11:
					btnpeca1.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 12:
					btnpeca1.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 13:
					btnpeca1.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;
				case 14:
					btnpeca1.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l1 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// l1 = array.get(0).toString();
				// if (aux == 1) {
				// btnpeca1.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l1
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca1.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l1
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca1.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l1
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca1.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l1
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca1.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l1
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca1.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l1
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca1.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l1
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca2 = new JButton(pecavirada);
		btnpeca2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l2 = array.get(1).toString();
				switch (aux) {
				case 1:
					btnpeca2.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 2:
					btnpeca2.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 3:
					btnpeca2.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 4:
					btnpeca2.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 5:
					btnpeca2.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 6:
					btnpeca2.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 7:
					btnpeca2.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 8:
					btnpeca2.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 9:
					btnpeca2.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 10:
					btnpeca2.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 11:
					btnpeca2.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 12:
					btnpeca2.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 13:
					btnpeca2.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;
				case 14:
					btnpeca2.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l2 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca2.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l2
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca2.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l2
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca2.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l2
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca2.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l2
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca2.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l2
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca2.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l2
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca2.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l2
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}

		});

		JButton btnpeca3 = new JButton(pecavirada);
		btnpeca3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l3 = array.get(2).toString();

				switch (aux) {
				case 1:
					btnpeca3.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 2:
					btnpeca3.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 3:
					btnpeca3.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 4:
					btnpeca3.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 5:
					btnpeca3.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 6:
					btnpeca3.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 7:
					btnpeca3.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 8:
					btnpeca3.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 9:
					btnpeca3.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 10:
					btnpeca3.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 11:
					btnpeca3.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 12:
					btnpeca3.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 13:
					btnpeca3.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;
				case 14:
					btnpeca3.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l3 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca3.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l3
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca3.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l3
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca3.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l3
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca3.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l3
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca3.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l3
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca3.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l3
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca3.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l3
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}

		});

		JButton btnpeca4 = new JButton(pecavirada);
		btnpeca4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l4 = array.get(3).toString();

				switch (aux) {
				case 1:
					btnpeca4.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 2:
					btnpeca4.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 3:
					btnpeca4.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 4:
					btnpeca4.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 5:
					btnpeca4.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 6:
					btnpeca4.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 7:
					btnpeca4.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 8:
					btnpeca4.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 9:
					btnpeca4.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 10:
					btnpeca4.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 11:
					btnpeca4.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 12:
					btnpeca4.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 13:
					btnpeca4.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;
				case 14:
					btnpeca4.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l4 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca4.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l4
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca4.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l4
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca4.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l4
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca4.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l4
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca4.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l4
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca4.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l4
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca4.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l4
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}

		});

		JButton btnpeca5 = new JButton(pecavirada);
		btnpeca5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l5 = array.get(4).toString();

				switch (aux) {
				case 1:
					btnpeca5.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 2:
					btnpeca5.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 3:
					btnpeca5.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 4:
					btnpeca5.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 5:
					btnpeca5.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 6:
					btnpeca5.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 7:
					btnpeca5.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 8:
					btnpeca5.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 9:
					btnpeca5.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 10:
					btnpeca5.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 11:
					btnpeca5.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 12:
					btnpeca5.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 13:
					btnpeca5.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;
				case 14:
					btnpeca5.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l5 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca5.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l5
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca5.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l5
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca5.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l5
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca5.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l5
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca5.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l5
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca5.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l5
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca5.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l5
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}

		});

		JButton btnpeca6 = new JButton(pecavirada);
		btnpeca6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l6 = array.get(5).toString();

				switch (aux) {
				case 1:
					btnpeca6.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 2:
					btnpeca6.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 3:
					btnpeca6.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 4:
					btnpeca6.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 5:
					btnpeca6.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 6:
					btnpeca6.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 7:
					btnpeca6.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 8:
					btnpeca6.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 9:
					btnpeca6.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 10:
					btnpeca6.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 11:
					btnpeca6.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 12:
					btnpeca6.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 13:
					btnpeca6.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;
				case 14:
					btnpeca6.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l6 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca6.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l6
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca6.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l6
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca6.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l6
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca6.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l6
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca6.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l6
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca6.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l6
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca6.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l6
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}

		});

		JButton btnpeca7 = new JButton(pecavirada);
		btnpeca7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l7 = array.get(6).toString();

				switch (aux) {
				case 1:
					btnpeca7.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 2:
					btnpeca7.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 3:
					btnpeca7.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 4:
					btnpeca7.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 5:
					btnpeca7.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 6:
					btnpeca7.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 7:
					btnpeca7.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 8:
					btnpeca7.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 9:
					btnpeca7.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 10:
					btnpeca7.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 11:
					btnpeca7.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 12:
					btnpeca7.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 13:
					btnpeca7.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;
				case 14:
					btnpeca7.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l7 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca7.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l7
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca7.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l7
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca7.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l7
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca7.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l7
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca7.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l7
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca7.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l7
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca7.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l7
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}

		});

		JButton btnpeca8 = new JButton(pecavirada);
		btnpeca8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l8 = array.get(7).toString();

				switch (aux) {
				case 1:
					btnpeca8.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 2:
					btnpeca8.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 3:
					btnpeca8.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 4:
					btnpeca8.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 5:
					btnpeca8.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 6:
					btnpeca8.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 7:
					btnpeca8.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 8:
					btnpeca8.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 9:
					btnpeca8.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 10:
					btnpeca8.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 11:
					btnpeca8.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 12:
					btnpeca8.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 13:
					btnpeca8.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;
				case 14:
					btnpeca8.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l8 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca8.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l8
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca8.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l8
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca8.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l8
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca8.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l8
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca8.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l8
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca8.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l8
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca8.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l8
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca9 = new JButton(pecavirada);
		btnpeca9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l9 = array.get(8).toString();

				switch (aux) {
				case 1:
					btnpeca9.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 2:
					btnpeca9.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 3:
					btnpeca9.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 4:
					btnpeca9.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 5:
					btnpeca9.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 6:
					btnpeca9.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 7:
					btnpeca9.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 8:
					btnpeca9.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 9:
					btnpeca9.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 10:
					btnpeca9.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 11:
					btnpeca9.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 12:
					btnpeca9.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 13:
					btnpeca9.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;
				case 14:
					btnpeca9.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l9 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca9.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l9
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca9.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l9
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca9.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l9
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca9.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l9
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca9.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l9
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca9.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l9
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca9.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l9
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}
		});

		JButton btnpeca10 = new JButton(pecavirada);
		btnpeca10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l10 = array.get(9).toString();

				switch (aux) {
				case 1:
					btnpeca10.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 2:
					btnpeca10.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 3:
					btnpeca10.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 4:
					btnpeca10.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 5:
					btnpeca10.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 6:
					btnpeca10.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 7:
					btnpeca10.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 8:
					btnpeca10.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 9:
					btnpeca10.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 10:
					btnpeca10.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 11:
					btnpeca10.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 12:
					btnpeca10.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 13:
					btnpeca10.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;
				case 14:
					btnpeca10.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l10 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca10.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l10
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca10.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l10
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca10.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l10
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca10.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l10
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca10.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l10
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca10.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l10
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca10.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l10
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca11 = new JButton(pecavirada);
		btnpeca11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l11 = array.get(10).toString();

				switch (aux) {
				case 1:
					btnpeca11.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 2:
					btnpeca11.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 3:
					btnpeca11.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 4:
					btnpeca11.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 5:
					btnpeca11.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 6:
					btnpeca11.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 7:
					btnpeca11.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 8:
					btnpeca11.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 9:
					btnpeca11.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 10:
					btnpeca11.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 11:
					btnpeca11.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 12:
					btnpeca11.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 13:
					btnpeca11.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;
				case 14:
					btnpeca11.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l11 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca11.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l11
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca11.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l11
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca11.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l11
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca11.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l11
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca11.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l11
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca11.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l11
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca11.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l11
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca12 = new JButton(pecavirada);
		btnpeca12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l12 = array.get(11).toString();

				switch (aux) {
				case 1:
					btnpeca12.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 2:
					btnpeca12.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 3:
					btnpeca12.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 4:
					btnpeca12.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 5:
					btnpeca12.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 6:
					btnpeca12.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 7:
					btnpeca12.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 8:
					btnpeca12.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 9:
					btnpeca12.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 10:
					btnpeca12.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 11:
					btnpeca12.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 12:
					btnpeca12.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 13:
					btnpeca12.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;
				case 14:
					btnpeca12.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l12 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca12.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l12
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca12.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l12
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca12.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l12
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca12.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l12
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca12.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l12
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca12.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l12
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca12.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l12
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}
		});

		JButton btnpeca13 = new JButton(pecavirada);
		btnpeca13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l13 = array.get(12).toString();

				switch (aux) {
				case 1:
					btnpeca13.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 2:
					btnpeca13.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 3:
					btnpeca13.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 4:
					btnpeca13.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 5:
					btnpeca13.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 6:
					btnpeca13.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 7:
					btnpeca13.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 8:
					btnpeca13.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 9:
					btnpeca13.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 10:
					btnpeca13.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 11:
					btnpeca13.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 12:
					btnpeca13.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 13:
					btnpeca13.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;
				case 14:
					btnpeca13.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l13 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca13.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l13
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca13.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l13
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca13.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l13
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca13.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l13
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca13.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l13
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca13.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l13
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca13.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l13
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca14 = new JButton(pecavirada);
		btnpeca14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l14 = array.get(13).toString();

				switch (aux) {
				case 1:
					btnpeca14.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 2:
					btnpeca14.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 3:
					btnpeca14.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 4:
					btnpeca14.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 5:
					btnpeca14.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 6:
					btnpeca14.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 7:
					btnpeca14.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 8:
					btnpeca14.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 9:
					btnpeca14.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 10:
					btnpeca14.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 11:
					btnpeca14.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 12:
					btnpeca14.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 13:
					btnpeca14.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;
				case 14:
					btnpeca14.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l14 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca14.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l14
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca14.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l14
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca14.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l14
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca14.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l14
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca14.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l14
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca14.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l14
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca14.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l14
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca15 = new JButton(pecavirada);
		btnpeca15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l15 = array.get(14).toString();

				switch (aux) {
				case 1:
					btnpeca15.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 2:
					btnpeca15.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 3:
					btnpeca15.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 4:
					btnpeca15.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 5:
					btnpeca15.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 6:
					btnpeca15.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 7:
					btnpeca15.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 8:
					btnpeca15.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 9:
					btnpeca15.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 10:
					btnpeca15.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 11:
					btnpeca15.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 12:
					btnpeca15.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 13:
					btnpeca15.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;
				case 14:
					btnpeca15.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l15 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca15.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l15
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca15.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l15
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca15.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l15
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca15.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l15
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca15.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l15
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca15.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l15
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca15.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l15
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}
		});

		JButton btnpeca16 = new JButton(pecavirada);
		btnpeca16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l16 = array.get(15).toString();

				switch (aux) {
				case 1:
					btnpeca16.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 2:
					btnpeca16.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 3:
					btnpeca16.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 4:
					btnpeca16.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 5:
					btnpeca16.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 6:
					btnpeca16.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 7:
					btnpeca16.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 8:
					btnpeca16.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 9:
					btnpeca16.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 10:
					btnpeca16.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 11:
					btnpeca16.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 12:
					btnpeca16.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 13:
					btnpeca16.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;
				case 14:
					btnpeca16.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l16 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca16.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l16
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca16.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l16
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca16.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l16
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca16.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l16
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca16.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l16
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca16.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l16
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca16.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l16
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca17 = new JButton(pecavirada);
		btnpeca17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l17 = array.get(16).toString();

				switch (aux) {
				case 1:
					btnpeca17.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 2:
					btnpeca17.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 3:
					btnpeca17.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 4:
					btnpeca17.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 5:
					btnpeca17.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 6:
					btnpeca17.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 7:
					btnpeca17.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 8:
					btnpeca17.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 9:
					btnpeca17.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 10:
					btnpeca17.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 11:
					btnpeca17.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 12:
					btnpeca17.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 13:
					btnpeca17.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;
				case 14:
					btnpeca17.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l17 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca17.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l17
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca17.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l17
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca17.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l17
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca17.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l17
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca17.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l17
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca17.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l17
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca17.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l17
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}

		});

		JButton btnpeca18 = new JButton(pecavirada);
		btnpeca18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l18 = array.get(17).toString();

				switch (aux) {
				case 1:
					btnpeca18.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 2:
					btnpeca18.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 3:
					btnpeca18.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 4:
					btnpeca18.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 5:
					btnpeca18.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 6:
					btnpeca18.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 7:
					btnpeca18.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 8:
					btnpeca18.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 9:
					btnpeca18.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 10:
					btnpeca18.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 11:
					btnpeca18.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 12:
					btnpeca18.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 13:
					btnpeca18.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;
				case 14:
					btnpeca18.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l18 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca18.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l18
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca18.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l18
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca18.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l18
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca18.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l18
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca18.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l18
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca18.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l18
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca18.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l18
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca19 = new JButton(pecavirada);
		btnpeca19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l19 = array.get(18).toString();

				switch (aux) {
				case 1:
					btnpeca19.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 2:
					btnpeca19.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 3:
					btnpeca19.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 4:
					btnpeca19.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 5:
					btnpeca19.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 6:
					btnpeca19.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 7:
					btnpeca19.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 8:
					btnpeca19.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 9:
					btnpeca19.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 10:
					btnpeca19.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 11:
					btnpeca19.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 12:
					btnpeca19.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 13:
					btnpeca19.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;
				case 14:
					btnpeca19.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l19 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca19.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l19
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca19.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l19
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca19.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l19
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca19.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l19
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca19.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l19
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca19.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l19
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca19.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l19
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}
		});

		JButton btnpeca20 = new JButton(pecavirada);
		btnpeca20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l20 = array.get(19).toString();

				switch (aux) {
				case 1:
					btnpeca20.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 2:
					btnpeca20.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 3:
					btnpeca20.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 4:
					btnpeca20.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 5:
					btnpeca20.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 6:
					btnpeca20.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 7:
					btnpeca20.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 8:
					btnpeca20.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 9:
					btnpeca20.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 10:
					btnpeca20.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 11:
					btnpeca20.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 12:
					btnpeca20.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 13:
					btnpeca20.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;
				case 14:
					btnpeca20.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l20 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca20.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l20
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca20.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l20
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca20.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l20
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca20.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l20
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca20.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l20
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca20.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l20
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca20.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l20
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }

			}
		});

		JButton btnpeca21 = new JButton(pecavirada);
		btnpeca21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l21 = array.get(20).toString();

				switch (aux) {
				case 1:
					btnpeca21.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 2:
					btnpeca21.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 3:
					btnpeca21.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 4:
					btnpeca21.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 5:
					btnpeca21.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 6:
					btnpeca21.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 7:
					btnpeca21.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 8:
					btnpeca21.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 9:
					btnpeca21.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 10:
					btnpeca21.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 11:
					btnpeca21.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 12:
					btnpeca21.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 13:
					btnpeca21.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;
				case 14:
					btnpeca21.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l21 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca21.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l21
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca21.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l21
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca21.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l21
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca21.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l21
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca21.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l21
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca21.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l21
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca21.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l21
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca22 = new JButton(pecavirada);
		btnpeca22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l22 = array.get(21).toString();

				switch (aux) {
				case 1:
					btnpeca22.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 2:
					btnpeca22.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 3:
					btnpeca22.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 4:
					btnpeca22.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 5:
					btnpeca22.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 6:
					btnpeca22.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 7:
					btnpeca22.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 8:
					btnpeca22.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 9:
					btnpeca22.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 10:
					btnpeca22.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 11:
					btnpeca22.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 12:
					btnpeca22.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 13:
					btnpeca22.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;
				case 14:
					btnpeca22.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l22 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca22.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l22
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca22.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l22
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca22.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l22
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca22.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l22
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca22.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l22
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca22.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l22
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca22.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l22
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca23 = new JButton(pecavirada);
		btnpeca23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l23 = array.get(22).toString();

				switch (aux) {
				case 1:
					btnpeca23.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 2:
					btnpeca23.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 3:
					btnpeca23.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 4:
					btnpeca23.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 5:
					btnpeca23.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 6:
					btnpeca23.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 7:
					btnpeca23.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 8:
					btnpeca23.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 9:
					btnpeca23.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 10:
					btnpeca23.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 11:
					btnpeca23.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 12:
					btnpeca23.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 13:
					btnpeca23.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;
				case 14:
					btnpeca23.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l23 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca23.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca23.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca23.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca23.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca23.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca23.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca23.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca24 = new JButton(pecavirada);
		btnpeca24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l24 = array.get(23).toString();

				switch (aux) {
				case 1:
					btnpeca24.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 2:
					btnpeca24.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 3:
					btnpeca24.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 4:
					btnpeca24.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 5:
					btnpeca24.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 6:
					btnpeca24.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 7:
					btnpeca24.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 8:
					btnpeca24.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 9:
					btnpeca24.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 10:
					btnpeca24.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 11:
					btnpeca24.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 12:
					btnpeca24.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 13:
					btnpeca24.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;
				case 14:
					btnpeca24.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l24 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca24.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l24
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca24.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l24
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca24.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l24
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca24.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l24
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca24.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l24
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca24.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l24
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca24.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l24
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca25 = new JButton(pecavirada);
		btnpeca25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l25 = array.get(24).toString();

				switch (aux) {
				case 1:
					btnpeca25.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 2:
					btnpeca25.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 3:
					btnpeca25.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 4:
					btnpeca25.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 5:
					btnpeca25.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 6:
					btnpeca25.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 7:
					btnpeca25.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 8:
					btnpeca25.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 9:
					btnpeca25.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 10:
					btnpeca25.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 11:
					btnpeca25.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 12:
					btnpeca25.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 13:
					btnpeca25.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;
				case 14:
					btnpeca25.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l25 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}
				// if (aux == 1) {
				// btnpeca25.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l25
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca25.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l25
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca25.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l25
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca25.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l25
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca25.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l25
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca25.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l25
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca25.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l25
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca26 = new JButton(pecavirada);
		btnpeca26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l26 = array.get(25).toString();

				switch (aux) {
				case 1:
					btnpeca26.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 2:
					btnpeca26.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 3:
					btnpeca26.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 4:
					btnpeca26.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 5:
					btnpeca26.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 6:
					btnpeca26.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 7:
					btnpeca26.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 8:
					btnpeca26.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 9:
					btnpeca26.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 10:
					btnpeca26.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 11:
					btnpeca26.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 12:
					btnpeca26.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 13:
					btnpeca26.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;
				case 14:
					btnpeca26.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l26 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca26.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l26
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca26.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l26
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca26.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l26
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca26.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l26
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca26.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l26
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca26.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l26
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca26.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l26
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca27 = new JButton(pecavirada);
		btnpeca27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l27 = array.get(26).toString();

				switch (aux) {
				case 1:
					btnpeca27.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 2:
					btnpeca27.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 3:
					btnpeca27.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 4:
					btnpeca27.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 5:
					btnpeca27.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 6:
					btnpeca27.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 7:
					btnpeca27.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 8:
					btnpeca27.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 9:
					btnpeca27.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 10:
					btnpeca27.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 11:
					btnpeca27.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 12:
					btnpeca27.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 13:
					btnpeca27.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;
				case 14:
					btnpeca27.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l27 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca27.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l27
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca27.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l27
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca27.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l27
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca27.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l27
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca27.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l27
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca27.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l27
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca27.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l23
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
			}
		});

		JButton btnpeca28 = new JButton(pecavirada);
		btnpeca28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				++aux;
				l28 = array.get(27).toString();

				switch (aux) {
				case 1:
					btnpeca28.setEnabled(false);
					btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 2:
					btnpeca28.setEnabled(false);
					btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 3:
					btnpeca28.setEnabled(false);
					btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 4:
					btnpeca28.setEnabled(false);
					btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 5:
					btnpeca28.setEnabled(false);
					btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 6:
					btnpeca28.setEnabled(false);
					btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 7:
					btnpeca28.setEnabled(false);
					btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 8:
					btnpeca28.setEnabled(false);
					btnmaquina1.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 9:
					btnpeca28.setEnabled(false);
					btnmaquina2.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 10:
					btnpeca28.setEnabled(false);
					btnmaquina3.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 11:
					btnpeca28.setEnabled(false);
					btnmaquina4.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 12:
					btnpeca28.setEnabled(false);
					btnmaquina5.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 13:
					btnpeca28.setEnabled(false);
					btnmaquina6.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;
				case 14:
					btnpeca28.setEnabled(false);
					btnmaquina7.setIcon(new ImageIcon(".//resource//Pecas//" + l28 + ".png"));
					break;

				default:
					JOptionPane.showMessageDialog(null, "Peças esgotadas");
					break;
				}

				// if (aux == 1) {
				// btnpeca28.setEnabled(false);
				// btnhumano1.setIcon(new ImageIcon(".//resource//Pecas//" + l28
				// + ".png"));
				// } else {
				// if (aux == 2) {
				// btnpeca28.setEnabled(false);
				// btnhumano2.setIcon(new ImageIcon(".//resource//Pecas//" + l28
				// + ".png"));
				// } else {
				// if (aux == 3) {
				// btnpeca28.setEnabled(false);
				// btnhumano3.setIcon(new ImageIcon(".//resource//Pecas//" + l28
				// + ".png"));
				// } else {
				// if (aux == 4) {
				// btnpeca28.setEnabled(false);
				// btnhumano4.setIcon(new ImageIcon(".//resource//Pecas//" + l28
				// + ".png"));
				// } else {
				// if (aux == 5) {
				// btnpeca28.setEnabled(false);
				// btnhumano5.setIcon(new ImageIcon(".//resource//Pecas//" + l28
				// + ".png"));
				// } else {
				// if (aux == 6) {
				// btnpeca28.setEnabled(false);
				// btnhumano6.setIcon(new ImageIcon(".//resource//Pecas//" + l28
				// + ".png"));
				// } else {
				// if (aux == 7) {
				// btnpeca28.setEnabled(false);
				// btnhumano7.setIcon(new ImageIcon(".//resource//Pecas//" + l28
				// + ".png"));
				// }
				// }
				// }
				// }
				// }
				// }
				// }
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

		JButton button = new JButton("");
		button.setEnabled(false);
		button.setBounds(385, 176, 70, 35);
		panel_tabuleiro.add(button);

		JButton button_1 = new JButton("");
		button_1.setEnabled(false);
		button_1.setBounds(385, 210, 35, 70);
		panel_tabuleiro.add(button_1);

		JButton button_2 = new JButton("");
		button_2.setEnabled(false);
		button_2.setBounds(454, 176, 70, 35);
		panel_tabuleiro.add(button_2);

		JButton button_3 = new JButton("");
		button_3.setEnabled(false);
		button_3.setBounds(315, 245, 70, 35);
		panel_tabuleiro.add(button_3);

		JButton button_4 = new JButton("");
		button_4.setEnabled(false);
		button_4.setBounds(524, 176, 70, 35);
		panel_tabuleiro.add(button_4);

		JButton button_5 = new JButton("");
		button_5.setEnabled(false);
		button_5.setBounds(594, 245, 70, 35);
		panel_tabuleiro.add(button_5);

		JButton button_6 = new JButton("");
		button_6.setEnabled(false);
		button_6.setBounds(315, 279, 35, 70);
		panel_tabuleiro.add(button_6);

		JButton button_7 = new JButton("");
		button_7.setEnabled(false);
		button_7.setBounds(870, 315, 70, 35);
		panel_tabuleiro.add(button_7);

		JButton button_8 = new JButton("");
		button_8.setEnabled(false);
		button_8.setBounds(246, 314, 70, 35);
		panel_tabuleiro.add(button_8);

		JButton button_9 = new JButton("");
		button_9.setEnabled(false);
		button_9.setBounds(177, 314, 70, 35);
		panel_tabuleiro.add(button_9);

		JButton button_10 = new JButton("");
		button_10.setEnabled(false);
		button_10.setBounds(108, 314, 70, 35);
		panel_tabuleiro.add(button_10);

		JButton button_11 = new JButton("");
		button_11.setEnabled(false);
		button_11.setBounds(39, 314, 70, 35);
		panel_tabuleiro.add(button_11);

		JButton button_12 = new JButton("");
		button_12.setEnabled(false);
		button_12.setBounds(39, 245, 35, 70);
		panel_tabuleiro.add(button_12);

		JButton button_13 = new JButton("");
		button_13.setEnabled(false);
		button_13.setBounds(39, 176, 35, 70);
		panel_tabuleiro.add(button_13);

		JButton button_14 = new JButton("");
		button_14.setEnabled(false);
		button_14.setBounds(559, 210, 35, 70);
		panel_tabuleiro.add(button_14);

		JButton button_15 = new JButton("");
		button_15.setEnabled(false);
		button_15.setBounds(629, 280, 35, 70);
		panel_tabuleiro.add(button_15);

		JButton button_16 = new JButton("");
		button_16.setEnabled(false);
		button_16.setBounds(663, 315, 70, 35);
		panel_tabuleiro.add(button_16);

		JButton button_17 = new JButton("");
		button_17.setEnabled(false);
		button_17.setBounds(732, 315, 70, 35);
		panel_tabuleiro.add(button_17);

		JButton button_18 = new JButton("");
		button_18.setEnabled(false);
		button_18.setBounds(801, 315, 70, 35);
		panel_tabuleiro.add(button_18);

		JButton button_19 = new JButton("");
		button_19.setEnabled(false);
		button_19.setBounds(870, 74, 70, 35);
		panel_tabuleiro.add(button_19);

		JButton button_20 = new JButton("");
		button_20.setEnabled(false);
		button_20.setBounds(905, 246, 35, 70);
		panel_tabuleiro.add(button_20);

		JButton button_21 = new JButton("");
		button_21.setEnabled(false);
		button_21.setBounds(905, 177, 35, 70);
		panel_tabuleiro.add(button_21);

		JButton button_22 = new JButton("");
		button_22.setEnabled(false);
		button_22.setBounds(905, 108, 35, 70);
		panel_tabuleiro.add(button_22);

		JButton button_24 = new JButton("");
		button_24.setEnabled(false);
		button_24.setBounds(39, 107, 35, 70);
		panel_tabuleiro.add(button_24);

		JButton button_25 = new JButton("");
		button_25.setEnabled(false);
		button_25.setBounds(39, 72, 70, 35);
		panel_tabuleiro.add(button_25);

		JButton button_26 = new JButton("");
		button_26.setEnabled(false);
		button_26.setBounds(108, 72, 70, 35);
		panel_tabuleiro.add(button_26);

		JButton button_27 = new JButton("");
		button_27.setEnabled(false);
		button_27.setBounds(177, 72, 70, 35);
		panel_tabuleiro.add(button_27);

		JButton button_23 = new JButton("");
		button_23.setEnabled(false);
		button_23.setBounds(801, 74, 70, 35);
		panel_tabuleiro.add(button_23);

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
