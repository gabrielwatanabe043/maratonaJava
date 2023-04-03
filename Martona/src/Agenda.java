import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Contato> listContato;

	public Agenda() {
		listContato = new ArrayList<Contato>();
	}

	public ArrayList<Contato> getListContato() {
		return listContato;
	}

	public void setListContato(ArrayList<Contato> listContato) {
		this.listContato = listContato;
	}

	public void adicionarContato(Contato contato) {
		listContato.add(contato);
	}

	public void removeContatoForDefault(String nome) {
		for (int i = 0; i < listContato.size(); i++) {
			if (listContato.get(i).getNome().equals(nome)) {
				listContato.remove(i);
			}
		}
	}

	public void removeContatoForEach(String nome) {
		for (Contato list : listContato) {
			if (list.getNome().equals(nome)) {
				listContato.remove(list);
				break;
			}
		}

	}

	public void buscarContato(String nome) {
		for (Contato buscaContato : listContato) {
			if (buscaContato.getNome().contains(nome)) {
				System.out.println(buscaContato.toString());
			}
		}
	}

	public void alterarContato(String nome) {
		Scanner input = new Scanner(System.in);
		for (Contato buscaContato : listContato) {
			if (buscaContato.getNome().equals(nome)) {
				System.out.println("Digite novo nome: ");
				String novoNome = input.nextLine();
				buscaContato.setNome(novoNome);
				System.out.println("Digite novo telefone: ");
				String novoTelefone = input.nextLine();
				buscaContato.setTelefone(novoTelefone);
				System.out.println("Digite novo Email: ");
				String novoEmail = input.nextLine();
				buscaContato.setEmail(novoEmail);

			}

		}
	}

}
