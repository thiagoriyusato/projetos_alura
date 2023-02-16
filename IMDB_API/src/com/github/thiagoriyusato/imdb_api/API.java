package com.github.thiagoriyusato.imdb_api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class API {
	public static void main(String[] args) throws IOException {
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest
				.newBuilder()
			    .uri(URI.create("https://imdb-api.com/en/API/Top250Movies/k_2g34smuk"))
			    .GET()
			    .build();
		

		
		client.sendAsync(request, BodyHandlers.ofString())
	      .thenApply(HttpResponse::body)
	      .thenAccept(System.out::println)
	      .join();
	}
}
