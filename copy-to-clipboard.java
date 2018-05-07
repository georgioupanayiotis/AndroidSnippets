@Override
        public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (v.getId()) {
                
                case R.id.button1bc:
                copyTextToClipboard(txtnomebanca);
                break;  
                
                         
            
                case R.id.btn_updaterecord:
                        if (txtnomeutentebanca.getText().toString().equals("")
                                        || txtpasswordbanca.getText().toString().equals("")) {
                                Toast.makeText(ModificaBanca.this, "Compila i campi..",
                                                Toast.LENGTH_LONG).show();
                        } else {

                                db = new DatabaseHelper(getApplicationContext());
                                db.getWritableDatabase();
                                pm = new ProductBanca();
                                pm.nomebanca = txtnomebanca.getText().toString();
                                pm.nomeutentebanca = txtnomeutentebanca.getText().toString();
                                pm.passwordbanca = txtpasswordbanca.getText().toString();
                                pm.notebanca = txtnotebanca.getText().toString();
                                
                                pm.idbanca = i.getStringExtra("id");

                                Log.i(">>>>>productid<<<<<", "" + i.getExtras().getString("id"));
                                db.updateProductbanca(pm);
                                Toast.makeText(ModificaBanca.this,
                                                "Account e Password BANCA modificati!", Toast.LENGTH_LONG)
                                                .show();

                                db.close();
                                super.onResume();

                        }
                        break;
                }
        
                
     
        }
         private void copyTextToClipboard(String text) {
         int sdk = android.os.Build.VERSION.SDK_INT;
         if (sdk < android.os.Build.VERSION_CODES.HONEYCOMB) {
                 copyTextPreHC(text);
         } else {
                 copyTextHC(text);
         }
 }

 @SuppressWarnings("deprecation")
 private void copyTextPreHC(String text) {
         android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
         clipboard.setText(text);
 }

 @TargetApi(11)
 private void copyTextHC(String text) {
         android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
         android.content.ClipData clip = android.content.ClipData.newPlainText("Your text label", ""+txtnomebanca.getText().toString());
         clipboard.setPrimaryClip(clip);
 }
}
