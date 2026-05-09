package lucasarts.Domain;

public class GetAlbumByIdUseCase {
    private CharacterRepository characterRepository;
    public GetAlbumByIdUseCase(CharacterRepository characterRepository) {}

    public CharacterModel execute(String characterId) {
        return characterRepository.getCharacter(characterId);
    }
}
