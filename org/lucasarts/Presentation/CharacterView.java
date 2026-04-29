package lucasarts.Presentation;

import lucasarts.Data.CharacterDataSource;
import lucasarts.Data.CharacterMemLocalDataSource;
import lucasarts.Domain.*;

import java.util.ArrayList;

public class CharacterView {

    public static void printCharacters(){
        GetCharactersUseCase getCharactersUseCase = new GetCharactersUseCase(new CharacterDataSource( new CharacterMemLocalDataSource().newInstance()));

        ArrayList<CharacterModel> characterList = getCharactersUseCase.execute();
        System.out.println(characterList);

    }

    public static void saveCharacter(){
        CharacterModel newCharacter = new CharacterModel("1", "Luke", "Jedi", 10, 100);
        AddCharacter addCharacter = new AddCharacter(new CharacterDataSource(new CharacterMemLocalDataSource().newInstance()));
        addCharacter.execute(newCharacter);
    }

    public static void deleteCharacter(){
        DeleteCharacter deleteCharacter = new DeleteCharacter(new CharacterDataSource(new CharacterMemLocalDataSource().newInstance()));
        deleteCharacter.execute("1");
    }

    public static void main(String[] args) {
        printCharacters();
        saveCharacter();
        printCharacters();
        deleteCharacter();
        printCharacters();
    }

}
