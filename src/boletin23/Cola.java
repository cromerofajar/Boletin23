package boletin23;

/**
 *
 * @author cromerofajar
 */
public class Cola {
    int edad;

    public Cola() {
    }

    public Cola(int edad) {
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "edad=" + edad;
    }
    
}
