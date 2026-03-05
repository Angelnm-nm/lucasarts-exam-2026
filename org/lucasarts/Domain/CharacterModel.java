package lucasarts.Domain;

public class CharacterModel {
    private String id;
    private String nombre;
    private String Energia;
    private String aspecto;
    private String edad;

    public CharacterModel(String id, String nombre, String energia, String aspecto, String edad) {
        this.id = id;
        this.nombre = nombre;
        Energia = energia;
        this.aspecto = aspecto;
        this.edad = edad;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnergia() {
        return Energia;
    }

    public void setEnergia(String energia) {
        Energia = energia;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}
