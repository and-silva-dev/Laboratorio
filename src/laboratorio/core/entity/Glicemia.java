package laboratorio.core.entity;

import java.util.Scanner;

public class Glicemia extends Exame {

    int quantidadeGlicose;

    Scanner teclado = new Scanner(System.in);

    @Override
    public void cadastrarExame() {
        System.out.println("-----------Glicemia-----------");
        System.out.println("Informe o nome do paciente : ");
        nomePaciente = teclado.nextLine();
        System.out.println("Informe o sexo do paciente H/M" );
        sexo = teclado.nextLine();
        System.out.println("Informe o ano de nascimento do paciente(dd/MM/yyyy): ");
        String id = teclado.nextLine();
        calcularIdade(id);
        System.out.println("Informe o tipo sanguíneo do paciente: ");
        tipoSanguineo = teclado.nextLine();
        System.out.println("Informe o valor da glicose: ");
        quantidadeGlicose = teclado.nextInt();
    }

    @Override
    public void classificarResultado() {
        if (quantidadeGlicose < 100) {
            System.out.println("Normoglicemia");
        } else if ((quantidadeGlicose >= 100) && (quantidadeGlicose < 126)) {
            System.out.println("Pré-diabetes");
        } else {
            System.out.println("Diabetes estabelecido");
        }

    }

    @Override
    public void mostrarResultado() {

    }

}
