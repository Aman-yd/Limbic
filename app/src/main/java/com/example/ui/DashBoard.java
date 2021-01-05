package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class DashBoard extends AppCompatActivity implements View.OnClickListener {

    private CardView cvCompany,cvEmploye,cvContact,cvProject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cvCompany= (CardView) findViewById(R.id.cvCompany);
        cvEmploye= (CardView) findViewById(R.id.cvEmploye);
        cvContact= (CardView) findViewById(R.id.cvContact);
        cvProject= (CardView) findViewById(R.id.cvProject);

        cvCompany.setOnClickListener(this);
        cvProject.setOnClickListener(this);
        cvContact.setOnClickListener(this);
        cvEmploye.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.cvCompany:
                i=new Intent(this,Company.class);
                startActivity(i);
                break;
            case R.id.cvEmploye:
                i=new Intent(this,Employe.class);
                startActivity(i);
                break;
            case R.id.cvProject:
                i=new Intent(this,Projects.class);
                startActivity(i);
                break;
            case R.id.cvContact:
                i=new Intent(this,ContactUs.class);
                startActivity(i);
                break;
            default:break;

        }
    }
}