package org.example;

public class CPU {
    public String enviarImagem(String imagem) {
        return GPU.getInstancia().exibirImagem(imagem);
    }

    public String enviarImagemTonsCinza(String imagem) {
        return GPU.getInstancia().exibirImagemTonsCinza(imagem);
    }

    public String enviarImagemCorInvertida(String imagem) {
        return GPU.getInstancia().exibirImagemCorInvertida(imagem);
    }
}
