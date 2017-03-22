package hr947x.numbertransform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text_result;
    Button btn1;
    EditText edit1;
    Rmb rmb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_result = (TextView)findViewById(R.id.textView2);
        btn1 = (Button)findViewById(R.id.button1);
        edit1 = (EditText)findViewById(R.id.editText1);
        rmb1 = new Rmb();
        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                rmb1.setrmb(edit1.getText().toString());
                text_result.setText(rmb1.getrmb().toString());
            }
        });
    }
}