package org.example;

public class Monitor implements DispositivoSaida{
    private static Monitor instancia = new Monitor();
    private Monitor(){};

    public static Monitor getInstancia(){
        return instancia;
    }


    @Override
    public String exibirImagem(String imagem) {
        return "Exibindo imagem: " + imagem;
    }

    @Override
    public String exibirImagemTonsCinza(String imagem) {
        return "Exibindo imagem em tons de cinza: " + imagem;
    }

    @Override
    public String exibirImagemCorInvertida(String imagem) {
        return "Exibindo imagem com cores inveritdas: " + imagem;
    }
}
