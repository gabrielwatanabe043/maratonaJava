import java.util.Scanner;

public class mainAgenda {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int resposta;
		System.out.println("1 - Adicionar contato\r\n" + "2 - Remover contato\r\n" + "3 - Buscar contato pelo nome\r\n"
				+ "4 - Alterar contato\r\n" + "5 - Sair\r\n");
		resposta = input.nextInt();

		while (resposta != 5) {

			switch (resposta) {
			case 1: {
				Scanner input2 = new Scanner(System.in);
				Contato contato = new Contato();
				System.out.println("Digite o nome:");
				String info = input2.nextLine();
				contato.setNome(info);
				System.out.println("Digite o telefone:");
				info = input2.nextLine();
				contato.setTelefone(info);
				System.out.println("Digite o email:");
				info = input2.nextLine();
				contato.setEmail(info);
				agenda.adicionarContato(contato);
				break;
				
			}
			case 2: {
				Scanner input2 = new Scanner(System.in);
				System.out.println("Digite nome do contato que deseja remover:");
				String info = input2.nextLine();
				agenda.removeContatoForDefault(info);
				break;
			}
			case 3: {
				Scanner input2 = new Scanner(System.in);
				System.out.println("Digite nome do contato que deseja procurar:");
				String info = input2.nextLine();
				agenda.buscarContato(info);
				break;
			}
			case 4: {
				Scanner input2 = new Scanner(System.in);
				System.out.println("Digite nome do contato que deseja alterar:");
				String info = input2.nextLine();
				agenda.alterarContato(info);
				break;
			}
			case 5: {

				System.out.println("Saindo...");
				break;
			}
			default:
				System.out.println("Resposta não encontrada");
			}
			System.out.println("1 - Adicionar contato\r\n" + "2 - Remover contato\r\n"
					+ "3 - Buscar contato pelo nome\r\n" + "4 - Alterar contato\r\n" + "5 - Sair\r\n");
			resposta = input.nextInt();
		}
	}
}
