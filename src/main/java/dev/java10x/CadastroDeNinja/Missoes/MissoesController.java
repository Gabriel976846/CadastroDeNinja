package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // INFORMA QUE ISSO É UMA ROTA PARA API
@RequestMapping("missoes") // INFORMA QUE TUDO VAI SER MAPEADO
public class MissoesController {

    @Autowired
    private MissoesService missoesService; //INJEÇÃO DE DEPENDENCIA

    @GetMapping("/listarMissao")
    public List<MissoesModel> mostrar(){
        return missoesService.mostrarMissoes();
    }

    @GetMapping("missaoid/{id}")
    public String mostarid(){
        return "Ninja por Id";
    }
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao Criada";
    }

    @PutMapping("/alterarMissao")
    public String alterar(){
        return "Missao Alterada";
    }

    @DeleteMapping("/deletarMissao")
    public String deletar(){
        return "Missao deletada";
    }
}
