package lucasarts.Data;

import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.CharacterRepository;

import java.util.ArrayList;

public class CharacterDataSource implements CharacterRepository {

    private CharacterMemLocalDataSource characterMemLocalDataSource;

    public CharacterDataSource(CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }

    @Override
    public void add(CharacterModel character) {
        characterMemLocalDataSource.add(character);
    }

    @Override
    public ArrayList<CharacterModel> getCharacters() {
        return characterMemLocalDataSource.findAll();
    }

    @Override
    public void delete(String characterId) {
        characterMemLocalDataSource.delete(characterId);
    }
}


