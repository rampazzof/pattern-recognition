package app.controller;

import app.model.Point;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class LineControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private List< Point > space;

    @Test
    public void getLinesTestOnePoints() {

        space.clear();

        space.add( new Point( 1, 2 ) );
        space.add( new Point( 1, 3 ) );
        space.add( new Point( 1, 5 ) );

        space.add( new Point( 5, 5 ) );
        space.add( new Point( 6, 5 ) );
        space.add( new Point( 7, 5 ) );

        space.add( new Point( 3, 6 ) );



        ResponseEntity< List > response = this.testRestTemplate.getForEntity("/line/1", List.class );
        assertThat( response.getBody().size() ).isEqualTo( 0 );

    }

    @Test
    public void getLinesTestTwoPoints() {

        space.clear();

        space.add( new Point( 1, 2 ) );
        space.add( new Point( 1, 3 ) );
        space.add( new Point( 1, 5 ) );

        space.add( new Point( 5, 5 ) );
        space.add( new Point( 6, 5 ) );
        space.add( new Point( 7, 5 ) );

        space.add( new Point( 3, 6 ) );



        ResponseEntity< List > response = this.testRestTemplate.getForEntity("/line/2", List.class );
        assertThat( response.getBody().size() ).isEqualTo( 21 );

    }

    @Test
    public void getLinesTestNPoints() {

        space.clear();

        space.add( new Point( 1, 2 ) );
        space.add( new Point( 1, 3 ) );
        space.add( new Point( 1, 5 ) );

        space.add( new Point( 5, 5 ) );
        space.add( new Point( 6, 5 ) );
        space.add( new Point( 7, 5 ) );

        space.add( new Point( 3, 6 ) );



        ResponseEntity< List > response = this.testRestTemplate.getForEntity("/line/3", List.class );
        assertThat( response.getBody().size() ).isEqualTo( 4 );

    }

}
