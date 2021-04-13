package Entities;

import java.util.Scanner;


public class Bebidas extends Produto{
	private static String marca;
	private int qtdeEstoque;
	
	
	Scanner sc = new Scanner (System.in);

	public Bebidas(String descricao, String codigo, double valorUnitario, String marca, int qtdeEstoque) {
		super(descricao, codigo, valorUnitario);
		this.marca = marca;
		this.qtdeEstoque = qtdeEstoque;
	}


	public int getQtdeEstoque() {
		return qtdeEstoque;
	}


	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	public static String getMarca() {
		return marca;
	}


	public static void setMarca(String marca) {
		Bebidas.marca = marca;
	}


	public void incluirEstoque(int valorSerIncluido) { 
		incluirEstoque(valorSerIncluido);
			
		}
		//metodos
	
	public void tirarEstoque(int valorSerExcluido) {
		if (getQtdeEstoque() >= valorSerExcluido) {
			super.tirarEstoque(valorSerExcluido);
			}	
			else {
			System.out.println("Estoque indisponivel!");
			}
		
	}


	public String qtdeCarrinho(int quantidade) {
		
		return null;
	}
	
	
}

		/*
		public String tipoBebida() {
			String saida ="";
			if(this.tipo == '1') {
				saida = "Vinho";
				
			} else if(this.tipo == '2') {
				saida = "Cerveja";
		} else if (this.tipo == '3') {
			saida = "Água de Coco";
					
		} return saida;
		}
		
		@Override
		public void incluirEstoque(int valorSerIncluido) { // quantidade de estoque + valor a ser inserido
			super.incluirEstoque(valorSerIncluido);
				
			}
			//metodos
		@Override
		public void tirarEstoque(int valorSerExcluido) {
				if (super.getQtdeEstoque() >= valorSerExcluido) {
				super.tirarEstoque(valorSerExcluido);
				}	
				else {
					System.out.println("Estoque indisponivel!");
				}
			}
		

		
			
			public void cadastroEmEstoque () {
				System.out.println("Quantos itens serão adicionado? ");
				int qtdeIntens = leia.nextInt();
				
				for (int x=1; x<= qtdeIntens; x++) {
					System.out.println("Item " + x);
					
					System.out.println("Digite discrição do produto " + x + ": ");
					String descricao = leia.next();
					System.out.println("Digite o codigo do produto " + x + ": " );
					String codigo = leia.next();
					System.out.println("Digite valor unitario do produto "+ x+ ": ");
					double valorUnitario = leia.nextDouble();
					System.out.println("Digite a quantidade do produto "+ x + ": ");
					int qtdeDeProdutos = leia.nextInt();
					
					bebida.add(new Bebidas(descricao,codigo,valorUnitario,qtdeDeProdutos));
					}
			}
			
			@SuppressWarnings("unlikely-arg-type")
			public void vendaDeItens () {
				
				System.out.println("Digite discrição do produto: ");
				String descricao = leia.next();
				if (bebidas.contains(descricao)) {
					System.out.println("Quantidade a ser retirada dos estoque: ");
					int qtdeSerRetirada = leia.nextInt();
					super.tirarEstoque(qtdeSerRetirada);
					
				}else {
					System.out.println("Não temos itens em estoque!");
				}
				
				
				
				
			}
			public void mostrarEstoque () {
				for (Bebidas produto: bebidas) 
				{
					
					System.out.println("ESTOQUE:\n");
					System.out.println("Descrição: " + produto.getDescricao() + "\nValor: " + produto.getValorUnitario() + "\nQuantidade em estoque: " + produto.getQtdeEstoque());
				
				System.out.println("\n");
				}
			}
		
		
		
		
	}*/


