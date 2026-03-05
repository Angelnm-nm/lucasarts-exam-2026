package lucasarts.Data;

import lucasarts.Domain.CharacterModel;

import java.util.ArrayList;
import java.util.Objects;

public class CharacterMemLocalDataSource {

    private ArrayList<CharacterModel> storage = new ArrayList<>();

    public ArrayList<CharacterModel> findAll() {
        return storage;
    }

    public void save(CharacterModel charactermodel) {
        storage.add(charactermodel);
    }

    public void delete(String characterId) {
        storage.removeIf(character -> Objects.equals(character.getId(), characterId));
    }
}
