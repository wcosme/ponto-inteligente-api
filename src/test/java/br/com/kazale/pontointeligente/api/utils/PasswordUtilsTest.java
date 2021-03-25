package br.com.kazale.pontointeligente.api.utils;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtilsTest {
	
	private static final String SENHA = "123456";
	private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	
	@Test
	public void testSenhaNulla() throws Exception{
		assertNull(PasswordUtils.gerarBCrypt(null));
	}
	
	@Test
	public void testGerarHashSenha() throws Exception{		
		String hash = PasswordUtils.gerarBCrypt(SENHA);		
		assertTrue(encoder.matches(SENHA, hash));
	}
}
