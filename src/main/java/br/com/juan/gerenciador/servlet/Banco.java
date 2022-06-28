package br.com.juan.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	//bloco estático, executa quando inicia a classe
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		Empresa empresa3 = new Empresa();
		empresa3.setNome("Teste");
		lista.add(empresa);
		lista.add(empresa2);
		lista.add(empresa3);
	}
	
	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		Banco.lista.add(empresa);
	}

	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
