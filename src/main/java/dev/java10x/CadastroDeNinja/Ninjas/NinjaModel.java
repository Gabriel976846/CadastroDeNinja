package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // TRANFORMAR A CLASSE EM UMA ENTIDADE DO BD
@Table(name = "tb_cadastro") // NOME DA TABELA
@Data
@AllArgsConstructor
@NoArgsConstructor

public class NinjaModel {
    @Id // GERA O ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GERA O ID DE FORMA CRESCENTE E AUTOMATICAMENTE
    private long id;
    private String nome;

    @Column(unique = true) // FALA QUE ESSA COLUNA SERA UNCIA
    private String email;

    private int idade;
    @ManyToOne // RELAÇÃO N:1 -- UM NINJA TEM UMA UNICA MISSÃO
    @JoinColumn(name = "missoes_id") // GERA A CHAVE ESTRAGENGEIRA FK
    private MissoesModel missoes;
}
