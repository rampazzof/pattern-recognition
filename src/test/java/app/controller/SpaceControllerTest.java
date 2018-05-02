package app.controller;

import app.model.Point;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class SpaceControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private List< Point > space;

    @Test
    public void getSpaceTest() throws Exception {

        space.add( new Point( 1, 2 ) );
        space.add( new Point( 1, 3 ) );
        space.add( new Point( 1, 5 ) );

        space.add( new Point( 5, 5 ) );
        space.add( new Point( 6, 5 ) );
        space.add( new Point( 7, 5 ) );

        space.add( new Point( 3, 6 ) );

        ResponseEntity< List > response = this.testRestTemplate.getForEntity("/space", List.class );
        assertThat( response.getBody().size() ).isEqualTo( 7 );

    }

}
