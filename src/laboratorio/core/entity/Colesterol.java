/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.core.entity;

import java.util.Scanner;

public class Colesterol extends Exame {

    Scanner teclado = new Scanner(System.in);
    int colesterolTotal;
    int ldl;
    int hdl;

    @Override
    public void cadastrarExame() {
        System.out.println("Informe o nome do paciente : ");
        nomePaciente = teclado.nextLine();
        System.out.println("Informe o ano de nascimento do paciente(dd/MM/yyyy): ");
        String id = teclado.nextLine();
        calcularIdade(id);
        System.out.println("Informe o tipo sanguíneo do paciente: ");
        tipoSanguineo = teclado.nextLine();
        System.out.println("Informe o valor do colesterol Total: ");
        colesterolTotal = teclado.nextInt();
        System.out.println("Informe o valor do colesterol LDL: ");
        ldl = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Informe o valor do colesterol HDL: ");
        hdl = teclado.nextInt();

    }

    @Override
    public void classificarResultado() {

    }

    @Override
    public void mostrarResultado() {
        System.out.println("Idade do paciente : " + idade);
    }

}
