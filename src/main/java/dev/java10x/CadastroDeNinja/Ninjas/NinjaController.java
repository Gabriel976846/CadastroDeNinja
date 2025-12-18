package dev.java10x.CadastroDeNinja.Ninjas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    //ADICIONAR NINJA -- CREATE
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel){
        return ninjaService.novoNinja(ninjaModel);
    }
    //PROCURAR NINJA POR ID -- CREATE
    @GetMapping("/mostrarNinjaporId/{id}")
    public NinjaModel mostrarNinjaID(@PathVariable long id){
        return ninjaService.ninjaPesquisaID(id);
    }

    //MOSTRAR TODOS OS NINJAS -- READ
    @GetMapping("/mostrar")
    public List<NinjaModel> mostrarNinja(){
        return ninjaService.listatNinjas();
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
