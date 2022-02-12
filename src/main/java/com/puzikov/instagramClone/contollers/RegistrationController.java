package com.puzikov.instagramClone.contollers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RegistrationController {

    @GetMapping("/registration")
    public String registerUser() {
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject("https://api.giphy.com/v1/gifs/search?api_key=woPboQGEI83gJ7nMIYHWzgPe88uLHAyw&q=rich&limit=1&offset=0&rating=r&lang=en", String.class);
        System.out.println(json);

        return null;
    }
}
