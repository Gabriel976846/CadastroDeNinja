package dev.java10x.CadastroDeNinja.Missoes;
import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private char rankmissao;
    @OneToMany(mappedBy = "missoes") //
    private NinjaModel ninja;

    public MissoesModel() {
    }

    public MissoesModel(long id, String nome, char rankmissao) {
        this.id = id;
        this.nome = nome;
        this.rankmissao = rankmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getRankmissao() {
        return rankmissao;
    }

    public void setRankmissao(char rankmissao) {
        this.rankmissao = rankmissao;
    }


}
