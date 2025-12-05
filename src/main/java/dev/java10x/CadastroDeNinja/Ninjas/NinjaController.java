package dev.java10x.CadastroDeNinja.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo a aplicação spring";
    }


    //ADICIONAR NINJA -- CREATE
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }
    //PROCURAR NINJA POR ID -- CREATE
    @GetMapping("/mostrarNinjaporId")
    public String mostrarNinjaId(){
        return "Mostrar Ninja por id";
    }
    //MOSTRAR TODOS OS NINJAS -- READ
    @GetMapping("/mostrar")
    public String mostrarNinja(){
        return "Ninjas";
    }
    //DELETAR NINJA -- UPDATE
    @PutMapping("/atualizarninja")
    public String atualizarninja(){
        return "Alterar Ninja";
    }
    //ALTERAR DADOS DO NINJA -- DELETE
    @DeleteMapping("deletarNinjaporId")
    public String deletarNija(){
        return "Ninja deletado";
    }

}
