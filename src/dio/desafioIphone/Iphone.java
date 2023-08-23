package dio.desafioIphone;

public class Iphone implements AparelhoTelefonico {

    // aparelho telefonico
    public void ligar(){
        System.out.println("Ligando");
    }

    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void IniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }

    // navegador

    public void exibirPagina(){
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }

    // reprodutor musical

    public void tocar(){
        System.out.println("Tocando música");
    }

    public  void pausar(){
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Tocando: " + musica);
    }

}
