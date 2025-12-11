package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

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
}
