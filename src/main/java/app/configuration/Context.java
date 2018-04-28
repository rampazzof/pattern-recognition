package app.configuration;

import app.model.Point;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class Context {

    @Bean
    public Set<Point> getSpace() {
        return new HashSet<>();
    }

}
