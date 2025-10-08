package org.hbrs.se1.ws25.exercises.uebung1.view;

import org.hbrs.se1.ws25.exercises.uebung1.control.Translator;
import org.hbrs.se1.ws25.exercises.uebung1.control.Factory;


public class Client {


		 void display( int aNumber ){
             Translator translator = Factory.createGermanTranslator();

			 System.out.println("Das Ergebnis der Berechnung: " +
					"[das Ergebnis an dieser Stelle]" );
		 }
}





