package lucasarts.Domain;

import java.util.ArrayList;

public interface CharacterRepository {
    ArrayList<CharacterModel> getCharacters();
    void add(CharacterModel character);
    void delete(String characterId);
    CharacterModel getCharacter(String characterId);
}
