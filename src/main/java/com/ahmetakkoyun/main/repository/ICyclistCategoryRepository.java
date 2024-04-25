package com.ahmetakkoyun.main.repository;

import com.ahmetakkoyun.main.repository.entity.CyclistCategory;
import org.springframework.data.cassandra.repository.MapIdCassandraRepository;

public interface ICyclistCategoryRepository extends MapIdCassandraRepository<CyclistCategory> {
}
