package task.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidado() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;

    for(Convidado arr :  convidadosSet){
        if(arr.getCodigoConvidado() == codigoConvite){
            convidadoParaRemover = arr;
            break;
        }
    }

    convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return  convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }
}
