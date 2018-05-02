package app.configuration;

import app.model.Point;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Configuration
public class Context {

    @Bean
    public List< Point > getSpace() {
        return new ArrayList<>();
    }

}
