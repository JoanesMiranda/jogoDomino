package br.com.domino.view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaInicial extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 450, 300);
		setSize(644,410);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon botaoRank = new ImageIcon(".//resource//imagens//IconeRegras.png");
		JButton bntRank = new JButton(botaoRank);
		bntRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TelaInstrucoes().setVisible(true);
			}
		});
		bntRank.setForeground(Color.BLACK);
		bntRank.setBackground(Color.WHITE);
		bntRank.setBounds(345, 282, 99, 48);
		contentPane.add(bntRank);
		
		ImageIcon botaoLogin = new ImageIcon(".//resource//imagens//IconeLogin.png");
		JButton btnLogin = new JButton(botaoLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
			}
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(154, 67, 99, 48);
		contentPane.add(btnLogin);
		
		ImageIcon botaoCadastro = new ImageIcon(".//resource//imagens//IconeCadastrar.png");
		JButton btnCadastro = new JButton(botaoCadastro);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				TelaCadastro telaCadastro = new TelaCadastro();
			}
		});
		btnCadastro.setForeground(Color.BLACK);
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.setBounds(256, 168, 99, 48);
		contentPane.add(btnCadastro);
		
		JLabel lblimagem = new JLabel("");
		lblimagem.setForeground(Color.ORANGE);
		lblimagem.setIcon(new ImageIcon(".//resource//imagens//modelodomino.png"));
		lblimagem.setBounds(0, 0, 654, 398);
		contentPane.add(lblimagem);
		
		setIcon();
	}

	private void setIcon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".//resource//imagens//pretaicon.png"));
		
	}
	
	public static void main (String[] args){
		
		new TelaInicial();
	}
}
