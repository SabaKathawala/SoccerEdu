package edu.uic.skatha2.soccer101;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class VideoActivity extends Activity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        webView = (WebView) findViewById( R.id.web_view );

        String playVideo= "<html><body><iframe src='https://www.youtube.com/embed/0eURHvH-nzA' frameborder='0' scrolling='no' width='350' height='300></iframe></body></html>";
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(playVideo, "text/html", "utf-8");
        //webView.loadUrl("https://www.youtube.com/watch?v=0eURHvH-nzA&feature=youtu.be");


    }
}
//<iframe width="854" height="480" src="https://www.youtube.com/embed/E2ehKfX-BqU" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
//<iframe src='https://gfycat.com/ifr/ChillyNimbleKronosaurus' frameborder='0' scrolling='no' width='480' height='489' allowfullscreen></iframe><p> <a href="https://gfycat.com/gifs/detail/ChillyNimbleKronosaurus">via Gfycat</a></p>