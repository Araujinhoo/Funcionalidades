package Steps;

import Elementos.ElementoslaudandoeDevolvendo;
import Metodos.Metodoslaudandoedevolvendo;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class Testelaudandodevolvendo {

	
	ElementoslaudandoeDevolvendo e = new ElementoslaudandoeDevolvendo();
	Metodoslaudandoedevolvendo m = new Metodoslaudandoedevolvendo();
	
	@Dado("que eu esteja na tela de home")
	public void que_eu_esteja_na_tela_de_home() throws InterruptedException {
		
		m.abrirnavegador("https://homolog.mobilemed.com.br/exames");
		m.tempo(2250);
		m.preencher(e.getEmail(), "medico3@mobilemed.com.br");
		m.tempo(2200);
		m.clicar(e.getProximo());
		m.tempo(1000);
		m.preencher(e.getSenha(), "Mobile@Med23");
		m.tempo(1550);
		m.clicar(e.getEntrar());
	}
	@Quando("pesquiso pelo paciente desejado")
	public void pesquiso_pelo_paciente_desejado() throws InterruptedException {
		m.tempo(9300);
		m.atualizar(null);
		m.preencher(e.getBuscarpornome(), "Antonioooo");
		m.tempo(4520);
		m.preencher(e.getBuscarpornome(), " 2");
		m.clicar(e.getLupa());
	}
	@Quando("clico em laudario")
	public void clico_em_laudario() throws InterruptedException {
		m.tempo(5000);
		if (m.verificarElementoExiste(e.getLaudario())) {
			m.tempo(3500);
			m.clicar(e.getLaudario());
		} 
		else {
			m.tempo(8000);
		    m.clicar(e.getAssiandos());
		    m.tempo(4000);
		    m.clicar(e.getLaudarioAssinados());
		    m.tempo(6000);
		    m.clicar(e.getReassinarlaudo());
		    m.tempo(5000);
		    m.clicar(e.getFecharlaudo());
		    m.tempo(4500);
		    m.clicar(e.getManternomeunome());
		    m.tempo(4000);
		    m.clicar(e.getAssiandos());
		    m.tempo(4000);
		    m.clicar(e.getLaudario());
		}
	}
	@Quando("clico em salvar")
	public void clico_em_salvar() throws InterruptedException {
		m.tempo(5000);
		m.clicar(e.getAssinar());
	}
	@Quando("clico em assinados")
	public void clico_em_assinados() throws InterruptedException {
		m.tempo(5000);
		m.clicar(e.getAssiandos());
	}
	@Então("posso ver o exame com status de assinado")
	public void posso_ver_o_exame_com_status_de_assinado() throws InterruptedException {
		m.tempo(4000);
		m.fechar(null);
	}
}
