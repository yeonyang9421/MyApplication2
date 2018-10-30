package kr.co.woobi.imyeon.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitIntent extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        Bundle bundle=getIntent().getExtras();
        TextView textViewResult=(TextView) findViewById(R.id.textViewResult);
        textViewResult.setText(bundle.getString("key"));
    }
}
