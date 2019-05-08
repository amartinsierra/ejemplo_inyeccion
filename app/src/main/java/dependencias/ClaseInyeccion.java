package dependencias;

import java.util.ArrayList;
import java.util.List;

import beans.Cuenta;
import beans.Persona;
import dagger.Module;
import dagger.Provides;

@Module
public class ClaseInyeccion {
    @Provides
    public List<Persona> getClientes(){
        List<Persona> prs=new ArrayList<>();
        prs.add(new Persona("p1",3,"p1@gmail.com"));
        prs.add(new Persona("p2",44,"p2@gmail.com"));
        prs.add(new Persona("p3",26,"p3@gmail.com"));
        return prs;
    }
    @Provides
    public Cuenta getCuenta(List<Persona> personas){
        Cuenta c=new Cuenta();
        c.setCodigo(100);
        c.setTitulares(personas);
        return c;
    }
}
