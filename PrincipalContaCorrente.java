package exercicios;

import javax.swing.JOptionPane;

public class PrincipalContaCorrente {

	public static void main(String[] args) {
		
		PrincipalContaCorrente acao= new PrincipalContaCorrente();	
		int num;
		do{
		num=Integer.parseInt(JOptionPane.showInputDialog("Escolha entre "
				+ "Cadastrar"
				+ "Sacar"
				+ "Depositar"
				+ "Consultar"));
		switch(num) {
		case 1: acao.execSaque();break;
		case 2: acao.execDeposito();break;
		case 3: acao.execConsulta();break;
		case 4: acao.execCadastrar();break;
		case 9: System.exit(0);
		default : JOptionPane.showMessageDialog(null,"Opcao invalida"); break;
		}
		}while(num!=9);
	}
	ContaCorrente valor= new ContaCorrente();
	void execSaque() {
		Double val;
		val=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		
		if(valor.sacar(val)==0) {
			JOptionPane.showMessageDialog(null,"Saque Realizado");
		}else
			JOptionPane.showMessageDialog(null,"Saque nao permitido");
		
	}
	void execDeposito() {
		Double val;
		val=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
		valor.depositar(val);
	}
	void execConsulta(){
		valor.imprimir();
	}
	void execCadastrar() {
		valor.conta=Integer.parseInt(JOptionPane.showInputDialog("Informe a conta"));
		valor.agencia=Integer.parseInt(JOptionPane.showInputDialog("Informe a agencia"));
		valor.saldo=Integer.parseInt(JOptionPane.showInputDialog("Informe o saldo"));
		valor.nome=JOptionPane.showInputDialog("Informe o nome");
		
	}

}
