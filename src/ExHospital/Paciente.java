package ExHospital;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente {
    private String nome;
    private LocalDate dataNascimento;
    private ArrayList<Atendimento> atendimentos;
    private boolean ativo;

    public Paciente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.atendimentos = new ArrayList<>();
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void desativar() {
        this.ativo = false;
    }

    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return nome.equalsIgnoreCase(paciente.nome);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento;
    }
}

