package kr.co.woobi.imyeon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitBundle extends AppCompatActivity implements View.OnClickListener {
    EditText editTextResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_bundle);
        Button buttonPut;
        buttonPut=findViewById(R.id.buttonPut);
        buttonPut.setOnClickListener(this);
        editTextResult=findViewById(R.id.editTextResult);
    }

    @Override
    public void onClick(View v) {
        String text = (editTextResult.getText().toString());
        Bundle bundle=new Bundle();
        bundle.putString("key",text);
        Intent intent=new Intent(this, ExplicitIntent.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
