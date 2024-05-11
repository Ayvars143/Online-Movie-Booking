package org.example.onlinemoviebookinglocationms.controller;

import org.example.onlinemoviebookinglocationms.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.onlinemoviebookinglocationms.service.LocationService;

@RestController
@RequestMapping("/location-mapper")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @PostMapping("/locations")
    public ResponseEntity<Location> addLocation(@RequestBody Location location) {
        //return "location";
        return locationService.addLocation(location);
    }

    @GetMapping("/locations/{id}")
    public Location getLocation(@PathVariable int id) {
        return locationService.getLocation(id);

    }

    @PutMapping("/updatelocations/{id}")
    public ResponseEntity<Location> updateLocation(@PathVariable int id, @RequestBody Location updatedLocation) {
        return locationService.updateLocation(id, updatedLocation);
    }

    @DeleteMapping("/deletelocations/{id}")
    public ResponseEntity<String> deleteLocation(@PathVariable int id) {
        return locationService.deleteLocation(id);
    }
}
