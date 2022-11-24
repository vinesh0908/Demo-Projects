package com.swapi.swapiproject.service;

import com.swapi.swapiproject.entity.Starship;

import java.util.List;

/**
 * Represents abstraction for Starship API service.
 */
public interface IStarshipService {

    /**
     * Service abstraction to return all Starships from inventory.
     *
     * @return
     */
    List<Starship> findAll();

    /**
     * Service abstraction to return Starship by ID.
     *
     * @param identifier
     * @return
     */
    Starship findById(Long identifier);


    /**
     * Service abstraction to return all Starships from inventory by name.
     *
     * @param name
     * @return
     */
    List<Starship> findAllByName(String name);

    /**
     * Service abstraction to store a Starships to inventory.
     *
     * @param starship
     * @return
     */
    Starship addStarship(Starship starship);

    /**
     * Service abstraction to update a Starships in the inventory.
     *
     * @param id
     * @param starship
     */
    void updateStarship(Long id, Starship starship);

    /**
     * Service abstraction to delete a Starships in the inventory.
     *
     * @param id
     */
    void deleteStarship(Long id);


    /**
     * Service abstraction to return count of Starships from the inventory by matching name.
     *
     * @param name
     * @return
     */
    Long countStarshipsByName(String name);
}
