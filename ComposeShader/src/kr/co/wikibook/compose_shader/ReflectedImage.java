package kr.co.wikibook.compose_shader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class ReflectedImage extends View {

  Context mContext;

  public ReflectedImage(Context context) {
    super(context);
    mContext = context;
  }

  @Override
  public void onDraw(Canvas canvas) {
    Paint paint = new Paint();

    Bitmap bitmap = BitmapFactory.decodeResource(mContext.getResources(),
        R.drawable.pattern);

    /*
     * ComposeShader cs = new ComposeShader(lg, sg, new
     * PorterDuffXfermode(PorterDuff.Mode.DARKEN));
     */

    paint.setShader(cs);
    canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), paint);
  }
}
