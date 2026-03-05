package lucasarts.Domain;

import lucasarts.Data.CharacterDataSource;

public class GetCharacter {
    CharactersData charactersData;
    public GetCharacter (CharacterDataSource characterDataSource){
        this.charactersData = charactersData;
    }
    public void execute(CharacterModel characterModel){
        charactersData.findAll();
    }

}
