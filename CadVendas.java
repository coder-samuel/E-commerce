package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Bebidas;
import Entities.Produto;

public class CadVendas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade = 0;
		char opcao = 0;
		char posicao = 0;
		double juros = 0;
		double calculoDesconto = 0;

		List<Bebidas> bebidas = new ArrayList<>();
		List<Bebidas> carrinho = new ArrayList<>();

		bebidas.add(0, new Bebidas("1- Vinho", "Vm-suave", 27.80, " ", 10));
		bebidas.add(1, new Bebidas("2- Vinho", "Vm-seco", 27.00, " ", 10));
		bebidas.add(2, new Bebidas("3- Cachaça", "C-2021", 15.00, " ", 10));
		bebidas.add(3, new Bebidas("4- Coca-cola", "Coca-2l", 10.00, " ", 10));
		bebidas.add(4, new Bebidas("5- Fanta laranja", "F-laranja", 9.80, " ", 10));
		bebidas.add(5, new Bebidas("6- Guarana antartica", "G-ant", 9.80, " ", 10));
		bebidas.add(6, new Bebidas("7- Jack daniels", "J-preta", 130.00, " ", 10));
		bebidas.add(7, new Bebidas("8- Red label", "R-lab", 130.80, " ", 10));
		bebidas.add(8, new Bebidas("9- Blue label", "Blu-lab", 150.80, " ", 10));

		do {
			System.out.println("MENU LOJA G-3 \n 1- Adicionar produto 2- Sair");
			opcao = sc.next().charAt(0);
			if (opcao == '1') {
				System.out.println("Catalogo: ");
				for (Bebidas catalogo : bebidas) {
					System.out.println("Descrição: " + catalogo.getDescricao() + " / Codigo: " + catalogo.getCodigo()
							+ " / Valor unitario: " + catalogo.getValorUnitario() + " / Marca" + catalogo.getMarca()
							+ " / Quantidade: " + catalogo.getQtdeEstoque());
				}

				System.out.println("Deseja realizar compra?  1- para sim 2- para não");
				char iniciar = sc.next().charAt(0);
				if (iniciar == '1') {
					System.out.println("Digite a posição de 1 a 10: ");
					posicao = sc.next().charAt(0);

					if (posicao == '1') {
						System.out.println(bebidas.get(0).getDescricao() + " " + bebidas.get(0).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();
							bebidas.get(0).tirarEstoque(quantidade);
							carrinho.add(new Bebidas("Vinho", "Vm-suave", 27.80, " ", quantidade));

							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
							calculoDesconto = (carrinho.get(0).getValorUnitario() * quantidade) * 10.0 / 100
									- carrinho.get(0).getValorUnitario();
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho " + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}

					} else if (posicao == '2') {
						System.out.println(bebidas.get(1).getDescricao() + " " + bebidas.get(1).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(1).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("2- Vinho", "Vm-seco", 27.00, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}
					} else if (posicao == '3') {
						System.out.println(bebidas.get(2).getDescricao() + " " + bebidas.get(2).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(2).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("Cachaça", "C-2021", 15.00, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}
					} else if (posicao == '4') {
						System.out.println(bebidas.get(3).getDescricao() + " " + bebidas.get(3).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(3).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("Coca-cola", "Coca-2l", 10.00, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}
					} else if (posicao == '5') {
						System.out.println(bebidas.get(4).getDescricao() + " " + bebidas.get(4).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(4).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("Fanta laranja", "F-laranja", 9.80, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}
					} else if (posicao == '6') {
						System.out.println(bebidas.get(5).getDescricao() + " " + bebidas.get(5).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(5).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("Guaraná Antártica", "G-ant", 9.80, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}
					} else if (posicao == '7') {
						System.out.println(bebidas.get(6).getDescricao() + " " + bebidas.get(6).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(6).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("Jack daniels", "J-preta", 130.00, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}
					} else if (posicao == '8') {
						System.out.println(bebidas.get(7).getDescricao() + " " + bebidas.get(7).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(7).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("Red label", "R-lab", 130.80, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));
						}
					} else if (posicao == '9') {
						System.out.println(bebidas.get(8).getDescricao() + " " + bebidas.get(8).getValorUnitario());
						System.out.println("Deseja adicionar ao carrinho? 1- para sim 2- para não");
						char carrinho1 = sc.next().charAt(0);
						if (carrinho1 == '1') {
							System.out.println("Quantidade: ");
							quantidade = sc.nextInt();

							bebidas.get(8).tirarEstoque(quantidade);

							carrinho.add(new Bebidas("Blue label", "Blu-lab", 150.80, " ", 10));
							juros = ((carrinho.get(0).getValorUnitario() * quantidade) * 9.0) / 100;
						}
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade));

						}

					}

					System.out.println("1- Pagar a vista 2- Debito 3- Credito");
					char pagamento = sc.next().charAt(0);
					if (pagamento == '1') {
						System.out.println("NOTA FISCAL");
						for (Bebidas c : carrinho) {
							System.out.println("Carrinho \n" + c.getDescricao() + " " + c.getValorUnitario() + "R$ "
									+ "\nQuantidade: " + c.getQtdeEstoque() + "\nValor total: "
									+ c.qtdeCarrinho(quantidade) + "\nJuros: " + juros + "\n\nDesconto"
									+ calculoDesconto);

						}
					}
					if (pagamento == '2') {

					}
				}

				System.out.println("Fim de programa ");
			}
		} while (opcao != '2');
	}
}