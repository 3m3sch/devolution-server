package com.example.devolution.server.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;	

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RestApiTests {
	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private GameStateController gameStateController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(port).isNotNull();
		assertThat(restTemplate).isNotNull();
		assertThat(gameStateController).isNotNull();
	}
	
	private ResponseEntity<?> getResponse(String api) {
		return restTemplate.getForObject("http://localhost:" + port + api, ResponseEntity.class);
	}

}
