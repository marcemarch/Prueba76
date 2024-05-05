public class Persona {
    private String nom;
    private int edad;

    Persona(){
        this.nom = "marcelo aruquipa";
        this.edad = 48;
    }

    public void mostrar(){
        System.out.println("datos de persona");
        System.out.println("nom: " + this.nom);
        System.out.println("edad: " + this.edad);
    }
}
