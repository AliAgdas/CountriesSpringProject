package org.example.countriesspringproject.repository;

import org.example.countriesspringproject.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {
    Optional<Country> findByIso(String iso);

    @Query("SELECT c.name FROM Country c WHERE c.iso = :iso")
    String findNameByIso(@Param("iso") String iso);

}


