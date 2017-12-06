package com.example.administrator.mvp_example.Model;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-06.
 */

public class MainModel extends Activity{
    private EditText editText1;



    public String getClickedText() {
        return "Clicked!!!";
    }

    public int getEditText(){
//        editText1 = findViewById(R.id.edit_1);
//        TextView textView1 = findViewById(R.id.text_1);
//        String str = editText1.getText().toString();
//        int num = Integer.parseInt(str);
        return 0;
    }

}