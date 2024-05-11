package org.example.onlinemoviebookinglocationms.repository;

import org.example.onlinemoviebookinglocationms.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    //Location findByName(String name);
    List<Location> findByName(String name);
}
