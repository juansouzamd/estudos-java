package estrutura_de_dados.arrays;

public class Main {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        try{
            vetor.adicionar("Juan");
            vetor.adicionar("Maria");
        } catch (Exception e){
            e.printStackTrace();
        }




//        for (int i = 0; i < 5; i++) {
//            System.out.println(vetor[i]);
//        }
//
//        for(String arr: vetor){
//            System.out.println(arr);
//        }
    }
}
