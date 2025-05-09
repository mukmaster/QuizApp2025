package com.roderus.quiz2025;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Q6Activity extends AppCompatActivity {

    final String loesung = "Honeycomb";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_q6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Eine ArrayList mit vielen Namen füllen (s.u.)
        final ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<namen.length; i++) {
            list.add(namen[i]);
        }

        // Das ListView Widget finden
        ListView listview = findViewById(R.id.q6_listview);

        /*  Die Daten (ArrayList list) über einen Adapter mit dem ListView verbinden. Diesmal arbeiten
            wir mit Eventhandling-Methode #3: zuständig ist eine Instanz der anonymen Klasse AdapterView.OnItemClickListener,
            genauer: deren Methode onItemClick
         */
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

        // Einen Eventhandlicher für Clicks auf Listeneinträge definieren
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                                                final String clickedItem = (String) parent.getItemAtPosition(position);
                                                if (clickedItem.equals(loesung))
                                                    Helper.feedback(true,1,view.getContext());
                                                else
                                                    Helper.feedback(false,0,view.getContext());
                                            }
                                        }
        );
    }

    private final String[] namen = {
            "Adolf","Alfred","Almut","Alrun","Amalia","Ansgar","Arbogast","Archibald","Ariovist","Armin",
            "Arne","Arnfried","Arnulf","Arved","Astrid","Aswin","Baldur","Balko","Baltrun","Benno","Bert",
            "Björn","Bodo","Borghilde","Brandolf","Bruno","Burghard","Dagmar","Dagny","Dagobert","Dankmanr",
            "Degenhard","Deike","Detlef","Dietbald","Eberhard","Eckbert","Edda","Edelgard","Edigna","Eduard",
            "Eike","Eila","Einar","Elfgard","Elmar","Elvira","Emma","Engelbert","Erik","Erlgard","Ernst",
            "Erwin","Ewald","Falko","Fara","Farold","Fehild","Ferdinand","Ferun","Finja","Folkward","Frank",
            "Frauke","Freya","Friederike","Fritz","Frigga","Gaidemar","Gandolf","Gefion","Gelsa","Gerald",
            "Gerda","Gerda","Gerlinde","Gertrud","Gerwin","Gisela","Gilbert","Gisbert","Gismara","Godelief",
            "Godwin","Goswin","Gotmar","Gotthilf","Gudrun","Gunhild","Günther","Gustav","Hedda","Hagarun",
            "Hagen","Hallgard","Harald","Hartmut","Hartwig","Hedwig","Heidrun","Heike","Heiner","Helga",
            "Helgard","Helmar","Helmut","Herbert","Herline","Hermann","Hermine","Herta","Hildegard","Hilke",
            "Holger","Honeycomb","Horst","Hubert","Iduna","Igor","Inga","Ingrid","Ingrun","Inka","Irmbert",
            "Irmela","Irmgard","Irmina","Irminar","Irvin","Isbert","Isolde","Iwo","Karl","Knut","Konrad",
            "Kriemhild","Kunheide","Kunna","Kunolf","Kunrada","Kurt","Landerun","Lando","Leif","Leonhard",
            "Leopold","Liebgard","Lioba","Lothar","Ludwig","Luitberga","Luithilde","Malte","Malvin",
            "Manfred","Marbod","Margund","Markward","Mathilde","Merlinde","Minna","Minnegard","Mutbrecht",
            "Nanna","Neidhart","Norbert","Nordger","Nordwin","Norman","Northild","Nortrud","Nortrun",
            "Norwiga","Notker","Oda","Odin","Olaf","Ortlind","Ortrun","Ortwin","Osgard","Oskar",
            "Osrun","Ostara","Oswald","Oswin","Othilde","Otmar","Otthein","Ottokar","Raban","Radolf",
            "Raimund","Rambert","Randolf","Rango","Ranmar","Rasso","Richard","Rigmor","Rinelda","Robert",
            "Rochbert","Roland","Romilda","Roswin","Roswitha","Rudgar","Runhild","Salgard","Sarhild",
            "Sarolf","Saskia","Schwanhilde","Sebald","Siegfried","Siegmund","Sif","Sigga","Siglinde",
            "Sigmar","Sigrid","Sigrun","Sindolf","Sisgards","Solveig","Sonnwinn","Stilla","Sunhild",
            "Sven","Swidger","Tankred","Tassilo","Teuderun","Thilo","Thor","Thorbrand","Thorleif","Thorsten",
            "Throals","Thusnelda","Tilrun","Traute","Trautwin","Trudildis","Tyra","Uland","Ulbert",
            "Ulf","Ulrike","Ute","Uwe","Vanadis","Volker","Volkmar","Volkwin","Volkward","Walburga",
            "Walda","Waldemar","Walter","Waltraud","Werner","Wibke","Wiborg","Widogard","Widukind",
            "Wigberg","Wilberta","Wilfriede","Wilgard","Wilhelm","Willibald","Wiltraud","Winimar",
            "Wisgard","Wolfgang","Wolfram","Wunna"
            };
}