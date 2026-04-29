package lucasarts.Domain;

public class CharacterModel {
    private String id;
    private String name;
    private String role;
    private int level;
    private int health;

    public CharacterModel(String id, String name, String role, int level, int health) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.level = level;
        this.health = health;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "CharacterModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
