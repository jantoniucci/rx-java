package com.gft;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import rx.Observable;
import rx.Single;

/**
 * Created by javier on 09/08/16.
 */
@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello-async")
    public Single<String> index() {
        return Observable.just("Greetings from Spring Boot!").toSingle();
    }

}