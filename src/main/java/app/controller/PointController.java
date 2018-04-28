package app.controller;

import app.model.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class PointController {

    @Autowired
    private Set<Point> space;

    @PostMapping( "/point" )
    public ResponseEntity< String > addPoint( @RequestBody Point point ) {

        space.add( point );
        return new ResponseEntity<>( "OK", HttpStatus.OK );

    }
}
