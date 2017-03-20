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
abstract class Hora extends Fecha
{
    int hora,minutos,segundos;

    public Hora(int hora, int minutos, int segundos,int dia, int año, Mes mes)
    {
        super(dia, año, mes);
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora()
    {
        return hora;
    }

    public void setHora(int hora)
    {
        this.hora = hora;
    }

    public int getMinutos()
    {
        return minutos;
    }

    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }

    public int getSegundos()
    {
        return segundos;
    }

    public void setSegundos(int segundos)
    {
        this.segundos = segundos;
    }

    @Override
    public String toString()
    {
        StringBuilder toret = new StringBuilder();
        toret.append("Horale weyyy: ").append(hora).append(":").append(minutos).append(":").append(segundos);
        toret.append(super.toString());
        return toret.toString();
    }
    
}
