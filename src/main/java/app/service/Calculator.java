package app.service;

import app.model.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Calculator {

    @Autowired
    private List< Point > space;

    public List< List< Point > > execute( int n ) {

        List< List< Point > > result = new ArrayList<>();
        List< Point > points;

        for( int i = 0; i < space.size() - 1; i++ ) {

            Point p1 = space.get( i );

            for( int j = i + 1; j < space.size() - 1; j++ ) {

                Point p2 = space.get( j );
                points = new ArrayList<>();

                points.add( p1 );
                points.add( p2 );

                for( int k = j + 1; k < space.size() - 1; k++ ) {

                    Point p3 = space.get( k );

                    if( determinant( p1, p2, p3 ) == 0 ) {

                        points.add( p3 );

                    }

                }

                if( points.size() >= n ) {

                    result.add( points );

                }

            }

        }

        return result;

    }

    private double determinant( Point p1, Point p2, Point p3 ) {

        double A = ( p1.getX() * p2.getY() ) + ( p1.getY() * p3.getX() ) + ( p2.getX() * p3.getY() );
        double B = ( p3.getX() * p2.getY() ) + ( p2.getX() * p1.getY() ) + ( p1.getX() * p3.getY() );

        return A - B;

    }
}
