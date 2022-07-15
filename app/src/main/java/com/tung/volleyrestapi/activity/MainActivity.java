package com.tung.volleyrestapi.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.tung.volleyrestapi.R;
import com.tung.volleyrestapi.adapter.recycleViewAdapter;
import com.tung.volleyrestapi.model.Anime;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String JSON_URL = "https://gist.githubusercontent.com/aws1994/f583d54e5af8e56173492d3f60dd5ebf/raw/c7796ba51d5a0d37fc756cf0fd14e54434c547bc/anime.json";

    private final String fakeDataJSON = "https://gist.githubusercontent.com/Thanhtung1990/2c0748726c74bafdbf591f48c1fddad1/raw/8097fb49d48fb73455aa49964acfc73039868015/shoeitems.json";

    private JsonArrayRequest jsonArrayRequest;
    private RequestQueue requestQueue;
    private List<Anime> animeList;
    private RecyclerView recyclerV_listAnime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerV_listAnime = findViewById(R.id.recyclerV_listAnime) ;
        animeList = new ArrayList<>();
        JSONRequest();


    }

//--------------------------------------------------------------------------------------------------

    private void JSONRequest(){

        jsonArrayRequest = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject = null;
                for (int i=0; i<response.length(); i++){

                    try{

                        jsonObject = response.getJSONObject(i);
                        Anime animeObject = new Anime();
                        animeObject.setName(jsonObject.getString("name"));
                        animeObject.setDescription(jsonObject.getString("description"));
                        animeObject.setRating(jsonObject.getString("Rating"));
                        animeObject.setNb_episode(jsonObject.getInt("episode"));
                        animeObject.setCategorie(jsonObject.getString("categorie"));
                        animeObject.setStudio(jsonObject.getString("studio"));
                        animeObject.setImage_url(jsonObject.getString("img"));
                        animeList.add(animeObject);

                    }catch (JSONException e){
                        e.printStackTrace();
                    }
                }

                setUpRecyclerView(animeList);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


            }
        });

        // call request
        requestQueue = Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(jsonArrayRequest);

    }


    private void setUpRecyclerView(List<Anime> list){

        // call adapter
        recycleViewAdapter _adapter = new recycleViewAdapter(this, list);
        recyclerV_listAnime.setLayoutManager(new LinearLayoutManager(this));

        // put adapter into RecyclerView
        recyclerV_listAnime.setAdapter(_adapter);

    }


}