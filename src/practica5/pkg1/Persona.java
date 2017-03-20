/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg1;

/**
 *
 * @author Nacho
 */
public class Persona
{

    String DNI;
    String nombre;

    public Persona(String DNI, String nombre)
    {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getDNI()
    {
        return DNI;
    }

    public void setDNI(String DNI)
    {
        this.DNI = DNI;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();
        toret.append("Dni:");
        toret.append(getDNI());
        toret.append("\nNombre:");
        toret.append(getNombre());

        return toret.toString();
    }

}
