package edu.iesam.mocks;

import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.CharacterRepository;

import java.util.ArrayList;

public class EmptyCharacterMockRepository implements CharacterRepository {

    @Override
    public ArrayList<CharacterModel> getCharacters() {
        ArrayList<CharacterModel> character = new ArrayList<>();
        return character;
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
