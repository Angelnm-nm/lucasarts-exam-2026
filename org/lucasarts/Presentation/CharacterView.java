package lucasarts.Presentation;

import lucasarts.Data.CharacterDataSource;
import lucasarts.Data.CharacterMemLocalDataSource;
import lucasarts.Domain.CharacterModel;
import lucasarts.Domain.CharactersData;
import lucasarts.Domain.DeleteCharacter;
import lucasarts.Domain.GetCharacter;

public class CharacterView {
    CharactersData charactersData;
    public static void printcharacter (){
        GetCharacter getCharacter = new GetCharacter((CharactersData) new CharacterDataSource(new CharacterMemLocalDataSource()));
        CharacterModel characterModel1 = new CharacterModel("1233","gg","100","atractivo","20");
        getCharacter.execute(characterModel1);
    }
    public static void printcharacters (CharacterModel characterModel){
        GetCharacter getCharacter = new GetCharacter((CharactersData) new CharacterDataSource(new CharacterMemLocalDataSource()));
        getCharacter.execute(characterModel);

    }
    public static void deleteCharacters (CharacterModel characterModel){
        CharacterModel characterModel1 = new CharacterModel("22","jeb","30","cuidado","4");
        DeleteCharacter deleteCharacter =new DeleteCharacter((CharactersData) new CharacterDataSource(new CharacterMemLocalDataSource()));
        deleteCharacter.delete(characterModel1);

        }
    }







}
