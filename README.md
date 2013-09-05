crystall-ball

Android App

来源于粉笔网Android教学，http://www.fenby.com/learn/courseExercises/29#

$git push git@github.com:icersummer/crystall-ball master

=============

Android高级控件
===============

使用LinearLayout布局
-------------------

1- LinearLayout的布局方式（线性布局）

2- LinearLayout是一个视图组，组中的所有控件都只能以一种方向进行排列（垂直或者水平）

3- 通过weight调整LinearLayout的边界值

4- 在所有屏幕（不同分辨率）下预览显示效果

文字添加动画效果


音频介绍
--------
Android平台中音频播放主要有以下两种方式：

1- SoundPool声音池：适合短促且对反应速度比较高的情况（游戏音效或按键声等）

2- MediaPlayer媒体播放器：适合比较长且对反应速度要求不高的的情况（音乐等）

添加音效
--------

1- 在res资源文件夹下创建raw目录，用于保存音效文件click.mp3

2- 创建SoundPool对象引用

3- 创建playSound私有方法，在方法体中通过load方法调用资源文件然后再调用play方法

4- 注意：SoundPool对象的初始化工作必须在onCreate方法中完成

5- 全部完成后在onClick事件中调用playSound方法

Toast信息
--------
1- Toast是类似Dialog的一种提示信息框

2- 创建toast私有方法，在其中调用Toast.makeText().show()方法显示Toast

3- 将提示信息设置为”这是一个Toast提示“并传给已创建的toast方法

4- 通过Toast对象的setGravity设置显示的坐标