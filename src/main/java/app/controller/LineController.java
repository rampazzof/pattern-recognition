package app.controller;

import app.model.Point;
import app.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LineController {

    @Autowired
    private Calculator calculator;

    @GetMapping( "/space/{n}" )
    public ResponseEntity< List< List< Point > > > getLines( @PathVariable( "n" ) int n ) {

        return new ResponseEntity<>( calculator.execute( n ), HttpStatus.OK  );

    }
}
