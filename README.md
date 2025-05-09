# QuizApp2025 - Schritt für Schritt Beispiel
Dieses Projekt, eine sehr einfach gehaltene Quiz-App für Android, wurde für den Unterricht im Fach "Entwicklung mobiler Applikationen"
im Studiengang "Multimedia und Kommunikation" entwickelt. Mit seiner Hilfe sollen die wichtigsten Grundkonzepte einer in Java programmierten 
App demonstriert werden. Begleitend dazu gibt es ein Folien-Handout mit weitergehenden Erklärungen. Der Sourcecode wurde im Mai 2025
überarbeitet und teilweise aktualisiert.

Jedes Commit entspricht einem Abschnitt in den Schulungsunterlagen, so dass die App Schritt für Schritt wächst und diese Entwicklung dennoch leicht nachvollzogen werden kann.

## Commit 1: Projekt mit Android Studio anlegen
+ Android Studio MeerKat 2024.3.1, SDK: API 35 = Android 15, Rev. 2,  VanillaIceCream
+ Minimum SDK: API 224 = Android 7.0, Nougat
+ Empty Views Activity ausgewählt

## Commit 2: Portrait-Layout für MainActivity erstellt
+ Strings in Englisch, aber nicht mehr hard-coded

## Commit 3: Landscape-Layout für MainActivity erstellt
+ Create Landscape-Qualifier und im Emulator (Landscape-Modus) getestet

## Commit 4: Lokalisierung für Deutsch durchgeführt
+ Im Translation Editor: Create Locale
+ Im Emulator getestet

## Commit 5: Q1Activity für Frage 1 angelegt
+ Neue Empty Views Activity mit RadioButtonGroup erstellt
+ In MainActivity: Eventhandler für Question1-Button angelegt (Aufruf von Q1Activity)
+ Q1Activity: Radiobuttons und CheckIn-Button noch ohne Funktion

## Commit 6: Auswertelogik für Q1Activity erstellt
+ Feedback-Activity zur Anzeige des Feedbacks erstellt
+ Q1Activity wertet RadioButtons aus und verwendet Helper für das Feedback

## Commit 7: Feedback verbessert
+ Jetzt zwei zufällige Feedbacks
+ Verwendung von Platzhalter # für Punkte im Feedbackstring
+ Punktestand wird jetzt global in Helper verwaltet und in MainActivity richtig angezeigt
+ Lokalisierung (deutsch) vervollständigt

## Commit 8: Fragen 2 und 3 implementiert
+ MainActivity erhält jetzt ein Eventhandling für alle sechs Buttons
+ Q2Activity arbeitet mit einer Texteingabe (Constraint-Layout)
+ Q3Activity mit einer Checkbox (Constraint- + Vertical LinearLayout für die Kästchen)

## Commit 9: Q4Activity (Bildfrage) erstellt
+ Q4Activity enthält eine Bildressource (Drawable): screenshot.png
+ Außerdem wird in Q4Activity ein onTouchListener als Eventhandler definiert

## Commit 10: Frage 5 (NumberPicker)
+ Q5Activity erhält einen "NumberPicker" (Zahlenrad), das in onCreate initialisiert wird

## Commit 11: Frage 6 (Auswahl aus einer Liste)
+ Q6Activity erhält eine ListView, die mit willkürlichen Namen gefüllt wird
+ Der Eventhandler ist diesmal als Instanz einer anonymen Klasse realisiert

## Was noch offen ist (und bleibt)
+ Das alte Quiz-Beispiel wurde nicht vollständig in die QuizApp2025 portiert. Einige Ansätze der 
alten App waren veraltet und inkompatibel mit aktuellen Android-Versionen (ActionBar, Settings). 
Andere zu weit hergeholt und zu kompliziert (SQL-Datenbank für Nutzungszeiten) und daher weggelassen. 
+ Die ActionBar wurde nicht realisiert, also gibt es kein About, keinen Schwierigkeitsgrad etc.
+ Eine dauerhafte Speicherung des Scores mit der Preferences-API wurde implementiert
+ Das Projekt enthält bestimmt noch einige kleinere Bugs oder zumindest "unrunde" Stellen im Sourcecode.

Alles was jetzt noch nicht funktioniert oder noch fehlt bitte gerne selbst umsetzen. Richtig schick
wäre z.B. eine generische Implementierung einer "Fragenactivity" oder der Abruf von Inhalten für Fragen
aus einer Datenbank bzw. über eine Backend-API.

Dennoch: Viel Spaß und gute Lernerfahrungen mit dieser App!

Helmut Roderus, Mai 2025 
