package com.pixel.taskmanager.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.Entity;
import java.util.List;

public interface BaseService <ENTITY, ID> {

    //(...) java Spread operation
    ENTITY save(ENTITY entity);

    ENTITY Update(ENTITY entity);

    List<ENTITY> getByIds(ID... ids);

    void delete(ID... id);

    Page<ENTITY> getAll(Pageable pageable);

}
