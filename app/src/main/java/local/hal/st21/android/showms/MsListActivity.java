package local.hal.st21.android.showms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * 初期画面表示アクティビティクラス。
 * 選択リストを表示する
 */

public class MsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms_list);

        ListView lvMS = findViewById(R.id.lvMS);
        lvMS.setOnItemClickListener(new ListItemClickListener());
    }

    /**
     * リストが選択された時も処理が記述されたメンバクラス
     */
    private class ListItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            String name = (String) parent.getItemAtPosition(position);

            Intent intent = new Intent(MsListActivity.this, ShowMsActivity.class);
            intent.putExtra("selectedPictNo",position);
            intent.putExtra("selectedPictName",name);
            startActivity(intent);
        }
    }
}
