package com.FluidAlgorithms.timetable.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.FluidAlgorithms.timetable.R;

public class Links extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.links);
    }

        public void Google (View view){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(browserIntent);

}

    public void Twitter (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
        startActivity(browserIntent);

    }


    public void Youtube (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
        startActivity(browserIntent);

    }


    public void Instagram (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
        startActivity(browserIntent);

    }

    public void Facebook (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(browserIntent);

    }

    public void Outlook (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.outlook.com/"));
        startActivity(browserIntent);

    }


    public void Gmail (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com/"));
        startActivity(browserIntent);

    }

    public void Skype (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.skype.com/"));
        startActivity(browserIntent);

    }



}

