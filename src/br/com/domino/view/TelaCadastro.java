package br.com.domino.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.domino.controller.LoginController;
import br.com.domino.controller.UsuarioController;
import br.com.domino.model.Login;
import br.com.domino.model.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JPasswordField passwordFieldSenha;

	ImageIcon i1 = new ImageIcon(".//resource//imagens//gaara.png");
	ImageIcon i2 = new ImageIcon(".//resource//imagens//gai.png");
	ImageIcon i3 = new ImageIcon(".//resource//imagens//naruto.png");
	ImageIcon i4 = new ImageIcon(".//resource//imagens//pain.png");
	ImageIcon i5 = new ImageIcon(".//resource//imagens//sasuke.png");
	JComboBox<String> combo;
	ImageIcon[] img = { i1, i2, i3, i4, i5 };
	JLabel lblMostrarAvatar;
	private JTextField txtLogin;

	public TelaCadastro() {
		setLocation(new Point(500, 170));
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setFont(new Font("Dialog", Font.BOLD, 14));
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".//resource//imagens//user_add.png"));
		setSize(new Dimension(400, 400));
		setTitle("Cadastro");
		getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNome);

		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(10, 123, 46, 14);
		getContentPane().add(lblSenha);

		JLabel lblcone = new JLabel("Avatar ");
		lblcone.setBounds(10, 183, 46, 14);
		getContentPane().add(lblcone);

		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 275, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(10, 148, 275, 20);
		getContentPane().add(passwordFieldSenha);

		ImageIcon imgSave = new ImageIcon(".//resource//imagens//iconesalvar.png");
		JButton btnSalvar = new JButton(imgSave);
		btnSalvar.setPreferredSize(new Dimension(100, 37));
		btnSalvar.setMinimumSize(new Dimension(100, 37));
		btnSalvar.setMaximumSize(new Dimension(100, 37));
		btnSalvar.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				boolean salvo = false;

				if (txtNome.getText().isEmpty() || txtLogin.getText().isEmpty()
						|| passwordFieldSenha.getText().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Os Campos de Cadastro N�o Podem Ficar Vazios");

				} else {
					// recupera nome e caminho do icone avatar e envia para a
					// classe do usuario.
					Usuario user = new Usuario();
					user.setNome(txtNome.getText());

					// pegando apenas a posi��o do jComboBox para salvar no BD.
					user.setAvatar(combo.getSelectedIndex());

					UsuarioController userC = new UsuarioController();
					try {
						userC.salvar(user);
						salvo = true;
					} catch (Exception e) {
						e.printStackTrace();
					}

					if (passwordFieldSenha.getText().length() < 6 || passwordFieldSenha.getText().length() > 8) {
						JOptionPane.showMessageDialog(null, "A senha deve ter no minimo 6 digitos e no maximo 8");
					} else {
						// recupera login, senha e ultimo id do usuario, envia
						// para classe login
						Login l = new Login();
						l.setLogin(txtLogin.getText());
						l.setSenha(passwordFieldSenha.getText());

						// recupera o ultimo ID do usuario salvo no BD
						UsuarioController uc = new UsuarioController();
						try {
							l.setUsuario(uc.recuperaUltimoId(txtNome.getText()));
						} catch (Exception e) {
							e.printStackTrace();
						}

						// enviar as informa��es para serem salvas no BD
						LoginController lc = new LoginController();
						try {
							if (salvo == true) {
								lc.salvar(l);
								JOptionPane.showMessageDialog(null, "Dados Salvo com Sucesso");
							}

						} catch (Exception e) {
							e.printStackTrace();
						}

						txtNome.setText("");
						txtLogin.setText("");
						passwordFieldSenha.setText("");
						combo.setSelectedIndex(0);
					}
				}
			}
		});
		btnSalvar.setBounds(47, 292, 100, 50);
		getContentPane().add(btnSalvar);
		ImageIcon imgCancel = new ImageIcon(".//resource//imagens//iconecancelar.png");
		JButton btnCancelar = new JButton(imgCancel);
		btnCancelar.setPreferredSize(new Dimension(100, 37));
		btnCancelar.setMinimumSize(new Dimension(100, 37));
		btnCancelar.setMaximumSize(new Dimension(100, 37));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(197, 292, 100, 50);
		getContentPane().add(btnCancelar);

		combo = new JComboBox<String>();
		combo.addItem("Gaara");
		combo.addItem("Guy");
		combo.addItem("Naruto");
		combo.addItem("Pain");
		combo.addItem("Sasuke");
		combo.setBounds(10, 221, 89, 20);
		getContentPane().add(combo);
		combo.addItemListener(new tratarCombobox());

		lblMostrarAvatar = new JLabel(img[0]);
		lblMostrarAvatar.setBounds(253, 183, 100, 100);
		getContentPane().add(lblMostrarAvatar);

		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(10, 67, 46, 14);
		getContentPane().add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setBounds(10, 92, 275, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		ImageIcon fundo = new ImageIcon(".//resource//imagens//fundoCadastrar.png");
		JLabel lblNewLabel = new JLabel(fundo);
		lblNewLabel.setBounds(0, 0, 384, 362);
		getContentPane().add(lblNewLabel);

		setVisible(true);
	}

	public class tratarCombobox implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {

			if (e.getStateChange() == ItemEvent.SELECTED) {

				lblMostrarAvatar.setIcon(img[combo.getSelectedIndex()]);
			}

		}

	}

}
