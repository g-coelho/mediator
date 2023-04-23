import org.example.CPU;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CPUTest {

    @Test
    public void deveEnviarImagem(){

        CPU cpu = new CPU();
        assertEquals("Comunicação estabelecida o monitor está exibindo a sua imagem. Exibindo imagem: Juriti Pupu.", cpu.enviarImagem("Juriti Pupu."));

    }

    @Test
    public void deveenviarImagemTonsCinza(){
        CPU cpu = new CPU();
        assertEquals("Comunicação estabelecida o monitor está exibindo a sua imagem. Exibindo imagem em tons de cinza: Juriti Pupu.", cpu.enviarImagemTonsCinza("Juriti Pupu."));
    }

    @Test
    public void deveenviarImagemCoresInvertidas(){
        CPU cpu = new CPU();
        assertEquals("Comunicação estabelecida o monitor está exibindo a sua imagem. Exibindo imagem com cores inveritdas: Juriti Pupu.", cpu.enviarImagemCorInvertida("Juriti Pupu."));


    }


}
