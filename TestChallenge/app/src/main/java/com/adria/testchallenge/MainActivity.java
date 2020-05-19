package com.adria.testchallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity implements Callback<DeviseExchange>, DeviseItemClickListener{
@BindView(R.id.lvDevise)
    ListView lvDevise;
@BindView(R.id.base)
    TextView base;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        loadDeviseExchangeData();
    }

    private void loadDeviseExchangeData() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.exchangeratesapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DeviseExchangeService service = retrofit.create(DeviseExchangeService.class);
        Call<DeviseExchange> call = service.loadDeviseExchange();
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<DeviseExchange> call, Response<DeviseExchange> response) {

        DeviseExchange deviseExchange = response.body();
     base.setText(deviseExchange.getBase());
     lvDevise.setAdapter(new DeviseAdapter(this,deviseExchange.getListDevise(),this));


    }

    @Override
    public void onFailure(Call<DeviseExchange> call, Throwable t) {
        Toast.makeText(this,t.getMessage(),Toast.LENGTH_LONG).show();

    }




    public void onDeviseItemClick(Devise d) {
        Intent intent = new Intent(this, GrapheActivity.class);
        intent.putExtra("rate", d.getRate());
        intent.putExtra("date", d.getDate());
        startActivity(intent);

    }
}