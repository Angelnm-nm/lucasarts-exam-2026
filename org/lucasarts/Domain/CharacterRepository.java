package lucasarts.Domain;

import java.util.ArrayList;

public interface CharacterRepository {
    void add(CharacterModel character);
    ArrayList<CharacterModel> getCharacters();
    void delete(String characterId);


}
