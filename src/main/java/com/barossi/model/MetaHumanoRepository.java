package com.barossi.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaHumanoRepository extends CrudRepository<MetaHumano, Integer> {
}
