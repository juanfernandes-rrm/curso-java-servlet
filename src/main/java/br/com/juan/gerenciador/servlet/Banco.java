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
		empresa.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		Banco.lista.add(empresa);
	}

	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
