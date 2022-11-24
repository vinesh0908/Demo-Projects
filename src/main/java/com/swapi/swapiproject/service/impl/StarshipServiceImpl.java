package com.swapi.swapiproject.service.impl;

import com.swapi.swapiproject.dao.IStarshipRepository;
import com.swapi.swapiproject.entity.Starship;
import com.swapi.swapiproject.excepion.StarshipAlreadyExistsException;
import com.swapi.swapiproject.excepion.StarshipNotFoundException;
import com.swapi.swapiproject.service.IStarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Represnets Starship API Service Class.
 *
 * @author Vinesh Kumar
 */
@Service
public class StarshipServiceImpl implements IStarshipService {

    @Autowired
    private IStarshipRepository starshipRepository;

    /**
     * Service method to return all Starships from inventory.
     *
     * @return Starships
     */
    @Override
    public List<Starship> findAll() {
        List<Starship> starships = new ArrayList<>();
        starshipRepository.findAll().forEach(starships::add);
        return starships;
    }

    /**
     * Service method to return Starship by ID.
     *
     * @param identifier
     * @return
     * @throws StarshipNotFoundException
     */
    @Override
    public Starship findById(Long identifier) throws StarshipNotFoundException {
        Starship starship;
        if (starshipRepository.findById(identifier).isEmpty()) {
            throw new StarshipNotFoundException(HttpStatus.BAD_REQUEST, "The Starship you are trying to search does not exist!");
        } else {
            starship = starshipRepository.findById(identifier).get();
        }
        return starship;
    }

    /**
     * Service method to return all Starships from inventory by name.
     *
     * @param name
     * @return
     * @throws StarshipNotFoundException
     */
    @Override
    public List<Starship> findAllByName(String name) throws StarshipNotFoundException {
        List<Starship> starships;
        if (starshipRepository.findAllByName(name).isEmpty()) {
            throw new StarshipNotFoundException(HttpStatus.BAD_REQUEST, "The Starship you are trying to search does not exist!");
        } else {
            starships = starshipRepository.findAllByName(name);
        }
        return starships;
    }

    /**
     * Service method to store a Starships to inventory.
     *
     * @param starship
     * @return
     */
    @Override
    public Starship addStarship(Starship starship) {
        if (starshipRepository.existsById(starship.getId())) {
            throw new StarshipAlreadyExistsException(HttpStatus.BAD_REQUEST, "The starship you are trying to store already exists!");
        }
        Starship savedStarship = starshipRepository.save(starship);
        return savedStarship;
    }

    /**
     * Service method to update a Starships in the inventory.
     *
     * @param id
     * @param starship
     */
    @Override
    public void updateStarship(Long id, Starship starship) {
        starship.setId(id);
        starshipRepository.save(starship);
    }

    /**
     * Service method to delete a Starships in the inventory.
     *
     * @param id
     */
    @Override
    public void deleteStarship(Long id) {
        if (starshipRepository.findById(id).isEmpty()) {
            throw new StarshipNotFoundException(HttpStatus.BAD_REQUEST, "The Starship you are trying to search does not exist!");
        } else {
            starshipRepository.deleteById(id);
        }
    }

    /**
     * Service method to return count of Starships from the inventory by matching name.
     *
     * @param name
     * @return
     */
    @Override
    public Long countStarshipsByName(String name) {
        Long starshipCount;
        if (null == starshipRepository.countStarshipsByName(name)) {
            throw new StarshipNotFoundException(HttpStatus.BAD_REQUEST, "The Starship you are trying to search does not exist!");
        } else {
            starshipCount = starshipRepository.countStarshipsByName(name);
        }
        return starshipCount;
    }

}
