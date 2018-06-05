package hcmute.com.chatmini;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class LoadImageFromURL extends AppCompatActivity {

    TextView tvURL;
    ImageView imgHinh;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image_from_url);
        //ánh xạ
        tvURL =(TextView)findViewById(R.id.tvURL);
        imgHinh=(ImageView)findViewById(R.id.imageViewHinh);
        //get data from MainActivity
        Intent intent=getIntent();
        String url=intent.getStringExtra("url");
        Log.d("BBB",url);

        //hiển thị url
        tvURL.setText(url);
        //Load image từ URL
        Picasso.get().load(url)
                .into(imgHinh, new Callback() {
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError(Exception e) {
            }
        });
    }
}
