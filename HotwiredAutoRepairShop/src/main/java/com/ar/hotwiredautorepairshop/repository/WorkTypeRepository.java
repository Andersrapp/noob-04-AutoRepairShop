package com.ar.hotwiredautorepairshop.repository;

import com.ar.hotwiredautorepairshop.model.WorkType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anders
 */
@Repository
public interface WorkTypeRepository extends CrudRepository<WorkType, Integer> {

    @Query("SELECT workType.id FROM WorkType workType")
    public Iterable<Integer> getAllWorkTypeIds();
}
