package lucasarts.Domain;

public class AddCharacter {
    CharacterRepository characters;
    public AddCharacter(CharacterRepository characters) {
        this.characters = characters;
    }
    public void execute(CharacterModel character) {
        characters.add(character);
    }
}
