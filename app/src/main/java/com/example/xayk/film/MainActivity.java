package com.example.xayk.film;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] Films;
    String [] Links;
    boolean [] viewed;
    int counter;
    int n;
    TextView Fil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Resources res = getResources();
        Films=res.getStringArray(R.array.films);
        Links=res.getStringArray(R.array.links);
        int size=Films.length;
        viewed=new boolean[size];
        counter=size;

        Fil=findViewById(R.id.F);

    }

    public void onClick(View view){
        String film;
        if(counter==0){
            Fil.setText("End of LIST");
            return;
        }

        do
        {
            n= (int) (Math.random()*10);
        }while (viewed[n]==true);
        counter--;
        viewed[n]=true;
        Fil.setText(Films[n]);
    }

    public void onClick2(View view){
        viewed=new boolean[viewed.length];
        counter=viewed.length;
        Fil.setText("");

       /* Intent in = new Intent (this,second.class);
        in.putExtra("begin",0);
        in.putExtra("end",100);

        startActivity(in);*/
    }

    public void onClick3(View view)
    {
        if(counter==0 || counter==Links.length){
            Toast.makeText(getApplicationContext(),"Фильм не выбран",Toast.LENGTH_SHORT).show();
            return;
        }
        Uri add=Uri.parse(Links[n]);
        Intent i = new Intent(Intent.ACTION_VIEW,add);
        startActivity(i);
    }

}
