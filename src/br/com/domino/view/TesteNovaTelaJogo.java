package br.com.domino.view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.Font;

public class TesteNovaTelaJogo extends JFrame {
	
	public TesteNovaTelaJogo(){
		
		
		
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
		JButton btnmaquina2 = new JButton("");
		JButton btnmaquina3 = new JButton("");
		JButton btnmaquina4 = new JButton("");
		JButton btnmaquina5 = new JButton("");
		JButton btnmaquina6 = new JButton("");
		JButton btnmaquina7 = new JButton("");
		JButton btnmaquina8 = new JButton("");
		JButton btnmaquina9 = new JButton("");
		JButton btnmaquina10 = new JButton("");
		JButton btnmaquina11= new JButton("");
		JButton btnmaquina12= new JButton("");
		JButton btnmaquina13= new JButton("");
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
		JButton btnhumano2 = new JButton("");
		JButton btnhumano3 = new JButton("");
		JButton btnhumano4 = new JButton("");
		JButton btnhumano5 = new JButton("");
		JButton btnhumano6 = new JButton("");
		JButton btnhumano7 = new JButton("");
		JButton btnhumano8 = new JButton("");
		JButton btnhumano9 = new JButton("");
		JButton btnhumano10 = new JButton("");
		JButton btnhumano11= new JButton("");
		JButton btnhumano12= new JButton("");
		JButton btnhumano13= new JButton("");
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
		JButton btnpeca2 = new JButton(pecavirada);
		JButton btnpeca3 = new JButton(pecavirada);
		JButton btnpeca4 = new JButton(pecavirada);
		JButton btnpeca5 = new JButton(pecavirada);
		JButton btnpeca6 = new JButton(pecavirada);
		JButton btnpeca7 = new JButton(pecavirada);
		JButton btnpeca8 = new JButton(pecavirada);
		JButton btnpeca9 = new JButton(pecavirada);
		JButton btnpeca10 = new JButton(pecavirada);
		JButton btnpeca11 = new JButton(pecavirada);
		JButton btnpeca12 = new JButton(pecavirada);
		JButton btnpeca13 = new JButton(pecavirada);
		JButton btnpeca14 = new JButton(pecavirada);
		JButton btnpeca15 = new JButton(pecavirada);
		JButton btnpeca16 = new JButton(pecavirada);
		JButton btnpeca17 = new JButton(pecavirada);
		JButton btnpeca18 = new JButton(pecavirada);
		JButton btnpeca19 = new JButton(pecavirada);
		JButton btnpeca20 = new JButton(pecavirada);
		JButton btnpeca21 = new JButton(pecavirada);
		JButton btnpeca22 = new JButton(pecavirada);
		JButton btnpeca23 = new JButton(pecavirada);
		JButton btnpeca24 = new JButton(pecavirada);
		JButton btnpeca25 = new JButton(pecavirada);
		JButton btnpeca26 = new JButton(pecavirada);
		JButton btnpeca27 = new JButton(pecavirada);
		JButton btnpeca28 = new JButton(pecavirada);
		
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
		panel_tabuleiro.setBounds(361, 124, 989, 426);
		getContentPane().add(panel_tabuleiro);
		
		JLabel lblEscolhaSuasPecas = new JLabel("Escolha Suas Pecas");
		lblEscolhaSuasPecas.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEscolhaSuasPecas.setBounds(79, 98, 160, 36);
		getContentPane().add(lblEscolhaSuasPecas);
		
		setSize(1366,720);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main (String[] args){
		new TesteNovaTelaJogo();
	}
}
