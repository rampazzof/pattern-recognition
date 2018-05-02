package app.controller;

import app.model.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpaceController {

    @Autowired
    private List< Point > space;

    @GetMapping( "/space" )
    public ResponseEntity< List< Point > > getSpace() {

        return new ResponseEntity<>( space, HttpStatus.OK );

    }

    @DeleteMapping( "/space" )
    public ResponseEntity< String > deleteSpace() {

        space.clear();
        return new ResponseEntity<>( "OK", HttpStatus.OK );

    }

}
