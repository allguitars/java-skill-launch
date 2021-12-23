package com.cddrm.h2db.springboot_demo.daos;

import com.cddrm.h2db.springboot_demo.models.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {
}
