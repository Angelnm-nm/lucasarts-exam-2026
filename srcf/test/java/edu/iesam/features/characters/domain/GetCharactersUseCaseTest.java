package edu.iesam.features.characters.domain;

import edu.iesam.mocks.CharacterMockRepository;
import edu.iesam.mocks.EmptyCharacterMockRepository;
import edu.iesam.mocks.NullCharacterMockRepository;
import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.GetCharactersUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetCharactersUseCaseTest {
    GetCharactersUseCase getCharactersUseCase;
    CharacterMockRepository characterMockRepository;
    NullCharacterMockRepository nullCharacterMockRepository;
    EmptyCharacterMockRepository emptyCharacterMockRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void execute() {
        characterMockRepository = new CharacterMockRepository();
        getCharactersUseCase = new GetCharactersUseCase(characterMockRepository);
        ArrayList<CharacterModel> characterModels = getCharactersUseCase.execute();

        assertEquals(3, characterModels.size());
        assertEquals("1",characterModels.get(0).getId());

    }
    @Test public void executeEmpti(){

        emptyCharacterMockRepository = new EmptyCharacterMockRepository();
        getCharactersUseCase = new GetCharactersUseCase(emptyCharacterMockRepository);

        ArrayList<CharacterModel> characterModels = getCharactersUseCase.execute();

        assertEquals(0, characterModels.size());


    }
    @Test
    public void executenull(){
        nullCharacterMockRepository = new NullCharacterMockRepository();
        getCharactersUseCase = new GetCharactersUseCase(nullCharacterMockRepository);

        ArrayList<CharacterModel> characterModels = getCharactersUseCase.execute();

        assertNull(characterModels);


    }
}