final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
emailIntent.setType("plain/text");
emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"test@email.com"});
emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Oggetto");
emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Messaggio...");
                
//L'allegato è opzionale
Uri attachment = Uri.parse("file:///sdcard/file_da_allegare.txt");
emailIntent.putExtra(Intent.EXTRA_STREAM, attachment);
                 
startActivity(Intent.createChooser(emailIntent, "Invia email..."));;
