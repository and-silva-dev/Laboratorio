package laboratorio.core.entity;

import java.util.Scanner;

public class Glicemia extends Exame {

    int quantidadeGlicose;

    Scanner teclado = new Scanner(System.in);

    @Override
    public void cadastrarExame() {
        System.out.println("Informe o nome do paciente : ");
        nomePaciente = teclado.nextLine();
        System.out.println("Informe o tipo sanguíneo do paciente: ");
        tipoSanguineo = teclado.nextLine();
        System.out.println("Informe a quantidade de glicose: ");
        quantidadeGlicose = teclado.nextInt();
    }

    @Override
    public void classificarResultado() {

    }

    @Override
    public void mostrarResultado() {

    }

}
