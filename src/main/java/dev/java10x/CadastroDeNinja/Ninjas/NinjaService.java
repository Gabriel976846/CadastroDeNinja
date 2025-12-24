package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    // injeção de dependencia, assim a classe service vai ter acesso aos dados da interface repository
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // LISTAR TODOS OS NINJAS
    public List<NinjaModel> listatNinjas(){
        return ninjaRepository.findAll();
    }

    // MOSTRAR NINJA POR ID
    public NinjaModel ninjaPesquisaID(Long id){
        // OPTIONAL É COMOS E FOSSE UMA CAIXA -- PODE TER UM VALOR OU NÃO
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        //RETORNA O VALOR DE ninjaModel -- E FAZ O TRATAMENTO CASO O VALOR SEJA VAZIO
        return ninjaModel.orElse(null);
    }

    // CRIAR UM NOVO NINJA
    public NinjaModel novoNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
}
