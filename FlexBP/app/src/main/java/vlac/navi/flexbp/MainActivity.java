package vlac.navi.flexbp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this is just for the first time
        // also it is executed when occurs a rotation
        // even in screen size
        System.out.println("onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        System.out.println("onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        // this happens when the view is seeing by user
        System.out.println("onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        // it is just happens in multiviews
        System.out.println("onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        // it just happens when another activity covers all screen
        System.out.println("onPause");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        System.out.println("onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        System.out.println("onDestroy");
        super.onDestroy();
    }

    public void signIn(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText txtUsername = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText txtPassword = (EditText) findViewById(R.id.editTextTextPassword);
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();
        intent.putExtra("vlac.navi.flexbp.USER", username);
        intent.putExtra("vlac.navi.flexbp.PASSWORD", password);
        startActivity(intent);
        // FLAC_ACTIVITY_CLEAR_TOP - Delete all activities over this
        // clearTaskOnLaunch - all stack will be deleted but the root is not
    }

    public void signUp(View view) {}
}