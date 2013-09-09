package com.vj.crystallball;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";
	//   
	Button mButton;
	TextView mTextView;
	ImageView mImageView;
	Animation mAnimation;
	Animation mFadein;
	SoundPool mSoundPool;
	int click;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		testLogLevel();
		
		// get instance by ID
//		System.out.println("1-- " + (findViewById(R.id.button1) instanceof Button));
//		System.out.println("3-- " + (findViewById(R.id.button1) instanceof TextView));
//		System.out.println("2-- " + (findViewById(R.id.textView1) instanceof TextView));
		
		mButton = (Button) findViewById(R.id.button1);
		mTextView = (TextView) findViewById(R.id.textView1);
		mImageView = (ImageView) findViewById(R.id.imageView1);
		mAnimation = AnimationUtils.loadAnimation(this, R.anim.zoomin);
		mFadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
		// SOUND POOL MUST INITIAL IN ADVANCE, LIKE HERE
		mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		click = mSoundPool.load(this, R.raw.click, 1);
		
		mButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.v(TAG, "mButton.setOnClickListener onClick");
				String answer = "神奇的水晶球变化";
				mTextView.setText(answer);
				mTextView.startAnimation(mFadein);
				mImageView.startAnimation(mAnimation);
				playSound();
				toast("跳转成功->");
				startAnotherActivity();
			}
		});
	}
	
	private void startAnotherActivity(){
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}
	
	private void testLogLevel() {
		Log.v(TAG, "MainActivity Created.");//verbose
		Log.d(TAG, "MainActivity Created.");//debug
		Log.i(TAG, "MainActivity Created.");//info
		Log.w(TAG, "MainActivity Created.");//warning
		Log.e(TAG, "MainActivity Created.");//error
	}

	// 显示带有-确定、取消-的按钮
	private void showDialog(){
		AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
		mBuilder.setTitle("温馨提示");
		mBuilder.setMessage("确定退出？");
		mBuilder.setPositiveButton("确定", new OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				MainActivity.this.finish();
			}			
		});
		mBuilder.setNegativeButton("取消", new OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}			
		});
		mBuilder.create().show();
	}
	
	@Override
	public void onBackPressed() {
//		super.onBackPressed();
		showDialog();
	}

	private void toast(String content) {
		Toast mToast = Toast.makeText(this, content, Toast.LENGTH_LONG);
		mToast.setGravity(Gravity.CENTER, 0, 0);
		mToast.show();
	}
	
	private void playSound(){
		mSoundPool.play(click, 1, 1, 0, 0, 1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v(TAG, "onDestroy()");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.v(TAG, "onPause()");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.v(TAG, "onRestart()");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.v(TAG, "onResume()");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.v(TAG, "onStart()");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.v(TAG, "onStop()");
	}
	
	

}
