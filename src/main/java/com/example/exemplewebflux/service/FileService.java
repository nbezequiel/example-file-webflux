package com.example.exemplewebflux.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


import java.io.*;
import java.util.stream.Stream;

import static reactor.core.publisher.Flux.fromStream;

@Service
public class FileService {


    public Flux<Stream<String>> getFileResponse() throws IOException {
        BufferedReader fd =  new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("sample.txt")));
        return  Flux.just(fd.lines().map(line -> line.toString()));
    }
}
