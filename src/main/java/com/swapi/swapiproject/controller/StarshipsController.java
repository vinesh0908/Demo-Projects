package com.swapi.swapiproject.controller;

import com.swapi.swapiproject.entity.Starship;
import com.swapi.swapiproject.service.IStarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Represents a Starship Controller.
 *
 * @author Vinesh Kumar
 */
@RestController
@RequestMapping("/starships")
public class StarshipsController {

    @Autowired
    private IStarshipService starshipService;

    /**
     * Finds all Starships in the inventory.
     *
     * @return Starships
     */
    @RequestMapping("/")
    public List<Starship> findAll() {
        return starshipService.findAll();
    }

    /**
     * Finds all Starships with matching name.
     *
     * @param name
     * @return
     */
    @GetMapping("/search/{name}")
    @ResponseBody
    public List<Starship> findByName(@PathVariable String name) {
        return starshipService.findAllByName(name);
    }

    /**
     * Finds a Starship with matching ID.
     *
     * @param id
     * @return
     */
    @GetMapping("/{id:[0-9]+}")
    @ResponseBody
    public Starship findById(@PathVariable Long id) {
        return starshipService.findById(id);
    }

    /**
     * Adds a new Starship to inventory.
     *
     * @param starship
     */
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void save(@RequestBody Starship starship) {
        starshipService.addStarship(starship);
    }

    /**
     * Updates a Starship in inventory.
     *
     * @param starship
     * @param id
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{identifier:[0-9]+}")
    public void update(@RequestBody Starship starship, @PathVariable Long id) {
        starshipService.updateStarship(id, starship);
    }

    /**
     * Deletes a Starship.
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id:[0-9]+}")
    public void deleteStarship(@PathVariable Long id) {
        starshipService.deleteStarship(id);
    }

    /**
     * Returns a count of Starships with matching name.
     *
     * @param name
     * @return
     */
    @GetMapping("/count/{name}")
    @ResponseBody
    public Long count(@PathVariable String name) {
        return starshipService.countStarshipsByName(name);
    }
}
