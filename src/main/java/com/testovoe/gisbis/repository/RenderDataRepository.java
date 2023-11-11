package com.testovoe.gisbis.repository;

import com.testovoe.gisbis.model.RenderDataModel;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenderDataRepository extends ReactiveSortingRepository<RenderDataModel,Long> {

}
