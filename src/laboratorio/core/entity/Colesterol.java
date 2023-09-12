package laboratorio.core.entity;

import java.util.Scanner;

public class Colesterol extends Exame {

    Scanner teclado = new Scanner(System.in);

// Atributos
    private int colesterolTotal;
    private int ldl;
    private int hdl;

//Metodos sobrescritos classe Exame
    @Override
    public void cadastrarExame() {
        System.out.println("-----------Colesterol-----------");
        System.out.println("Informe o nome do paciente : ");
        nomePaciente = teclado.nextLine();
        System.out.println("Informe o sexo do paciente H/M");
        sexo = teclado.nextLine();
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
        if (colesterolTotal < 200) {
            System.out.println("Colesterol Total: Bom");
        } else if (colesterolTotal >= 200 && colesterolTotal <= 239) {
            System.out.println("Colesterol Total: Limite elevado");
        } else {
            System.out.println("Colesterol Total: Elevado");
        }
        if (ldl < 100) {
            System.out.println("LDL : Bom");
        } else if (ldl >= 100 && ldl <= 129) {
            System.out.println("LDL: Limite Elevado");
        } else if (ldl >= 130 && ldl <= 159) {
            System.out.println("LDL : Elevado");
        } else {
            System.out.println("LDL : Muito Elevado");
        }
        if ("h".equals(sexo) || "H".equals(sexo)) {
            if (hdl < 40) {
                System.out.println("HDL: Baixo");
            } else if (hdl >= 40 && hdl <= 50) {
                System.out.println("HDL: Bom");
            } else {
                // Adicione mais condições se necessário.
            }
        } else if ("m".equals(sexo) || "M".equals(sexo)) {
            // Lógica de classificação do HDL para sexo feminino.
            if (hdl < 50) {
                System.out.println("HDL: Baixo");
            } else if (hdl >= 50 && hdl <= 60) {
                System.out.println("HDL: Bom");
            }

        } else {
            System.out.println("Preencha com a letra correta");
        }

    }

    @Override
    public void mostrarResultado() {

    }

}
