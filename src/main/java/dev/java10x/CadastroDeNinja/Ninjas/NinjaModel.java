package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesNinjas;
import jakarta.persistence.*;

import java.util.List;

@Entity // TRANFORMAR A CLASSE EM UMA ENTIDADE DO BD
@Table(name = "tb_ninjas") // DAR NOME DA TABELA
public class NinjaModel {
    @Id // GERA O ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GERA O IDE DE FORMA CRESCENTE
    private long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne // VARIOS PARA 1
    @JoinColumn(name = "missoes_id") // CHAVE ESTRANGEIRA
    private MissoesNinjas missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
}
