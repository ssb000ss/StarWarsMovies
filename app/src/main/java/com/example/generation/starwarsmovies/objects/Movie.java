package com.example.generation.starwarsmovies.objects;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by gENERATION on 07.06.2017.
 */

public class Movie {
    String title;
    int episode_id;
    String opening_crawl;
    String release_date;
    JSONObject object;

    public Movie(String title, int episode_id, String opening_crawl, String release_date) {
        this.title = title;
        this.episode_id = episode_id;
        this.opening_crawl = opening_crawl;
        this.release_date = release_date;
    }

    public Movie(JSONObject object) {
        this.object = object;
    }

    void setAllFromJSON(){
        try {
            title=object.getString("title");
            episode_id=object.getInt("episode_id");
            opening_crawl=object.getString("opening_crawl");
            release_date=object.getString("release_date");
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
    public String getTitle() {
        return title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public String getRelease_date() {
        return release_date;
    }
}
