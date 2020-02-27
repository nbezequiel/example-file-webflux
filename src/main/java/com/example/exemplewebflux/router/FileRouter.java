//package com.example.exemplewebflux.router;
//
//import com.example.exemplewebflux.handler.FileHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
//
////@Configuration
//public class FileRouter {
//
//  //  @Bean
//    public RouterFunction<ServerResponse> route(FileHandler handler){
//        return RouterFunctions.route(GET("/file").and(accept(MediaType.valueOf(MediaType.TEXT_EVENT_STREAM_VALUE))), handler::getFileAsStream);
//    }
//
//}
