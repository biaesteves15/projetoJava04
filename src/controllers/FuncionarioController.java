package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Endereco;
import entities.Funcionario;
import interfaces.FuncionarioRepository;
import repositories.FuncionarioRepositoryTxt;
import repositories.FuncionarioRepositoryXml;

public class FuncionarioController {
	
	/*
	 * M�todo para capturar os dados do funcion�rio 
	 * e exportar para um determinado arquivo
	 */

	public void cadastrarFuncionario() {
		
		//capturando os dados do funcion�rio
		var funcionario = obterDadosFuncionario();
		funcionario.setEndereco(obterDadosEndereco());
		
		FuncionarioRepository funcionarioRepository = null;
		
		var tipo = JOptionPane.showInputDialog("Escolha (1)TXT ou (2)XML: ");
		
		switch(tipo) {
		case "1":
			funcionarioRepository = new FuncionarioRepositoryTxt();
			break;
		case "2":
			funcionarioRepository = new FuncionarioRepositoryXml();
			break;
		}
		
		funcionarioRepository.exportarDados(funcionario);
	}
	
	/*
	 * Criando m�todo para fazer a captura dos dados do funcion�rio
	 */
	private Funcionario obterDadosFuncionario() {
		
		var funcionario = new Funcionario();
		
		funcionario.setId(UUID.randomUUID());
		funcionario.setNome(JOptionPane.showInputDialog("Informe o nome do funcion�rio:"));
		funcionario.setCpf(JOptionPane.showInputDialog("Informe o CPF do funcion�rio:"));
		funcionario.setNome(JOptionPane.showInputDialog("Informe a matr�cula do funcion�rio:"));
		
		return funcionario;
				
	}
	
	private Endereco obterDadosEndereco() {
		
		var endereco = new Endereco();
		
		endereco.setId(UUID.randomUUID());
		endereco.setLogradouro(JOptionPane.showInputDialog("Informe o logradouro do endere�o:"));
		endereco.setNumero(JOptionPane.showInputDialog("Informe o n�mero do endere�o:"));
		endereco.setComplemento(JOptionPane.showInputDialog("Informe o complemento do endere�o:"));
		endereco.setBairro(JOptionPane.showInputDialog("Informe o bairro do endere�o:"));
		endereco.setCidade(JOptionPane.showInputDialog("Informe a cidadedo endere�o:"));
		endereco.setEstado(JOptionPane.showInputDialog("Informe o estado do endere�o:"));
		endereco.setCep(JOptionPane.showInputDialog("Informe o CEP do endere�o:"));
		
		return endereco;
	}
}
