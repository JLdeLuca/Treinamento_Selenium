package br.com.maxidica.calculadora;

import static org.junit.Assert.*;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CalcSteps {

	Calc calculadora;
	int num1, num2, somatudo;
	
	@Dado("^que eu escolha somar$")
	public void que_eu_escolha_somar() {
		calculadora = new Calc();
	}

	@Quando("^eu preencho o primeiro número com o valor '(\\d+)'$")
	public void eu_preencho_o_primeiro_número_com_o_valor(int arg1) {
		num1 = arg1;

	}

	@Quando("^eu preencho o segundo número com o valor '(\\d+)'$")
	public void eu_preencho_o_segundo_número_com_o_valor(int arg1) {
		num2 = arg1;
	}

	@Entao("^eu devo ver o resultado como '(\\d+)'$")
	public void eu_devo_ver_o_resultado_como(int arg1) {
		System.out.println(num1);
		System.out.println(num2);
		somatudo = arg1;
		System.out.println(somatudo);
		assertEquals(num1 + num2, somatudo);
		
		
	}

	
	
}
