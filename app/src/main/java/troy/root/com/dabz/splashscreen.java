package troy.root.com.dabz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread load = new Thread() {
            public void run() {
                super.run();
                try {
                    sleep(3000);
                    Intent tranz = new Intent(getBaseContext(),landing.class);
                    startActivity(tranz);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        load.start();
    }
}
