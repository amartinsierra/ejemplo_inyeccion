package dependencias;

import dagger.Component;
import graficos.curso.ejercicios.ejemplo_inyeccion.MainActivity;

@Component(modules = {ClaseInyeccion.class})
public interface ComponenteDrager {
    void inject(MainActivity ma);
}
