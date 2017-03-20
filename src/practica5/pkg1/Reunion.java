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
public class Reunion extends Hora
{

    String nombreReunion;

    public Reunion(int hora, int minutos, int segundos, String nombreReunion, int dia, int año, Mes mes)
    {
        super(hora, minutos, segundos, dia, año, mes);
        this.nombreReunion = nombreReunion;
    }

    public String getNombreReunion()
    {
        return nombreReunion;
    }

    public void setNombreReunion(String nombreReunion)
    {
        this.nombreReunion = nombreReunion;
    }

    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();
        toret.append("reunion:").append(nombreReunion);
        toret.append(super.toString());
        return toret.toString();
    }

  
}
