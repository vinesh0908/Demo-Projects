package com.swapi.swapiproject.dao;

import com.swapi.swapiproject.entity.Starship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Represents a Starship repository.
 *
 * @author Vinesh Kumar
 */
@Repository
public interface IStarshipRepository extends JpaRepository<Starship, Long> {

    /**
     * Finds all Starships from the inventory.
     *
     * @return Starships
     */
    List<Starship> findAll();

    /**
     * Finds all Starships from the inventory by matching name
     *
     * @param identifier
     * @return
     */
    List<Starship> findAllByName(String identifier);

    /**
     * Returns count of Starships by matching name.
     *
     * @param name
     * @return
     */
    Long countStarshipsByName(@Param("name") String name);
}
