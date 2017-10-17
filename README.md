# IntentImplicitMail
Simple Intent Implicit (keluar program)

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
<img src="https://github.com/moeslimdecoded/IntentImplicitMail/blob/master/IntentImplicitPhones.png">
