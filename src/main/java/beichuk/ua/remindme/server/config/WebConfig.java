package beichuk.ua.remindme.server.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Collections;
import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("beichuk.ua.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter
{
    //Чтобы возвращаемый объект Remind конвертировать в объект Jackson
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters)
    {
        //Создаем Конвертер
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper());
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));

        //Добавляем созданый конвертер
        converters.add(converter);
    }
}
