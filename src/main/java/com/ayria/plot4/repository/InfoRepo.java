package com.ayria.plot4.repository;

import com.ayria.plot4.model.InfoDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepo extends CrudRepository<InfoDao, Long> {
}
