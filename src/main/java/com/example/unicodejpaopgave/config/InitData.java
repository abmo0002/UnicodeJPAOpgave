package com.example.unicodejpaopgave.config;

import com.example.unicodejpaopgave.model.Unicode;
import com.example.unicodejpaopgave.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        Set<Character> characters = Set.of('a', 'b', 'c', '$');

        for (Character character : characters) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) character);
            unicode.setBogstav(character);
            unicode.setName("Letter " + character);
            unicode.setDescription("Description of " + character);

            unicodeRepository.save(unicode);
        }
    }
}