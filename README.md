Übungen zur Vorlesung Software Engineering I
WS 2025 / 2026
Übungsblatt 1

1.1 Durch eine Factoryklasse kann Client mit Germantranslator kommunizieren. So kann der Client ohne new Objekte erzeugen und die Logik und Ausgabe bleibt durch unterschiedliche Packages getrennt.

Hier eignet sich das Factory Method Pattern. Dabei wird die Erzeugung von Objekten auf eine Factoryklasse konzentriert. Client programmiert so gegen das Interface und muss keine new Aufrufe verwenden. Das sorgt unter anderem für einfacherer Wartung Entkoppelung etc.

Das Interface Translator muss im selben package sein und sichbar sein, daher muss public hinzugefügt werden

1.3 Hier wird bereits das Produkt von den Tests getrennt. Wenn die GermanTranslatorklasse verändert wird funktioniert meine Testklasse weiterhin. Hilft auch bei Übersichtlichkeit für ein Team.

Test sind so überschaubarer, da nicht jedes mögliche Ergebnis getestet werden muss sondern nur wenige für bestimmte festgelegte Fälle.

Blackboxtests sollen nur ein und Ausgaben prüfen wobei der konkrete Implementierung unbekannt ist. Es können nur Rückgabewerte getestet werden und der Client gibt keine Ausgaben und ist so zum direkten testen ebenfalls nicht geeignet. 
