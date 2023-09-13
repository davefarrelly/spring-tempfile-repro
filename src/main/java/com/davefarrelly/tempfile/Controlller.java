package com.davefarrelly.tempfile;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.codec.multipart.FilePart;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/upload")
public class Controlller {

    @PostMapping
    public Mono<String> uploadFile(@RequestPart("uploadedFile") FilePart uploadedFile) {
        return Mono.just(uploadedFile.filename());
    }

}
