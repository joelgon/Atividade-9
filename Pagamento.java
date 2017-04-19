/*
	Exercicio de Implementação orientada a Objetos
	Função: Calcular o valor a ser pago a um vendedor
	Desenvolvedor: Joel Gonçãlves

*/
import java.io.*;

public class Pagamento{

	public static void main(String[] args){
		Vendedor vend;
		vend = new Vendedor(135, "Joel", 15000);
		vend.calcularValorPagamento();
		vend.calcularImpostoDeRenda();
		vend.imprimir();
	}
}
