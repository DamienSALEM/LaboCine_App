package ovh.damiensalemwork.labocine_app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ovh.damiensalemwork.labocine_app.R;
import ovh.damiensalemwork.labocine_app.models.Film;

public class FilmAdapter extends BaseAdapter {
    private static final String TAG ="FilmAdapter";
    private List<Film> items;
    private LayoutInflater inflater;
    private Context context;
    
    public FilmAdapter(Context context, ArrayList<Film> items){
        this.items=items;
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }
    
    @Override
    public int getCount() {
        return items.size();
    }
    
    @Override
    public Film getItem(int i) {
        return items.get(i);
    }
    
    @Override
    public long getItemId(int i) {
        return 0;
    }
    
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.film_item,null);
        TextView tvTitle=view.findViewById(R.id.tv_film_item2);
        TextView tvReal=view.findViewById(R.id.tv_film_item3);
        TextView tvAn=view.findViewById(R.id.tv_film_item4);
        Film currentItem= getItem(i);
        tvTitle.setText("Title: "+currentItem.getTitle());
        tvReal.setText("Realisateur: "+currentItem.getRealisateur());
        tvAn.setText("Annee de sortie: "+currentItem.getAnnee());
        return view;
    }
}
