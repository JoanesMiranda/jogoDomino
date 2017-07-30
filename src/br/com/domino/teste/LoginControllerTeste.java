package br.com.domino.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.domino.controller.LoginController;
import br.com.domino.model.Login;

public class LoginControllerTeste {

	LoginController loginC;
	Login login;

	@Before
	public void setUp() throws Exception {
		loginC = new LoginController();
		login = new Login();
	}

	//teste 1
	@Test
	public void testSalvar() throws Exception {

		login.setLogin("janderson");
		login.setSenha("123456");
		login.setUsuario(1);

		assertEquals(false, loginC.salvar(login));
	}

	//teste 2
	@Test
	public void testSalvarCamposVazios() throws Exception {

		login.setLogin("");
		login.setSenha("");
		login.setUsuario(1);

		assertEquals(false, loginC.salvar(login));
	}

	// teste 3
	@Test
	public void testSalvarSemCadastro() throws Exception {

		login.setLogin("testekkk");
		login.setSenha("123456");
		login.setUsuario(null);
		assertEquals(false, loginC.salvar(login));
	}

	// teste 4
	@Test
	public void testLoginUsuario() throws Exception {
		assertEquals(true, loginC.loginUsuario("janderson", "123456"));
	}

	// teste 5
	@Test
	public void testLoginUsuarioCamposVazios() throws Exception {
		assertEquals(true, loginC.loginUsuario("", ""));
	}

	// teste 6
	@Test
	public void testLoginUsuarioSqlInjection() throws Exception {
		assertEquals(true, loginC.loginUsuario("sqlinjection", " ' OR '1'='1 "));
	}

}
