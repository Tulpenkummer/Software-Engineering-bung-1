package org.hbrs.se1.ws25.exercises.uebung1.control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Factory {
    static public Translator createGermanTranslator() {
        GermanTranslator translator = new GermanTranslator();

        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        translator.setDate(date);
        return translator;
    }

    }

