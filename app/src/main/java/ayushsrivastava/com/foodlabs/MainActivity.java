package ayushsrivastava.com.foodlabs;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1=(EditText)findViewById(R.id.e1);
        final EditText editText2=(EditText)findViewById(R.id.e2);
        Button btn=(Button)findViewById(R.id.button);
        final Toast toast = Toast.makeText(getApplicationContext(), "Incorrect Username/Password", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=editText1.getText().toString();
                String s2=editText2.getText().toString();
                if(s1.equals("muskanduseja27@gmail.com")&&s2.equals("smile"))
                {
                    Intent intent=new Intent(MainActivity.this, menu.class);
                    MainActivity.this.startActivity(intent);
                }
                else
                    toast.show();
            }
        });
    }
}
