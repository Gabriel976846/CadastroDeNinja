package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    @Autowired
    private MissoesRepository missoesRepository;

    //VAI LISTAR TODAS AS MISSOES
    public List<MissoesModel> mostrarMissoes() {
        return missoesRepository.findAll();
    }
}
