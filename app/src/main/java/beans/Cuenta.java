package beans;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private int codigo;
    private List<Persona> titulares;

    public Cuenta() {
        titulares=new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Persona> getTitulares() {
        return titulares;
    }

    public void setTitulares(List<Persona> titulares) {
        this.titulares = titulares;
    }
}
