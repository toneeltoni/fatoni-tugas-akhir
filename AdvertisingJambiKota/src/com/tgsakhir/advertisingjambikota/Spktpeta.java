package com.tgsakhir.advertisingjambikota;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class Spktpeta extends Activity {

	String content;
	String namafile;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);

		content = "file:///android_asset/sepakat.html";
		WebView wv;

		wv = (WebView) findViewById(R.id.webView1);
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);

		// wv.addJavascriptInterface(new WebAppInterface(this), "Android");

		wv.loadUrl(content);
	}

}
