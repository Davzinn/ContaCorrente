package exercicios;

import javax.swing.JOptionPane;

public class ContaCorrente {
int conta;
int agencia;
double saldo;
String nome;

 void imprimir() {
	 JOptionPane.showMessageDialog(null,"Numero da conta:"+conta+"\nNumero da Agencia:"+ agencia+"\nSaldo"+saldo+"\nNome:"+nome);
}
 
double sacar(double valor ) {
	int a=1;
	if( saldo>valor) {
		saldo-=valor;
		a=0;
	}
	return a;

}

void depositar (double valor) {
	saldo+=valor;
}


}
