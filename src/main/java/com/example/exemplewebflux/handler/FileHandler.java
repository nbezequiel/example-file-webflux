package com.example.exemplewebflux.handler;

import com.example.exemplewebflux.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.awt.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/file")
@RequiredArgsConstructor
public class FileHandler {

    private final FileService fileService;

    @GetMapping(produces = "application/stream+json")
    public Flux<String> getFileAsStream()  {
        List<String> asList = Arrays.asList("A", "B", "C", "D", "A", "B", "C", "D", "A", "B", "C", "D");

       return Flux.fromIterable(asList).map(l -> l + "ABC ").delayElements(Duration.ofSeconds(1));
    }
}
