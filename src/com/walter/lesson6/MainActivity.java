package com.walter.lesson6;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
ListView list;
ArrayAdapter<String> adapter;
String []courses={"French","Kiswahili","Chemistry","Maths","Biology","English","Geography","Physics",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView) findViewById(R.id.listViewCourses);
        /*adapter=new ArrayAdapter<String>(this,
        		    android.R.layout.simple_list_item_1,
        		    courses);*/
        adapter=new ArrayAdapter<String>(this,
        		                         R.layout.list_item,
        		                         R.id.list_item_tv,
        		                         courses);
        
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
                Log.d("LIST", courses[arg2]);
                Log.e("ERROR", "Sample error message"); 
                Log.i("INFO", "Sample info");                
                System.out.println(courses[arg2]);
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
