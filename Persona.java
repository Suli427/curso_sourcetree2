package curso_sourcetree2;

public class Persona {

    private Long id;
    private String nombre;
    private String apellido;

    public Long getId(){
        return this.id;
    }

    public Long setId(Long id){
        this.id = id;
    }

    public Long getNombre(){
        return this.nombre;
    }

    public Long setNombre(String nombre){
        this.nombre = nombre;
    }
    public Long getApellido(){
        return this.apellido;
    }

    public Long setApellido(Long apellido){
        this.apellido = apellido;
    }

}