package firebase.sofdroid.com.firebaseapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapterList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        arrayAdapterList = new ArrayAdapter(getApplicationContext(),R.layout.item,Global.GLOBALLIST);
        listView.setAdapter(arrayAdapterList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("Position" , String.valueOf(position));
                switch (position){
                    case 0:
                        startActivity(new Intent(getApplicationContext(),AuthenticationActivity.class));
                }
            }
        });
    }
}
