package principal;

import controllers.FuncionarioController;

public class Main {

	public static void main(String[] args) {
		
		//criando uma vari�vel de inst�ncia para o controlador
		var funcionarioController = new FuncionarioController();
		
		//executando o cadastro do funcion�rio
		funcionarioController.cadastrarFuncionario();
		
		

	}

}
