package id.co.dev.rabbaanii.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnImplicit = (Button)findViewById(R.id.intentImplicit);

        final TextView edtEmail, edtSubjek, edtBody;

        edtSubjek = (TextView)findViewById(R.id.edSubject);
        edtBody = (TextView)findViewById(R.id.edBody);
        edtEmail = (TextView)findViewById(R.id.edEmail);


        final CharSequence emaildo, subjdo, bodydo;

        emaildo = edtEmail.getText();
        subjdo = edtSubjek.getText();
        bodydo = edtBody.getText();

        btnImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Email :" + emaildo);
                System.out.println("Subject :" + subjdo);
                System.out.println("Body :" + bodydo);
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, emaildo);
                intent.putExtra(Intent.EXTRA_SUBJECT, subjdo);
                intent.putExtra(Intent.EXTRA_TEXT, bodydo);

                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });
    }
}
