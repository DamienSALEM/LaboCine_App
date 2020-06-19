package ovh.damiensalemwork.labocine_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import ovh.damiensalemwork.labocine_app.adapters.FilmAdapter;
import ovh.damiensalemwork.labocine_app.models.Film;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";
    private ListView listView;
    private ArrayList<Object> films;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView=findViewById(R.id.lv_main);
        
        films= new ArrayList<>();
        films.add(new Film(1,"Alien","Ridley Scott",1979));
        films.add(new Film(2,"Seul sur Mars","Ridley Scott",2015));
        films.add(new Film(3,"Avatar","James Cameron",2009));
        films.add(new Film(4,"Star Wars, episode I : La menace fantôme",
                "George Lucas",1999));
        films.add(new Film(5,"Star Wars, episode II : L'attaque des clones",
                "George Lucas",2002));
        films.add(new Film(6,"Star Wars, episode III : La Revanche des Sith",
                "George Lucas",2005));
        films.add(new Film(7,"Star Wars, episode IV : Un nouvel espoir",
                "George Lucas",1977));
        films.add(new Film(8,"Star Wars, episode V : L'Empire contre-attaque",
                "Irvin Kershner",1980));
        films.add(new Film(9,"Star Wars, episode VI : Le Retour du Jedi",
                "Richard Marquand",1983));
        films.add(new Film(10,"Star Wars, episode VII : Le Réveil de la Force",
                "J. J. Abrams",2015));
        films.add(new Film(11,"Star Wars, episode VIII : Les Derniers Jedi",
                "Rian Johnson",2017));
        films.add(new Film(12,"Star Wars, episode IX : L'Ascension de Skywalker",
                "J. J. Abrams",2019));
        films.add(new Film(13,"Interstellar", "Christopher Nolan",2014));
        films.add(new Film(14,"Retour vers le futur", "Robert Zemeckis",1985));
        films.add(new Film(15,"Retour vers le futur 2", "Robert Zemeckis",1989));
        films.add(new Film(16,"Retour vers le futur 3", "Robert Zemeckis",1990));
        films.add(new Film(17,"Matrix", "Lana Wachowski, Lilly Wachowski",1999));
        films.add(new Film(18,"Matrix Reloaded", "Lana Wachowski, Lilly Wachowski",
                2003));
        films.add(new Film(19,"Matrix Revolutions", "Lana Wachowski, Lilly Wachowski",
                2003));
        films.add(new Film(20,"La Strategie Ender", "Gavin Hood", 2013));
        
        
        }
    }
