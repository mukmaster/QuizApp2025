# QuizApp2025 - Schritt für Schritt Beispiel

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

