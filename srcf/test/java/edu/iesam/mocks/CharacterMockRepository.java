package edu.iesam.mocks;

import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.CharacterRepository;

import java.util.ArrayList;

public class CharacterMockRepository implements CharacterRepository {
public Integer countSaveMethod = 0;
public Integer countDeleteMethod = 0;
    @Override
    public ArrayList<CharacterModel> getCharacters() {
        ArrayList<CharacterModel> characters = new ArrayList<>();
        CharacterModel characterModel = new CharacterModel("1","Album1","guardia",10,100);
        CharacterModel characterModel2 = new CharacterModel("2","Album2","guardia",10,100);
        CharacterModel characterModel3 = new CharacterModel("3","Album3","guardia",10,100);
        characters.add(characterModel);
        characters.add(characterModel2);
        characters.add(characterModel3);
        return characters;
    }

    @Override
    public void add(CharacterModel character) {
        countSaveMethod++;

    }

    @Override
    public void delete(String characterId) {
        countDeleteMethod++;
    }

    @Override
    public CharacterModel getCharacter(String characterId) {
        return new CharacterModel("1","Name1","guardia",1,10);
    }
}
