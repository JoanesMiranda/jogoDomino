package br.com.domino.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class TelaDoJogoPrincipal extends JFrame{

	private JFrame frmTelaJogoPrincipal;

	/**
	 * Launch the application.
	 */
	public static void Screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDoJogoPrincipal window = new TelaDoJogoPrincipal();
					window.frmTelaJogoPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDoJogoPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaJogoPrincipal = new JFrame();
		frmTelaJogoPrincipal.setTitle("Tela Jogo Principal");
		frmTelaJogoPrincipal.setSize(1024, 720);
		frmTelaJogoPrincipal.setBounds(100, 100, 1024, 720);
		frmTelaJogoPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTelaJogoPrincipal.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 60, 21);
		frmTelaJogoPrincipal.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNovoJog = new JMenuItem("Novo Jogo");
		mntmNovoJog.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmNovoJog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaDoNivel td = new TelaDoNivel();
				td.Screen();
				frmTelaJogoPrincipal.dispose();
			}
		});
		mnNewMenu.add(mntmNovoJog);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salvar Jogo");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mnIntrues = new JMenuItem("Instruções");
		mnIntrues.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnIntrues.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaInstrucoes ti = new TelaInstrucoes();
				ti.show();
			}
		});
		mnNewMenu.add(mnIntrues);
		
		JButton btnNewButton = new JButton("");
		
		btnNewButton.setIcon(new ImageIcon(".//resource//imagens//audio1.png"));
		btnNewButton.setBounds(948, 0, 60, 55);
		frmTelaJogoPrincipal.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("./resource/Pecas/00.png"));
		button.setBounds(88, 165, 65, 50);
		frmTelaJogoPrincipal.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("./resource/Pecas/01.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(163, 165, 95, 40);
		frmTelaJogoPrincipal.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("./resource/Pecas/02.png"));
		btnNewButton_2.setBounds(268, 165, 118, 50);
		frmTelaJogoPrincipal.getContentPane().add(btnNewButton_2);
		
		JLabel lblAvat = new JLabel("Avat");
		lblAvat.setIcon(new ImageIcon(".//resource//imagens//naruto.png"));
		lblAvat.setBounds(313, 0, 60, 55);
		frmTelaJogoPrincipal.getContentPane().add(lblAvat);
		
		JLabel lblAvatar = new JLabel("Avatar");
		lblAvatar.setIcon(new ImageIcon(".//resource//imagens//gaara.png"));
		lblAvatar.setBounds(313, 631, 54, 50);
		frmTelaJogoPrincipal.getContentPane().add(lblAvatar);
		
		JLabel lblNewLabel_1 = new JLabel("TabelaUser");
		lblNewLabel_1.setIcon(new ImageIcon(".//resource//imagens//borda3.png"));
		lblNewLabel_1.setBounds(388, 630, 440, 50);
		frmTelaJogoPrincipal.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TabelaComp");
		lblNewLabel_2.setIcon(new ImageIcon(".//resource//imagens//borda2.png"));
		lblNewLabel_2.setBounds(383, 0, 440, 50);
		frmTelaJogoPrincipal.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setIcon(new ImageIcon(".//resource//imagens//Fundos_teste.jpg"));
		lblNewLabel.setBounds(0, 0, 1008, 681);
		frmTelaJogoPrincipal.getContentPane().add(lblNewLabel);
		
	}
}
