package task.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato arr: contatoSet){
            // Todo contato com o nome inicial igual sera colocado na lista
            if(arr.getNome().startsWith(nome)){
                contatosPorNome.add(arr);
            }
        }

        return  contatosPorNome;
    }

    public Contato atualizarNomeContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato arr: contatoSet){
            if(arr.getNome().equalsIgnoreCase(nome)){
                arr.setNumero(novoNumero);
                contatoAtualizado = arr;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        System.out.println();

        agendaContatos.adicionarContato("Juan", 12345);
        agendaContatos.adicionarContato("Juan Souza", 124);
        agendaContatos.adicionarContato("Juan Tavares", 234);
        agendaContatos.adicionarContato("Juan", 80808);
        agendaContatos.adicionarContato("Pedro Souza", 1234567);
        agendaContatos.adicionarContato("Juan Santos", 124);

        agendaContatos.exibirContatos();

        System.out.println();

        System.out.println(agendaContatos.pesquisarPorNome("Juan"));

        System.out.println();

        System.out.println(agendaContatos.atualizarNomeContato("Juan Tavares", 909090909));

        agendaContatos.exibirContatos();

    }
}
