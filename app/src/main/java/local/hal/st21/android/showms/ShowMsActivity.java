package local.hal.st21.android.showms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 第2画面表示用アクティビティクラス。
 * 選択された画像を表示する。
 */

public class ShowMsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_ms);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        int selectedPicNo = 0;
        String selectedPictName = "";

        if (extras != null){
            selectedPicNo = extras.getInt("selectedPictNo");
            selectedPictName = extras.getString("selectedPictName");
        }

        TextView tvName = findViewById(R.id.tvName);
        tvName.setText(selectedPictName);

        ImageView ivSelected = findViewById(R.id.ivSelected);

        switch (selectedPicNo) {
            case 0:
                ivSelected.setImageResource(R.drawable.firstgundam);
                break;
            case 1:
                ivSelected.setImageResource(R.drawable.zgundam);
                break;
            case 2:
                ivSelected.setImageResource(R.drawable.zzgundam);
                break;
            case 3:
                ivSelected.setImageResource(R.drawable.nugundam);
                break;
            case 4:
                ivSelected.setImageResource(R.drawable.ucgundam);
                break;
        }

        Button btBack = findViewById(R.id.btBack);
        btBack.setOnClickListener(new ButtonClickListener());
    }
    /**
     * ボタンがクリックされたときの処理が記述されたメンバクラス。
     */
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v){
            finish();
        }
    }
}
