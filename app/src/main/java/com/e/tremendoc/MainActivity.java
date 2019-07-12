package com.e.tremendoc;

//import android.support.v7.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.e.tremendocSDK.Api.StringCall;
import com.e.tremendocSDK.LandingActivity;
import com.e.tremendocSDK.View.UI.Activity.Authm;


public class MainActivity extends LandingActivity {

    private StringCall call;
    private RequestQueue requestQueue;
    private StringRequest request;
    private String userEmail = "d@gmail.com";
    private static final  String url="http://188.166.14.154:9000/tremendoc/api/doctor/search/random";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void TextApi(View view)  {

       Authn("userp@gmail.com");

    }


    public void GetRequest(View view) {
        requestQueue = Volley.newRequestQueue(this);
         request=new StringRequest(Request.Method.GET, url, response -> {

             Toast.makeText(this,"Response: " + response.toString(),Toast.LENGTH_LONG).show();
         }, error -> {
             Log.e("getRequest Error", error.toString());
         });

         requestQueue.add(request);
    }
}
