package com.barossi.service.impl;

import com.barossi.model.MetaHumano;
import com.barossi.model.MetaHumanoRepository;
import com.barossi.service.MetaHumanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

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
    public Set<MetaHumano> buscarCriminosos() {
        Set<MetaHumano> setRetorno = new HashSet<>();
        Iterator<MetaHumano> iterator = metaRepository.findAll().iterator();
        while(iterator.hasNext()){
            if (iterator.next().isCriminoso()) setRetorno.add(iterator.next());
        }
        return setRetorno;
    }

    @Override
    public Set<MetaHumano> buscarIdSecretaDesconhecida() {
        Set<MetaHumano> setRetorno = new HashSet<>();
        Iterator<MetaHumano> iterator = metaRepository.findAll().iterator();
        while(iterator.hasNext()){
            if(iterator.next().getIdSecreta().equalsIgnoreCase("Desconhecida")) setRetorno.add(iterator.next());
        }
        return setRetorno;
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
