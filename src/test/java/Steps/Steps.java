package Steps;

import org.openqa.selenium.By;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
		m.abrirNavegador(url);
	
	}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() {
		
		m.clicar(e.getBtnAbrirConta());
	}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() {
		m.clicar(e.getBtnAbrirContaParaVoce());
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
		m.preencher(e.getCampoNome(), "Marina");
		m.preencher(e.getCampoTelefone(), "123945698125");
		m.preencher(e.getCampoEmail(), "teste@teste.com.br");
		m.preencher(e.getCampoCpf(), "30104479060");
	}
	
	
	@When("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() {
		m.clicar(By.id("onetrust-accept-btn-handler"));

		m.clicar(e.getBtnQueroSerCliente());

	}

	@Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() throws InterruptedException {
		m.pausa(2000);
		m.validarTexto(e.getTextoFaltaPouco(), "Falta pouco!");
		m.fecharNavegador();
	}
	@Given("selecionar o botao abrir conta em para minha empresa")
	public void selecionar_o_botao_abrir_conta_em_para_minha_empresa() {
	    
	}

	@Given("selecionar o botao abrir conta em pessoa unica")
	public void selecionar_o_botao_abrir_conta_em_pessoa_unica() {
	    
	}

	@When("preencher o formulário de abertura de conta")
	public void preencher_o_formulário_de_abertura_de_conta() {
	   
	}

	@When("clicar no botão enviar")
	public void clicar_no_botão_enviar() {
	    
	}

	
}
