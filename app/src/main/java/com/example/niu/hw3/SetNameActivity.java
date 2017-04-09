package com.example.niu.hw3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Created by NIU on 4/3/17.
 */

public class SetNameActivity extends AppCompatActivity{
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_name);
        Button back = (Button)findViewById(R.id.button);
        back.setOnClickListener(showmain);
        editText = (EditText)findViewById(R.id.editText);
        editText.setText("");

    }

    private OnClickListener showmain = new OnClickListener() {
        public void onClick(View v) {
            String input_str = editText.getText().toString();
            String result = new String();
            result = "Hello " + input_str;

            Intent intent = new Intent();
            intent.putExtra("KEY_NAME", result);
            setResult(RESULT_OK, intent);

            finish();
        }
    };
}
