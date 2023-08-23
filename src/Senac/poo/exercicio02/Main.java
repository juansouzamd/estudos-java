package Senac.poo.exercicio02;

public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao(20, 45);
        ControleRemoto controleRemoto = new ControleRemoto();

        System.out.println("Canal: " +televisao.getCanal() + ", Volume: " + televisao.getVolume());

        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);

        controleRemoto.aumentarVolume(televisao);

        System.out.println("Canal: " +televisao.getCanal() + ", Volume: " + televisao.getVolume());

        controleRemoto.aumentarVolume(televisao);

        controleRemoto.mudarCanal(televisao,80);

        System.out.println("Canal: " +televisao.getCanal() + ", Volume: " + televisao.getVolume());
    }
}
