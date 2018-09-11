package com.planetmars23.softmedia.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<President>list;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rv_catagory);
        rv.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(PresidentDatas.getListData());

        showRecyclerCard();
    }

    private void showRecyclerList()
    {
        rv.setLayoutManager(new LinearLayoutManager(this));
        ListPresidentAdapter listPresidentAdapter = new ListPresidentAdapter(this);
        listPresidentAdapter.setListPresident(list);
        rv.setAdapter(listPresidentAdapter);
    }

    private void showRecyclerGrid()
    {
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        GridPresidentAdapter gridPresidentAdapter = new GridPresidentAdapter(this);
        gridPresidentAdapter.setListPresident(list);
        rv.setAdapter(gridPresidentAdapter);
    }

    private void showRecyclerCard()
    {
        rv.setLayoutManager(new LinearLayoutManager(this));
        CardPresidentAdapter cardPresidentAdapter = new CardPresidentAdapter(this);
        cardPresidentAdapter.setListPresident(list);
        rv.setAdapter(cardPresidentAdapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_card:
                showRecyclerCard();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
