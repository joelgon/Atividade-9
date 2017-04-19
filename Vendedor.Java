/*
	Exercicio de Implementação orientada a Objetos
	Função: Calcular o valor a ser pago a um vendedor
	Desenvolvedor: Joel Gonçãlves

*/
import java.io.*;

public class Vendedor{

	private int codigo;
	private String nome;
	private double valorvendido;
	private double taxacomisao;
	private double valorpagamento;

	//construtor

	public Vendedor(int codigo, String nome, double valorvendido){
		this.codigo = codigo;
		this.nome = nome;
		this.valorvendido = valorvendido;
	}

	//metodos de acesso

	public void setCodifo(int codigo){
		this.codigo = codigo;
	}

	public void setNome( String nome){
		this.nome = nome;
	}

	public void setValorvendido(double valorvendido){
		this.valorvendido = valorvendido;
	}

	public void setTaxacomissao(double taxacomisao){
		this.taxacomisao = taxacomisao;
	}

	public int getCodigo(){
		return codigo;
	}

	public String getNome(){
		return nome;
	}

	public double getValorvendido(){
		return valorvendido;
	}

	public double getTaxacomissao(){
		return taxacomisao;
	}

	public double getValorpagamento(){
		return valorpagamento;
	}

	public void calcularValorPagamento(){
		if(valorvendido <= 5000){
			valorpagamento = valorvendido * 0.10;
		}
		else{
			valorpagamento = valorvendido * 0.12;
		}		
	}

	public void calcularImpostoDeRenda(){
		if(valorpagamento > 1058 && valorpagamento <= 2100){
			valorpagamento = valorpagamento - (valorpagamento * 0.15);
		}
		else{
			if(valorpagamento > 2100){
				valorpagamento = valorpagamento - (valorpagamento * 0.275);
			}
		}
	}

	public void imprimir(){
		System.out.println("O total vendido foi: " + valorvendido);
		System.out.println("O valor do Pagamento e:" + valorpagamento);
	}
}
