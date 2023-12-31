package laboratorio.core.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Exame {

    String nomePaciente;
    String tipoSanguineo;
    int idade;
    String sexo;
//Constutores

    public Exame(String nomePaciente, String tipoSanguineo, int idade) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.idade = idade;
    }

    public Exame() {

    }

    /*
    public void idade(int id) {
    int anoAtual = LocalDate.now().getYear();
    idade = anoAtual - id;
}
     */
    //Metodos abstratos
    public abstract void cadastrarExame();

    public abstract void classificarResultado();

    public abstract void mostrarResultado();

    //Metodos Get e Set
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
//Metodo criado para calcular idade com data local

    public void calcularIdade(String dataNascimentoStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        LocalDate dataAtual = LocalDate.now();

        int idade = dataAtual.getYear() - dataNascimento.getYear();

        // Verifica se a data de aniversário já ocorreu este ano
        if (dataNascimento.getDayOfYear() > dataAtual.getDayOfYear()) {
            idade--;
            System.out.println(idade + " anos");
        } else {

            System.out.println(idade + " anos");
        }
    }
}
