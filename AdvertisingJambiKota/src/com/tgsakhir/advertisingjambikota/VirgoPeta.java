package com.tgsakhir.advertisingjambikota;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class VirgoPeta extends Activity {

	String contentv;
	String namafile;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);

		contentv = "file:///android_asset/virgo.html";
		WebView wv1;

		wv1 = (WebView) findViewById(R.id.webView1);
		WebSettings webSettings = wv1.getSettings();
		webSettings.setJavaScriptEnabled(true);

		// wv.addJavascriptInterface(new WebAppInterface(this), "Android");

		wv1.loadUrl(contentv);
	}

}
