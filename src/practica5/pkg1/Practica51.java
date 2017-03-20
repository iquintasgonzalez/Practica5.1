/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.pkg1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nacho
 */
public class Practica51
{

    public static void main (String[] args)
    {
        /*System.out.println("Sistema financiero");

        Cuenta c = new Cuenta( Cuenta.Tipo.AHORRO, 100, .05 );
        System.out.println( c );

        c.ingresa( 50 );
        c.ingresa( 120 );
        c.aplicaInteres();
        System.out.println( c );
        try
        {
            c.reintegra(0);
        } catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        Prestamo p = new Prestamo( 12, 10000, .10 );
        System.out.println( p );

        p.amortiza();
        p.amortiza();
        System.out.println( p );
        
        Empleado e = new Empleado("Ines",  Cuenta.Tipo.LIBRETA, 1000, .05);
        
        e.ingresa(800);
        System.out.println(e);
*/
        Profesor pr = new Profesor(441, "Aci1", "213123123H", "Matias");
        System.out.println(pr);
    }
}

