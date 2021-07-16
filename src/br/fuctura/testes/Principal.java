package br.fuctura.testes;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.fuctura.model.Cliente;
import br.fuctura.model.Contato;
import br.fuctura.model.Endereco;
import br.fuctura.util.JPAUtil;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String dado;
		Long dadoLong;
		int opcao = 10;

		System.out.println("Bem vindo ao Projeto Java Módulo 2 - JPA");
		System.out.println("\n:: AGENDA DE CLIENTES ::\n");

		do {
			opcao = 10;

			System.out.println(
					"Digite a opção desejada:" + "\n1 - Cadastrar cliente" + "\n2 - Cadastrar contato do cliente"
							+ "\n3 - Cadastrar endereço do cliente" + "\n4 - Atualizar cliente" + "\n5 - Apagar cliente"
							+ "\n6 - Localizar cliente" + "\n7 - Listar todos os clientes" + "\n0 - Sair\n");
			System.out.print("Opção: ");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				EntityManager entityManager = JPAUtil.getEntityManager();
				EntityTransaction tx = entityManager.getTransaction();
				tx.begin();

				Cliente cliente = new Cliente();
				System.out.println("\nCADASTRAR CLIENTE\n");

				System.out.print("Nome: ");
				dado = ler.nextLine();
				dado = ler.nextLine();
				cliente.setNome(dado);

				System.out.print("CPF: ");
				dado = ler.nextLine();
				cliente.setCpf(dado);

				System.out.print("Gênero: ");
				dado = ler.nextLine();
				cliente.setGenero(dado);

				System.out.print("Ano de nascimento: ");
				dado = ler.nextLine();
				cliente.setAnoNasc(dado);

				System.out.println("\nCliente cadastrado com sucesso!\n");
				System.out.println("Pressione alguma tecla para continuar...\n");
				ler.nextLine();

				entityManager.persist(cliente);
				tx.commit();
				break;

			case 2:
				EntityManager entityManager2 = JPAUtil.getEntityManager();
				EntityTransaction tx2 = entityManager2.getTransaction();

				tx2.begin();
				Contato contato2 = new Contato();

				System.out.println("\nCADASTRAR CONTATO\n");
				System.out.print("ID do cliente: ");
				dadoLong = ler.nextLong();
				contato2.setIdCliente(dadoLong);

				System.out.print("E-mail: ");
				dado = ler.nextLine();
				dado = ler.nextLine();
				contato2.setEmail(dado);

				System.out.print("DDD: ");
				dado = ler.nextLine();
				contato2.setDdd(dado);

				System.out.print("Telefone: ");
				dado = ler.nextLine();
				contato2.setTelefone(dado);

				entityManager2.persist(contato2);
				tx2.commit();

				System.out.println("\nContato cadastrado com sucesso!\n");
				System.out.println("Pressione alguma tecla para continuar...\n");
				ler.nextLine();
				break;

			case 3:
				EntityManager entityManager3 = JPAUtil.getEntityManager();
				EntityTransaction tx3 = entityManager3.getTransaction();

				tx3.begin();

				Endereco endereco3 = new Endereco();

				System.out.println("\nCADASTRAR CONTATO\n");
				System.out.print("ID do cliente: ");
				dadoLong = ler.nextLong();
				endereco3.setIdCliente(dadoLong);

				System.out.print("CEP: ");
				dado = ler.nextLine();
				dado = ler.nextLine();
				endereco3.setCep(dado);

				System.out.print("Rua: ");
				dado = ler.nextLine();
				endereco3.setRua(dado);

				System.out.print("Número: ");
				dado = ler.nextLine();
				endereco3.setNumero(dado);

				System.out.print("Complemento: ");
				dado = ler.nextLine();
				endereco3.setComplemento(dado);

				System.out.print("Bairro: ");
				dado = ler.nextLine();
				endereco3.setBairro(dado);

				System.out.print("Cidade: ");
				dado = ler.nextLine();
				endereco3.setCidade(dado);

				System.out.print("Estado (UF): ");
				dado = ler.nextLine();
				endereco3.setEstado(dado);

				entityManager3.persist(endereco3);
				tx3.commit();

				System.out.println("\nEndereço cadastrado com sucesso!\n");
				System.out.println("Pressione alguma tecla para continuar...\n");
				ler.nextLine();
				break;

			case 4:
				EntityManager entityManager4 = JPAUtil.getEntityManager();
				EntityTransaction tx4 = entityManager4.getTransaction();

				tx4.begin();

				Cliente cliente4 = new Cliente();
				Contato contato4 = new Contato();
				Endereco endereco4 = new Endereco();

				System.out.println("\nATUALIZAR DADOS DO CLIENTE\n");
				System.out.print("Digite o ID do cliente: ");
				dadoLong = ler.nextLong();
				cliente4.setId(dadoLong);
				contato4.setIdCliente(dadoLong);
				endereco4.setIdCliente(dadoLong);			
				
				System.out.print("Nome: ");
				dado = ler.nextLine();
				dado = ler.nextLine();
				cliente4.setNome(dado);

				System.out.print("CPF: ");
				dado = ler.nextLine();
				cliente4.setCpf(dado);

				System.out.print("Gênero: ");
				dado = ler.nextLine();
				cliente4.setGenero(dado);

				System.out.print("Ano de nascimento: ");
				dado = ler.nextLine();
				cliente4.setAnoNasc(dado);

				System.out.print("E-mail: ");
				dado = ler.nextLine();
				contato4.setEmail(dado);

				System.out.print("DDD: ");
				dado = ler.nextLine();
				contato4.setDdd(dado);

				System.out.print("Telefone: ");
				dado = ler.nextLine();
				contato4.setTelefone(dado);

				System.out.print("CEP: ");
				dado = ler.nextLine();
				endereco4.setCep(dado);

				System.out.print("Rua: ");
				dado = ler.nextLine();
				endereco4.setRua(dado);

				System.out.print("Número: ");
				dado = ler.nextLine();
				endereco4.setNumero(dado);

				System.out.print("Complemento: ");
				dado = ler.nextLine();
				endereco4.setComplemento(dado);

				System.out.print("Bairro: ");
				dado = ler.nextLine();
				endereco4.setBairro(dado);

				System.out.print("Cidade: ");
				dado = ler.nextLine();
				endereco4.setCidade(dado);

				System.out.print("Estado (UF): ");
				dado = ler.nextLine();
				endereco4.setEstado(dado);

				entityManager4.merge(cliente4);
				entityManager4.merge(contato4);
				entityManager4.merge(endereco4);
				tx4.commit();

				System.out.println("\nDados do cliente foram atualizados com sucesso!\n");
				System.out.println("Pressione alguma tecla para continuar...\n");
				ler.nextLine();
				break;

			case 5:
				EntityManager entityManager5 = JPAUtil.getEntityManager();
				EntityTransaction tx5 = entityManager5.getTransaction();
				tx5.begin();

				System.out.println("\nAPAGAR CADASTRO DO CLIENTE\n");
				System.out.print("Digite o ID do cliente: ");
				dadoLong = ler.nextLong();

				Cliente cliente5 = entityManager5.find(Cliente.class, dadoLong);
				entityManager5.remove(cliente5);
				tx5.commit();

				System.out.println("\nContato apagado com sucesso!\n");
				System.out.println("Pressione alguma tecla para continuar...\n");
				ler.nextLine();
				ler.nextLine();
				break;

			case 6:
				EntityManager entityManager6 = JPAUtil.getEntityManager();
				EntityTransaction tx6 = entityManager6.getTransaction();
				tx6.begin();
				System.out.println("LOCALIZAR CLIENTE POR ID");
				System.out.print("Digite o ID do cliente: ");
				dado = ler.next();
				System.out.println("");

				Query query = entityManager6.createQuery("from Cliente c where c.id = " + dado);
				List<Cliente> clientes = query.getResultList();

				for (Cliente cliente6 : clientes) {
					System.out.println(cliente6);
				}

				Query query2 = entityManager6.createQuery("from Contato c where c.idCliente = " + dado);
				List<Contato> contatos = query2.getResultList();

				for (Contato contato6 : contatos) {
					System.out.println(contato6);
				}

				Query query3 = entityManager6.createQuery("from Endereco e where e.idCliente = " + dado);
				List<Endereco> enderecos = query3.getResultList();

				for (Endereco endereco6 : enderecos) {
					System.out.println(endereco6);
				}

				System.out.println("\nPressione alguma tecla para continuar...\n");
				ler.nextLine();
				ler.nextLine();
				break;

			case 7:
				EntityManager entityManager7 = JPAUtil.getEntityManager();
				EntityTransaction tx7 = entityManager7.getTransaction();
				tx7.begin();
				System.out.println("\nLISTA DE CLIENTES CADASTRADOS:\n");
				Query query4 = entityManager7.createQuery("from Cliente c");
				List<Cliente> clientes2 = query4.getResultList();

				for (Cliente cliente7 : clientes2) {
					System.out.println("_____________________________");
					System.out.println(cliente7);
					System.out.println("_____________________________");
				}

				entityManager7.close();
				System.out.println("\nPressione alguma tecla para continuar...\n");
				ler.nextLine();
				ler.nextLine();
				break;

			case 0:
				System.out.println("Até mais!");
				ler.close();
				break;

			default:
				System.out.println("Você digitou um número inválido");
				break;

			}
		} while (opcao != 0);

	}
}
