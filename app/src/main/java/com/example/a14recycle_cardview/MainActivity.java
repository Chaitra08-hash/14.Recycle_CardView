package com.example.a14recycle_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();

    }

    private void initData() {

        userList= new ArrayList<>();
        userList.add(new ModelClass(R.drawable.image1,"Ashwini","10:45Am","How are u","____________________________"));
        userList.add(new ModelClass(R.drawable.image2,"Rekha","11:45Am","I am good","____________________________"));
        userList.add(new ModelClass(R.drawable.image1,"Ashwini","11:45Am","completed lab program","____________________________"));
        userList.add(new ModelClass(R.drawable.image2,"Rekha","11:49Am","Yes","____________________________"));
        userList.add(new ModelClass(R.drawable.image3,"Kiran","12:45Pm","Hiii","____________________________"));
        userList.add(new ModelClass(R.drawable.image4,"Akshatha","12:45Pm","Have shown wastup group","____________________________"));
        userList.add(new ModelClass(R.drawable.image5,"Rajesh","01:45Pm","How are u","____________________________"));
        userList.add(new ModelClass(R.drawable.image1,"Likitha","02:45Pm","Have submitted Assignment","____________________________"));
        userList.add(new ModelClass(R.drawable.image2,"Rahul","03:45Pm","Hello","____________________________"));
        userList.add(new ModelClass(R.drawable.image3,"Vidhya","04:45Pm","How are u","____________________________"));
        userList.add(new ModelClass(R.drawable.image4,"Archana","05:45Pm","Hiii","____________________________"));
        userList.add(new ModelClass(R.drawable.image5,"Chaitra","10:45Pm","Ya I got it","____________________________"));
        userList.add(new ModelClass(R.drawable.image1,"Ashwini","10:45Pm","Good Night","____________________________"));

    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}