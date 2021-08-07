package com.example.contactlistapprecycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Contact o1=new Contact(1,"Aditi","995417088");
Contact o2=new Contact(2,"Neha","1254786284");
Contact o3=new Contact(3,"Tanuja","7845174515");
Contact o4=new Contact(4,"Riya","8965312878");
Contact o5=new Contact(5,"Raunak","896541377");
Contact o6=new Contact(6,"Maanav","231548624");
Contact o7=new Contact(7,"Reshal","878645327");
Contact o8=new Contact(8,"Shobhit","758531251");
Contact o9=new Contact(9,"Vansh","648748432");
Contact[] contacts={o1,o2,o3,o4,o5,o6,o7,o8,o9};
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad=new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);

    }
}