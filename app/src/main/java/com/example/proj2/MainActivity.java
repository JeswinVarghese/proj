package com.example.proj2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView,rest_recyclerview;
    String topplace[];
    int images1[] = {R.drawable.kochi,R.drawable.alp,R.drawable.kumarakom,R.drawable.kovalam,R.drawable.varkala};
    int rest_images[]={R.drawable.paragonlogo,R.drawable.thakkaram,R.drawable.kumarakom};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerView);
        topplace=getResources().getStringArray(R.array.toppicksname);
        myadapter myadapter=new myadapter(this,topplace,images1);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,recyclerView.HORIZONTAL,false));

        rest_recyclerview=findViewById(R.id.rest_rclr);
        rest_adapter rest_adapter=new rest_adapter(this,rest_images);
        rest_recyclerview.setAdapter(rest_adapter);
        rest_recyclerview.setLayoutManager(new LinearLayoutManager(this,rest_recyclerview.HORIZONTAL,false));
    }
}