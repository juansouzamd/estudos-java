package Senac.poo.exercicio02;

public class ControleRemoto {

    public void aumentarVolume(Televisao televisao){
        televisao.setVolume(televisao.getVolume() + 1);
    }

    public void dimunuirVolume(Televisao televisao){
        televisao.setVolume(televisao.getVolume() - 1);
    }

    public void aumentarCanal(Televisao televisao){
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public void diminuirCanal(Televisao televisao){
        televisao.setCanal(televisao.getCanal() - 1);
    }

    public void mudarCanal(Televisao televisao, int canal){
        televisao.setCanal(canal);
    }
}
