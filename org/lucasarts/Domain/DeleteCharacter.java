package lucasarts.Domain;

public class DeleteCharacter {
    CharactersData charactersData;
    public DeleteCharacter(CharactersData charactersData){
        this.charactersData = charactersData;
    }
    public void delete(CharacterModel characterModel1){
        charactersData.delete();
    }
}
