package com.tgsakhir.advertisingjambikota;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class R3Peta extends Activity {
	String content;
	String namafile;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);

		content = "file:///android_asset/r3.html";
		WebView wv;

		wv = (WebView) findViewById(R.id.webView1);
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);

		// wv.addJavascriptInterface(new WebAppInterface(this), "Android");

		wv.loadUrl(content);
	}

}
