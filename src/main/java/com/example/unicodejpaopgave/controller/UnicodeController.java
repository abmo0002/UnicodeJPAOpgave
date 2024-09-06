package com.example.unicodejpaopgave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UnicodeController {

    @GetMapping("/unicode/{i}")
    public String getUnicode(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/char/{c}")
    public String getCharUnicode(@PathVariable char c) {
        int unicode = (int) c;
        return "char=" + c + " unicode=" + unicode;
    }

    @GetMapping("/sequence")
    public List<Character> getCharacterSequence(
            @RequestParam char startChar,
            @RequestParam int count) {
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            characters.add((char) (startChar + i));
        }

        return characters;
    }

}
