//A WebView component in an Android AlertDialog:


private void handleInfoButtonPressed() {
    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int choice) {
            switch (choice) {
                case DialogInterface.BUTTON_NEUTRAL:
                    break;
            }
        }
    };

    // create a WebView with the current stats
    WebView webView = new WebView(context);
    webView.loadData(SampleStats.boxScore1, "text/html", "utf-8");

    // display the WebView in an AlertDialog
    AlertDialog.Builder builder = new AlertDialog.Builder(context);
    builder.setTitle("Stats (Sample)")
           .setView(webView)
           .setNeutralButton("OK", dialogClickListener)
           .show();

}
