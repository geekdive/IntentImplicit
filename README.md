# IntentImplicitMail
Simple Intent Implicit (keluar program), dibaweah adalah contoh preview dan source code, implementasikan sourcecode kedalam button aksi

Aplikasi Mail:

```
System.out.println("Email :" + emaildo);
System.out.println("Subject :" + subjdo);
System.out.println("Body :" + bodydo);
Intent intent = new Intent(Intent.ACTION_SEND);
intent.setType("text/html");
intent.putExtra(Intent.EXTRA_EMAIL, emaildo);
intent.putExtra(Intent.EXTRA_SUBJECT, subjdo);
intent.putExtra(Intent.EXTRA_TEXT, bodydo);
startActivity(Intent.createChooser(intent, "Send Email"));
```

<img src="https://github.com/moeslimdecoded/IntentImplicitMail/blob/master/IntentImplicitMail.png">

Aplikasi Phones:

```
System.out.println("Your Number is: " + edtPhones.getText().toString());
Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:" + edtPhones.getText().toString()));
startActivity(i);
```

<img src="https://github.com/moeslimdecoded/IntentImplicitMail/blob/master/IntentImplicitPhones.png">

Aplikasi Browser: 

```
System.out.println("Your URL is: " + edtBrowser.getText().toString());
Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://" + edtBrowser.getText().toString()));
startActivity(i);
```
<br>
<img src="https://github.com/moeslimdecoded/IntentImplicitMail/blob/master/lock1.png" widht="1000" height="400"> <img src="https://github.com/moeslimdecoded/IntentImplicitMail/blob/master/lock2.png" widht="1000" height="400">
<img src="https://github.com/moeslimdecoded/IntentImplicitMail/blob/master/IntentImplicitBrowser.png">
