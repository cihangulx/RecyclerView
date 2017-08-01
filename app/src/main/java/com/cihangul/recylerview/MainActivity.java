package com.cihangul.recylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("http://www.cihangul.com/wp-content/uploads/2017/05/kotlin_800x320-1.png",
                "Kotlin İntelij Firmasının Geliştirdiği Bir Programlama Dilidir."));

        itemList.add(new Item("http://www.cihangul.com/wp-content/uploads/2016/11/firebase0001_0.png",
                "Firebase Google' ın gerçek zamanlı veri tabanı gibi bir çok hizmet verdiği bir platformudur."));
        itemList.add(new Item("http://www.cihangul.com/wp-content/uploads/2016/11/firebase0001_0.png",
                "Firebase Google' ın gerçek zamanlı veri tabanı gibi bir çok hizmet verdiği bir platformudur."));

        ItemAdapter itemAdapter = new ItemAdapter(itemList,MainActivity.this);
        recyclerView.setAdapter(itemAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        linearLayoutManager.scrollToPosition(0);

        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
