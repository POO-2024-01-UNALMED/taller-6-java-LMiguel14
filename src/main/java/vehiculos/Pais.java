package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> paiseslist = new ArrayList<Pais>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarPais(Pais p){
        Pais.paiseslist.add(p);

    }

    public static Pais paisMasVendedor() {

        int mayor = 0;
        Pais pais = null;
        
       

        return pais;
    }
}
