package lucasarts.Domain;

public class GetCharacterByIdUseCase {
    private CharacterRepository characterRepository;
    public GetCharacterByIdUseCase(CharacterRepository characterRepository) {}

    public CharacterModel execute(String characterId) {
        return characterRepository.getCharacter(characterId);
    }
}
