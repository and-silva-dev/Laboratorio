/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.core.entity;

public abstract class Exame {

    String nomePaciente;
    String tipoSanguineo;
    int idade;

    public Exame(String nomePaciente, String tipoSanguineo, int idade) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.idade = idade;
    }

    public Exame() {

    }

    public void idade(int id){
        idade  = 2023 - id ;
    }
    public abstract void cadastrarExame();

    public abstract void classificarResultado();

    public abstract void mostrarResultado();

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

    

}
