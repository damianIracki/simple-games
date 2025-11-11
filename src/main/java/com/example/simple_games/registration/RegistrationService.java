package com.example.simple_games.registration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "works!!!";
    }

}