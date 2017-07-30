package br.com.domino.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.xml.bind.ValidationException;

import br.com.domino.model.Login;
import br.com.domino.model.DAO.Conecta;

public class LoginController {
	Conecta conexao = Conecta.getInstance();

	public boolean salvar(Login login) throws Exception {

		if (login.getLogin().isEmpty() || login.getSenha().isEmpty()) {

			throw new ValidationException("O campo login � obrigatorio");
		} else {

			boolean logado = true;
			conexao.conecta();
			try {
				PreparedStatement stm = conexao.conn
						.prepareStatement("INSERT INTO login (usuario,senha,fk_usuario) VALUES (?,?,?)");
				stm.setString(1, login.getLogin());
				stm.setString(2, login.getSenha());
				stm.setInt(3, login.getUsuario());

				logado = stm.execute();
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "erro ao salvar na tabela login" + ex.getMessage());
			}
			conexao.desconecta();
			return logado;
		}

	}

	public boolean loginUsuario(String usuario, String senha) throws Exception {
		boolean confirma = false;
		conexao.conecta();
		try {
			PreparedStatement stm = conexao.conn.prepareStatement("SELECT * FROM login");
			ResultSet rs = stm.executeQuery();
			// rs.first();// pega os primeiros elementos da tabela
			while (rs.next()) {
				String user = rs.getString("usuario");
				String password = rs.getString("senha");

				if (usuario.equals(user) && senha.equals(password)) {
					confirma = true;
				}
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		conexao.desconecta();
		return confirma;
	}

}
