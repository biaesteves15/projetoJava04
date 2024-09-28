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
	 * Método para capturar os dados do funcionário 
	 * e exportar para um determinado arquivo
	 */

	public void cadastrarFuncionario() {
		
		//capturando os dados do funcionário
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
	 * Criando método para fazer a captura dos dados do funcionário
	 */
	private Funcionario obterDadosFuncionario() {
		
		var funcionario = new Funcionario();
		
		funcionario.setId(UUID.randomUUID());
		funcionario.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário:"));
		funcionario.setCpf(JOptionPane.showInputDialog("Informe o CPF do funcionário:"));
		funcionario.setNome(JOptionPane.showInputDialog("Informe a matrícula do funcionário:"));
		
		return funcionario;
				
	}
	
	private Endereco obterDadosEndereco() {
		
		var endereco = new Endereco();
		
		endereco.setId(UUID.randomUUID());
		endereco.setLogradouro(JOptionPane.showInputDialog("Informe o logradouro do endereço:"));
		endereco.setNumero(JOptionPane.showInputDialog("Informe o número do endereço:"));
		endereco.setComplemento(JOptionPane.showInputDialog("Informe o complemento do endereço:"));
		endereco.setBairro(JOptionPane.showInputDialog("Informe o bairro do endereço:"));
		endereco.setCidade(JOptionPane.showInputDialog("Informe a cidadedo endereço:"));
		endereco.setEstado(JOptionPane.showInputDialog("Informe o estado do endereço:"));
		endereco.setCep(JOptionPane.showInputDialog("Informe o CEP do endereço:"));
		
		return endereco;
	}
}
