package lucasarts.Data;

public class CharacterDataSource extends CharacterMemLocalDataSource {
    CharacterMemLocalDataSource characterMemLocalDataSource;

    public CharacterDataSource (CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }
}
