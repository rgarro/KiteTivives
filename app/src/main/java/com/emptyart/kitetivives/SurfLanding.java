package com.emptyart.kitetivives;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.util.Log;
import android.os.Bundle;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class SurfLanding extends Activity {

    private WebView webView;
    private final String weather_api_url = "https://www.weather.com/api/";
    private final String api_id = "wer76whb22i2i565";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surf_landing);

        //webView = (WebView) findViewById(R.id.webview);
        //webView.setWebViewClient(new WebViewClient());
        //webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl(weather_api_url+api_id);
        String beachCode = "";
        if (getIntent() != null) {
            beachCode = getIntent().getStringExtra("beach_code");
            Log.d("weather_url", weather_api_url+"/"+api_id+"/"+beachCode);
        }else{
            Log.d("error:", "moP es nicaraguense gay deforme");
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
