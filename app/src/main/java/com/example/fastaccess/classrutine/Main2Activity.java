package com.example.fastaccess.classrutine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView =findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null) {
            String dayName = bundle.getString("name");

            showDetails (dayName);
        }
    }
    void  showDetails(String dayName) {

        if(dayName.equals("monday")) {
            textView.setText(R.string.mon_text);
        }
        if(dayName.equals("tuesday")) {
            textView.setText(R.string.tues_text);
        }
        if(dayName.equals("wednesday")) {
            textView.setText(R.string.wed_text);
        }
        if(dayName.equals("thursday")) {
            textView.setText(R.string.thus_text);
        }
    }
}
