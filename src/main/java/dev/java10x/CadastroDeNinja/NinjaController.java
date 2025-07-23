package dev.java10x.CadastroDeNinja;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("boasvindas")
public class NinjaController {

    @GetMapping
    public String boasVindas(){
        return "Bem vindo a aplicação spring";
    }

    @GetMapping("/tchau")
    public String despedida(){
        return "Até mais";
    }
}
