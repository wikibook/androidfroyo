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

		/* ���̾ƿ����� ������ ��ư�� �ν��Ͻ��� �����ɴϴ�. */
		Button fa_next_button = (Button) findViewById(R.id.fa_next_button);
		/* ��ư ��ü�κ��� �̺�Ʈ�� �ޱ� ���� OnClickListener �����ʸ� �����մϴ�. */
		fa_next_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				/* ��ư�� ������ �� ����� �ڵ��Դϴ�. */
				Log.i("Multi Activity", "Button click is occured..");

				/* ����Ʈ�� ������ �Ŀ� �� ��° ��Ƽ��Ƽ�� �����մϴ�. */
				Intent intent = new Intent(FirstActivity.this,
								SecondActivity.class);
				startActivity(intent);
			}
		});

		/* ��ȭ�ɱ� ��ư�� �ν��Ͻ��� �����ϰ� �����ʸ� �Ҵ��մϴ�. */
		Button call_button = (Button) findViewById(R.id.call_button);
		call_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				/* ��ȭ�� �ɱ� ���� ����Ʈ�� �����մϴ�. */
				Intent intent = new Intent(Intent.ACTION_CALL);
				/* ��ȭ��ȣ�� Uri �ν��Ͻ��� ��ȯ�մϴ�. */
				intent.setData(Uri.parse("tel:01012345678"));
				/* ������ ����Ʈ�� ����� ��Ƽ��Ƽ�� �����մϴ�. */
				startActivity(intent);
			}
		});
	}
}