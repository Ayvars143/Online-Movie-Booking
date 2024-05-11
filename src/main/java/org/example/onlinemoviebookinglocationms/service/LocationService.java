package org.example.onlinemoviebookinglocationms.service;

import org.example.onlinemoviebookinglocationms.entity.Location;
import org.springframework.http.ResponseEntity;

public interface LocationService {

    public ResponseEntity<Location> addLocation(Location location);

    public Location getLocation(int id);

    public ResponseEntity<Location> updateLocation(int id, Location updatedLocation);

    public ResponseEntity<String> deleteLocation(int id);
}
