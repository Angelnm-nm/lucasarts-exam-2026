package lucasarts.Domain;

import lucasarts.Presentation.CharacterView;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class GetCharactersUseCase {
    private CharacterRepository characterRepository;

    public GetCharactersUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public ArrayList<CharacterModel> execute(){
        return characterRepository.getCharacters();
    }
}
