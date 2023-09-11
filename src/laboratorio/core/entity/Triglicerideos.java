package laboratorio.core.entity;

import java.util.Scanner;

public class Triglicerideos extends Exame {

    Scanner teclado = new Scanner(System.in);
    int triglicerideos;

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
        System.out.println("Informe o valor do Triglicerideos : ");
        triglicerideos = teclado.nextInt();

    }

    @Override
    public void classificarResultado() {
      if (triglicerideos < 150 ) {
          System.out.println("Triglicerídeos: Normal");
      }  else if( triglicerideos >=150 && triglicerideos <=199){
          System.out.println("Triglicerídeos: Limite Elevado");
      }else if (triglicerideos >=200 && triglicerideos <=499 ){
          System.out.println("Triglicerídeos: Elevado");
      }else{
        System.out.println("Triglicerídeos: Muito elevado");
    }
        
        
    }

    @Override
    public void mostrarResultado() {

    }

}
