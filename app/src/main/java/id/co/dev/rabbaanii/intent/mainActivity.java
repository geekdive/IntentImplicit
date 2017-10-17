package id.co.dev.rabbaanii.intent;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnImplicitMail = (Button)findViewById(R.id.intentImplicitMail);
        Button btnImplicitPhone = (Button)findViewById(R.id.intentImplicitPhon);
        Button btnImplicitBrowser = (Button)findViewById(R.id.intentImplicitBrowser);
        Button btnImplicitContact = (Button)findViewById(R.id.intentImplicitContact);

        final EditText edtEmail, edtSubjek, edtBody, edtPhones, edtBrowser;

        edtSubjek = (EditText)findViewById(R.id.edSubject);
        edtBody = (EditText)findViewById(R.id.edBody);
        edtEmail = (EditText)findViewById(R.id.edEmail);
        edtPhones = (EditText)findViewById(R.id.telp);
        edtBrowser = (EditText)findViewById(R.id.toBrowser);


        final CharSequence emaildo, subjdo, bodydo;

        emaildo = edtEmail.getText();
        subjdo = edtSubjek.getText();
        bodydo = edtBody.getText();

        btnImplicitMail.setOnClickListener(new View.OnClickListener() {
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

        btnImplicitPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Your Number is: " + edtPhones.getText().toString());
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:" + edtPhones.getText().toString()));
                startActivity(i);
            }
        });

        btnImplicitBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Your URL is: " + edtBrowser.getText().toString());
                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://" + edtBrowser.getText().toString()));
                startActivity(i);
            }
        });

        btnImplicitContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToContact = new Intent();
                goToContact.setAction(android.content.Intent.ACTION_VIEW);
                goToContact.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(goToContact);
            }
        });
    }
}
