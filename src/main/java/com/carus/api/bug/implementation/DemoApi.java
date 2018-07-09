package com.carus.api.bug.implementation;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.carus.api.bug.DemoApiDelegate;
import com.carus.api.bug.models.DemoBody;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public final class DemoApi implements DemoApiDelegate {

	private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DemoApi(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }	

    @Override
    public CompletableFuture<ResponseEntity<Void>> postDemo(DemoBody body) {
    	return CompletableFuture.completedFuture(new ResponseEntity<Void>(HttpStatus.OK));
    }
}
