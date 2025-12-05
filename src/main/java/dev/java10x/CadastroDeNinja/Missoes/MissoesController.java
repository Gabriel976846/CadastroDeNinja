package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController // INFORMA QUE ISSO É UMA ROTA PARA API
@RequestMapping("missoes") // INFORMA QUE TUDO VAI SER MAPEADO
public class MissoesController {

    @GetMapping("/listarMissao")
    public String mostrar(){
        return "Missos listadas";
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
