package principal;

import controllers.FuncionarioController;

public class Main {

	public static void main(String[] args) {
		
		//criando uma variável de instância para o controlador
		var funcionarioController = new FuncionarioController();
		
		//executando o cadastro do funcionário
		funcionarioController.cadastrarFuncionario();
		
		

	}

}
