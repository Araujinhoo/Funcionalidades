package Steps;

import Elementos.ElementoslaudandoeDevolvendo;
import Metodos.Metodoslaudandoedevolvendo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class Login2 {
	ElementoslaudandoeDevolvendo e = new ElementoslaudandoeDevolvendo();
	Metodoslaudandoedevolvendo m = new Metodoslaudandoedevolvendo();
	
	@Dado("que eu esteja na tela de inicio")
	public void que_eu_esteja_na_tela_de_inicio() {
		m.abrirnavegador(null);
	}

	@Quando("fizer login de tecnico")
	public void fizer_login_de_tecnico() {
		m.preencher(e.getEmail(), "tecnico");
		m.preencher(e.getSenha(), "tecnico");
	}

	@Então("posso fechar")
	public void posso_fechar() {
		m.fechar(null);
	}
}
