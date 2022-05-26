package com.barossi.service.impl;

import com.barossi.model.MetaHumano;
import com.barossi.model.MetaHumanoRepository;
import com.barossi.service.MetaHumanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MetaHumanoServiceImpl implements MetaHumanoService {

    @Autowired
    private MetaHumanoRepository metaRepository;

    @Override
    public Iterable<MetaHumano> buscarTodos() {
        return metaRepository.findAll();
    }

    @Override
    public MetaHumano buscarPorId(Integer id) {
        Optional<MetaHumano> meta = metaRepository.findById(id);
        return meta.get();
    }

    @Override
    public Iterable<MetaHumano> buscarCriminosos() {
        List<MetaHumano> criminosos = new ArrayList<>();
        for (MetaHumano metaHumano: metaRepository.findAll()) {
            if(metaHumano.isCriminoso()) criminosos.add(metaHumano);
        }
        return criminosos;
    }

    @Override
    public Iterable<MetaHumano> buscarIdSecretaDesconhecida() {
        List<MetaHumano> desconhecidos = new ArrayList<>();
        for (MetaHumano metaHumano: metaRepository.findAll()) {
            if(metaHumano.getIdSecreta().equalsIgnoreCase("Desconhecida")) desconhecidos.add(metaHumano);
        }
        return desconhecidos;
    }

    @Override
    public void inserir(MetaHumano meta) {
        metaRepository.save(meta);
    }

    @Override
    public void atualizar(Integer id, MetaHumano meta) {
        Optional<MetaHumano> metaById = metaRepository.findById(id);
        if (metaById.isPresent()) metaRepository.save(meta);
    }

    @Override
    public void deletar(Integer id) {
        metaRepository.deleteById(id);
    }
}
