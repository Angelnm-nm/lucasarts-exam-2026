package lucasarts.Domain;

public class GetCharacter {
    CharactersData charactersData;
    public GetCharacter (CharactersData charactersData){
        this.charactersData = charactersData;
    }
    public void execute(){
        charactersData.getCharacter();

    }
}
