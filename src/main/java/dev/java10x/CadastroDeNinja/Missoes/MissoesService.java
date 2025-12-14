package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    @Autowired
    private MissoesRepository missoesRepository;

    //VAI LISTAR TODAS AS MISSOES
    public List<MissoesModel> mostrarMissoes() {
        return missoesRepository.findAll();
    }

    //BUSCA A MISSAO POR ID
    public MissoesModel buscarMissao(long id){
        Optional<MissoesModel> missao = missoesRepository
                .findById(id);
        return missao.orElse(null);
    }
}
