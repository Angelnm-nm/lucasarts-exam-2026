package edu.iesam.mocks;

import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.CharacterRepository;

import java.util.ArrayList;

public class NullCharacterMockRepository implements CharacterRepository {
    @Override
    public ArrayList<CharacterModel> getCharacters() {
        return null;
    }

    @Override
    public void add(CharacterModel character) {

    }

    @Override
    public void delete(String characterId) {

    }

    @Override
    public CharacterModel getCharacter(String characterId) {
        return null;
    }
}
