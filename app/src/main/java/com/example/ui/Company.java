package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Company extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        final String[] url_url = {""};
        final Button button = (Button) findViewById(R.id.clickOP);

        final TextView textView = (TextView) findViewById(R.id.text);
        final EditText testData = (EditText) findViewById(R.id.textData);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callOp(url_url[0]);
            }
        });
        testData.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (s.length() != 0)
                    url_url[0] =  s+"";
            }
        });

    }

    void callOp(String url_url) {

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://[2405:201:3003:9851:70b4:73b0:27e3:c798]:9000/" + url_url;

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        Log.d("msg", "#####" + response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("msg", "#####" + error);

            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);


    }

}