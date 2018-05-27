package com.butilov.asbankserver.repository;

import com.butilov.asbankserver.entity.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitsRepository extends CrudRepository<Visit, Long> {
}