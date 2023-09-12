package laboratorio;

import laboratorio.core.entity.Exame;
import laboratorio.core.entity.Colesterol;
import laboratorio.core.entity.Glicemia;
import laboratorio.core.entity.Triglicerideos;

public class Laboratorio {

    public static void main(String[] args) {

        Colesterol colesterol = new Colesterol();
        colesterol.cadastrarExame();
        colesterol.classificarResultado();

        Triglicerideos triglicerideos = new Triglicerideos();
        triglicerideos.cadastrarExame();
        triglicerideos.classificarResultado();

    }

}
