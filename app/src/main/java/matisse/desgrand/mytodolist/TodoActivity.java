package matisse.desgrand.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by desgrama on 15/01/2018.
 */
public class TodoActivity extends Activity  implements View.OnClickListener {
    private Button buttonValider, buttonVider ;
    private TextView textView1;
    private EditText editText1;
    private String totalText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        buttonValider = (Button) findViewById(R.id.buttonValider);
        buttonValider.setOnClickListener(this) ;

        buttonVider = (Button) findViewById(R.id.buttonVider);
        buttonVider.setOnClickListener(this) ;

        textView1 = (TextView) findViewById(R.id.textView1);
        editText1 = (EditText) findViewById(R.id.editText1);
    }

    @Override
    public void onClick(View v) {
        totalText = textView1.getText().toString() +
                    " - " +
                    editText1.getText().toString()+
                    "\n";
        if(v.getId()==R.id.buttonValider){
            textView1.setText(totalText);
            editText1.setText("");
        }
        if(v.getId()==R.id.buttonVider){
            textView1.setText("");
        }
        Toast.makeText(getApplicationContext(),"Bouton cliqué",Toast.LENGTH_SHORT).show();
    }
}

