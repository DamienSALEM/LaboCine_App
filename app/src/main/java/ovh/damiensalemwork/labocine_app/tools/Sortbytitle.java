package ovh.damiensalemwork.labocine_app.tools;

import java.util.Comparator;

import ovh.damiensalemwork.labocine_app.models.Film;

public  class Sortbytitle implements Comparator<Film> {
    
    @Override
    public int compare(Film film1, Film film2) {
        return film1.getTitle().compareTo(film2.getTitle());
    }
}