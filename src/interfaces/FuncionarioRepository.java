package interfaces;

import entities.Funcionario;

public interface FuncionarioRepository {
	
	/*
	 * #M�todo abstrato: Consiste de um m�todo que n�o possui corpo.
	 * #S�o m�todos que tem apenas assinatura.
	 * #Quando uma classe HERDAR a interface, a classe dever� fornecer corpo
	 * (IMPLEMENTAR) todos os m�todos abstratos da interface
	 */
	void exportarDados(Funcionario funcionario);
}
