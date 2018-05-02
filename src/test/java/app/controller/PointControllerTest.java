package app.controller;

import app.model.Point;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class PointControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void addPointTest() throws Exception {

        String body = this.testRestTemplate.postForObject("/point", new Point( 2, 3), String.class );
        assertThat( body ).isEqualTo("OK");

    }


}
