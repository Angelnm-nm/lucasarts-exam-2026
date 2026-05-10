package edu.iesam.features.characters.domain;

import edu.iesam.mocks.CharacterMockRepository;
import lucasarts.Domain.AddCharacter;
import lucasarts.Domain.CharacterModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddCharacterTest {
    AddCharacter addCharacter;
    CharacterMockRepository characterMockRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
     public void shouldCallSave() {
        CharacterMockRepository characterMockRepository = new CharacterMockRepository();
        addCharacter = new AddCharacter(characterMockRepository);
        CharacterModel characterModel = new CharacterModel("1"
                ,"Character","Perro",10,100);
        addCharacter.execute(characterModel);

        assertEquals(1,characterMockRepository.countSaveMethod);

    }
}