package ovh.damiensalemwork.labocine_app.models;

public class Film{
    private static int nbFilms=0;
    private int id;
    private String title;
    private String realisateur;
    private int annee;
    
    public Film(int Id, String Title, String Realisateur, int Annee) {
        this.id=Id;
        this.title=Title;
        this.realisateur=Realisateur;
        this.annee=Annee;
        nbFilms++;
    }
    
    public String getTitle(){return title;}
    public String getRealisateur(){return realisateur;}
    public int getAnnee(){return annee;}
    public int getId(){return id;}
    public int getNbFilms(){return nbFilms;}
}