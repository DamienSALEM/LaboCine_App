package ovh.damiensalemwork.labocine_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.InputStream;

public class DetailsActivity extends AppCompatActivity {
    private  static final String TAG = "DetailsActivity";
    private TextView Title;
    private TextView Real;
    private ImageView img;
    private String film_title;
    private TextView Annee;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        
        //Titre:
        film_title=getIntent().getStringExtra("titre");
        Log.d(TAG,"Titre= "+film_title);
        Title=findViewById(R.id.tv_title);
        Title.setText(film_title);
    
        //Real:
        String film_real=getIntent().getStringExtra("real");
        Log.d(TAG,"Real= "+film_real);
        Real=findViewById(R.id.tv_real);
        Real.setText("Realisateur: "+film_real);
    
        //Annee:
        int film_annee=getIntent().getIntExtra("annee",1999);
        Log.d(TAG,""+film_annee);
        Annee=findViewById(R.id.tv_annee);
        String str_annee=String.valueOf(film_annee);
        Annee.setText("Sortie en "+str_annee);
        
        //ID;
        int film_id=getIntent().getIntExtra("id",0);
        Log.d(TAG,""+film_id);
        
        //image:
        img=findViewById(R.id.img_alien);
        String str_id=String.valueOf(film_id);
        int resourceId = getResources().getIdentifier("film"+str_id, "drawable", getPackageName());
        Log.d(TAG,""+resourceId);
        img.setImageResource(resourceId);
        
        
    }
    
    public void backBtn(View view) {
        Intent MainActivity=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(MainActivity);
        finish();
    }
}