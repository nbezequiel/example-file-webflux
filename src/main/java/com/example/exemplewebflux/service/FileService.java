package com.example.exemplewebflux.service;

import com.example.exemplewebflux.model.FileResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FileService {



    public Mono<FileResponse> getFileResponse(){
        return Mono.just()
    }
}
