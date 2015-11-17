package content.general.junity;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClasseComumTest {
	ClasseComum c = new ClasseComum();

	
	
	@Test
	public void testSoma() {
		//falha
		//assertEquals("Deve retornar 30", 30, c.soma(1, 20));
		//sucesso
		assertEquals("Deve retornar 30", 30, c.soma(10, 20));
	}
	
	@Test
	public void testNotNull(){
		assertNotNull("não deve retornar null", c.notNull(1));
	}
	
	@Test
	public void testNomeValido (){
		boolean nome = c.nomeValido("Gabriel");
		assertTrue("Verifica nome válido", nome);
	}
	
}
