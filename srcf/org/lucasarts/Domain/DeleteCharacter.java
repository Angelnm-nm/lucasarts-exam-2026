package lucasarts.Domain;

public class DeleteCharacter {
    CharacterRepository characterRepository;

    public DeleteCharacter(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void execute(String characterId) {
        characterRepository.delete(characterId);
    }
}
