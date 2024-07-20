package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public Fabricante(String nombre, Pais p) {
        this.nombre = nombre;
        this.pais = p;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setFabricantes(ArrayList<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }
}
