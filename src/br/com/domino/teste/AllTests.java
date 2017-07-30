package br.com.domino.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ActionsTeste.class, LoginControllerTeste.class })
public class AllTests {

}
