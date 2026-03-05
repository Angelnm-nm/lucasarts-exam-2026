package lucasarts.Data;

import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.CharactersData;

import java.util.ArrayList;

public class CharacterDataSource extends CharacterMemLocalDataSource {
    private CharacterMemLocalDataSource characterMemLocalDataSource;

    public CharacterDataSource (CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }
}
