package kr.co.wikibook.multiple_activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		/* 레이아웃으로 생성한 버튼의 인스턴스를 가져옵니다. */
		Button fa_next_button = (Button) findViewById(R.id.fa_next_button);
		/* 버튼 객체로부터 이벤트를 받기 위해 OnClickListener 리스너를 설정합니다. */
		fa_next_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				/* 버튼이 눌렸을 때 실행될 코드입니다. */
				Log.i("Multi Activity", "Button click is occured..");

				/* 인텐트를 생성한 후에 두 번째 액티비티를 실행합니다. */
				Intent intent = new Intent(FirstActivity.this,
								SecondActivity.class);
				startActivity(intent);
			}
		});

		/* 전화걸기 버튼의 인스턴스를 생성하고 리스너를 할당합니다. */
		Button call_button = (Button) findViewById(R.id.call_button);
		call_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				/* 전화를 걸기 위한 인텐트를 생성합니다. */
				Intent intent = new Intent(Intent.ACTION_CALL);
				/* 전화번호를 Uri 인스턴스로 변환합니다. */
				intent.setData(Uri.parse("tel:01012345678"));
				/* 생성된 인텐트를 사용해 액티비티를 실행합니다. */
				startActivity(intent);
			}
		});
	}
}