package com.example.generation.starwarsmovies.utils;

import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.generation.starwarsmovies.objects.Movie;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.*;

/**
 * Created by gENERATION on 07.06.2017.
 */

public final class NetworkUtils {

    private static JSONObject object;
    String url=null;
    NetworkUtils instance=new NetworkUtils();

    public NetworkUtils getInstance() {
        return instance;
    }

    public static  JSONObject getJsonObject(String url){
        JsonObjectRequest request=new JsonObjectRequest(Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        object=response;
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        return object;
    }

    }