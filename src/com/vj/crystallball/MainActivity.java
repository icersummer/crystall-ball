package com.vj.crystallball;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

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
				String answer = "神奇的水晶球变化";
				mTextView.setText(answer);
				mTextView.startAnimation(mFadein);
				mImageView.startAnimation(mAnimation);
				playSound();
			}
		});
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

}
