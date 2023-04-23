package org.example;

public class GPU {
    private static GPU instancia = new GPU();
    private GPU(){}

    public static GPU getInstancia(){
        return instancia;
    }

    public String exibirImagem(String imagem){
        return "Comunicação estabelecida " + "o monitor está exibindo a sua imagem. " +
         Monitor.getInstancia().exibirImagem(imagem);
    }

    public String exibirImagemTonsCinza(String imagem){
        return "Comunicação estabelecida " + "o monitor está exibindo a sua imagem. " +
                Monitor.getInstancia().exibirImagemTonsCinza(imagem);
    }


    public String exibirImagemCorInvertida(String imagem){
        return "Comunicação estabelecida " + "o monitor está exibindo a sua imagem. " +
                Monitor.getInstancia().exibirImagemCorInvertida(imagem);
    }

}
