package com.example.generation.starwarsmovies;

import android.app.DownloadManager;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.generation.starwarsmovies.utils.NetworkUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textView= (TextView) findViewById(R.id.tv);

        int id=0;
        String url="http://swapi.co/api/films/7/";

        JSONObject object=NetworkUtils.getJsonObject(url);

        try {
            textView.setText(object.getString("title"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
