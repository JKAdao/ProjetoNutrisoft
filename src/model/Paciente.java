package model;

public class Paciente {

    private String Nome;
    private int Idade;
    private int Systolica;
    private int Diastolica;
    private String Estressado;
    private String Data;
    private String Hora;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getSystolica() {
        return Systolica;
    }

    public void setSystolica(int Systolica) {
        this.Systolica = Systolica;
    }

    public int getDiastolica() {
        return Diastolica;
    }

    public void setDiastolica(int Diastolica) {
        this.Diastolica = Diastolica;
    }

    public String getEstressado() {
        return Estressado;
    }

    public void setEstressado(String Estressado) {
        this.Estressado = Estressado;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

}
