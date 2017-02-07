package com.amycap93.w3_res_intent_listview_demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.amycap93.w3_res_intent_listview_demo.utils.Utils.MSG_KEY_INTENT;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMap(View view){
        Intent newInt= new Intent(Intent.ACTION_VIEW);
        newInt.setData(Uri.parse("geo:0,0?q=Montclair+State+University"+
                " +New Jersey + USA" ));
    }
    class MyLstnr implements View.OnClickListener{
        public void OnClick(View view){
            Intent exIntent = new Intent(MainActivity.this, Main2Activity.class);
            exIntent.putExtra(MSG_KEY_INTENT, "age is:"+editText.getText());
            startActivity(exIntent);
        }
    }
}
