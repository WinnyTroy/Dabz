package troy.root.com.dabz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class landing extends AppCompatActivity {

    //    stores a unique message that can be passed from one activity to the next
    public final static String  EXTRA_MESSAGE = "troy.root.com.dabz.MESSAGE";
    // uses package name to avoid conflicts that might occur with other apps

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
            }

    public void sendMessage(View view){

        Intent move = new Intent(this, next.class);

        EditText editText =(EditText) findViewById(R.id.edit_message);

        String message = editText.getText().toString();

        move.putExtra(EXTRA_MESSAGE,message);

        startActivity(move);
    }

    }


