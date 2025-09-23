package dev.java10x.CadastroDeNinja.Missoes;
import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesNinjas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idmissao;
    private String nomemissa;
    private char rankmissao;
    @OneToMany(mappedBy = "missoes") //
    private List<NinjaModel> ninjas;

    public MissoesNinjas() {
    }

    public MissoesNinjas(long idmissao, String nomemissa, char rankmissao) {
        this.idmissao = idmissao;
        this.nomemissa = nomemissa;
        this.rankmissao = rankmissao;
    }

    public String getNomemissa() {
        return nomemissa;
    }

    public void setNomemissa(String nomemissa) {
        this.nomemissa = nomemissa;
    }

    public char getRankmissao() {
        return rankmissao;
    }

    public void setRankmissao(char rankmissao) {
        this.rankmissao = rankmissao;
    }


}
