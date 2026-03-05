package lucasarts.Domain;

import lucasarts.Data.CharacterDataSource;

public class GetCharacter {
    CharactersData charactersData;
    public GetCharacter (CharactersData charactersData){
        this.charactersData =  charactersData;
    }
    public void execute(CharacterModel characterModel){
        charactersData.getCharacters();
    }

}
