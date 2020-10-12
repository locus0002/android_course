package vlac.navi.flexbp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this is just for the first time
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String username = intent.getStringExtra("vlac.navi.flexbp.USER");
        String password = intent.getStringExtra("vlac.navi.flexbp.PASSWORD");

        TextView lblUser = findViewById(R.id.textView);
        lblUser.setText(username);

        TextView lblPassword = findViewById(R.id.textView2);
        lblPassword.setText(password);
    }

    @Override
    protected void onStart() {
        System.out.println("onStart Message");
        super.onStart();
    }

    @Override
    protected void onResume() {
        System.out.println("onResume Message");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("onPause Message");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("onPause Message");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        System.out.println("onRestart Message");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        System.out.println("onDestroy Message");
        super.onDestroy();
    }
}