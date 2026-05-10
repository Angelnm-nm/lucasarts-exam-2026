package edu.iesam.features.characters.domain;

import edu.iesam.mocks.CharacterMockRepository;
import edu.iesam.mocks.NullCharacterMockRepository;
import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.GetCharacterByIdUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetCharacterByIdUseCaseTest {
    GetCharacterByIdUseCase getCharacterByIdUseCase;
    CharacterMockRepository characterMockRepository;
    NullCharacterMockRepository nullCharacterMockRepository;



    @BeforeEach
    void setUp() {
    }

    @Test
    public void execute() {
        characterMockRepository = new CharacterMockRepository();
        getCharacterByIdUseCase = new GetCharacterByIdUseCase(characterMockRepository);

        CharacterModel characterModel = getCharacterByIdUseCase.execute("1");

        assertEquals("1",characterModel.getId());
        assertEquals("Name1",characterModel.getName());
        assertEquals("guardia",characterModel.getRole());
        assertEquals(100,characterModel.getHealth());
        assertEquals(10,characterModel.getLevel());

    }
    @Test
    public void execute_null() {
        nullCharacterMockRepository = new NullCharacterMockRepository();
        getCharacterByIdUseCase = new GetCharacterByIdUseCase(nullCharacterMockRepository);

        CharacterModel characterModel = getCharacterByIdUseCase.execute("1");
        assertNull(characterModel);
    }
}