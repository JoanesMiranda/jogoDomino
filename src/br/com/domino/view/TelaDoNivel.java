package br.com.domino.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDoNivel extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */

	public static void Tnivel() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDoNivel window = new TelaDoNivel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDoNivel() {
		initialize();
	}

	public void Screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDoNivel window = new TelaDoNivel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 422, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Fac\u00EDl");
		btnNewButton.setIcon(new ImageIcon(".//resource//imagens//facil.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				TelaDoJogo sc = new TelaDoJogo();
				sc.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(136, 92, 141, 55);
		frame.getContentPane().add(btnNewButton);

		JButton btnDificil = new JButton("Dificil");
		btnDificil.setIcon(new ImageIcon(".//resource//imagens//dificil.png"));
		btnDificil.setFont(new Font("Sylfaen", Font.BOLD, 13));
		btnDificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDoJogo sc = new TelaDoJogo();
				sc.setVisible(true);
				frame.dispose();
			}
		});
		btnDificil.setBounds(136, 152, 141, 55);
		frame.getContentPane().add(btnDificil);

		JLabel lblNewLabel_1 = new JLabel("Escolha O Nivel do Jogo");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(108, 34, 228, 47);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".//resource//imagens//fundoCadastrar.png"));
		lblNewLabel.setBounds(0, 0, 409, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
