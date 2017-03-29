package br.com.domino.view;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.domino.controller.LoginController;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField passwordFieldSenha;

	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 400, 450, 300);
		setSize(635, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtLogin = new JTextField();
		txtLogin.setBounds(268, 98, 167, 26);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);

		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(268, 146, 167, 26);
		contentPane.add(passwordFieldSenha);

		ImageIcon cancelalogin = new ImageIcon(".//resource//imagens//iconecancelar.png");
		JButton btnCancelar = new JButton(cancelalogin);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancelar.setBounds(383, 274, 100, 47);
		contentPane.add(btnCancelar);

		ImageIcon entrar = new ImageIcon(".//resource//imagens//IconeEntrar.png");
		JButton btnEntrar = new JButton(entrar);
		btnEntrar.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {

				LoginController login = new LoginController();
				try {
					@SuppressWarnings("deprecation")
					boolean valor = login.loginUsuario(txtLogin.getText(), passwordFieldSenha.getText());
					if (valor == true) {
						dispose();
						TelaDoNivel td = new TelaDoNivel();
						td.Tnivel();
					} else {
						JOptionPane.showMessageDialog(null, "Usuario ou Senha Invalida");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEntrar.setBounds(171, 274, 100, 47);
		contentPane.add(btnEntrar);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSenha.setBounds(197, 146, 70, 20);
		contentPane.add(lblSenha);

		JLabel lbllogin = new JLabel("Login");
		lbllogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbllogin.setForeground(Color.BLACK);
		lbllogin.setBounds(197, 64, 100, 87);
		contentPane.add(lbllogin);

		JLabel lblbackground = new JLabel("");
		lblbackground.setFont(new Font("Arial", Font.PLAIN, 18));
		lblbackground.setIcon(new ImageIcon((".//resource//imagens//modelodomino.png")));
		lblbackground.setBounds(0, 0, 628, 371);
		contentPane.add(lblbackground);
		setIcon();
	}

	private void setIcon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage((".//resource//imagens//pretaicon.png")));

	}
}
