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

图片添加动画效果
-----------------

1- 在资源目录res下创建anim文件夹，该目录用于保存Android XML文件

2- 在动画文件zoomin.xml设置坐标、动画时长等信息

3- 在源代码中创建ImageView和Animation对象引用

4- 通过AnimationUtil的loadAnimation方法获取Animation对象

5- 在onClick事件中通过ImageView对象引用启动动画效果

文字添加动画效果
-----------------

1- 在res/anim目录下创建fadein.xml文件，Root Element选择alpha

2- 将fromAlpha设置为0（全透明），toAlpha设置为1（不透明）

3- 将动画时长duration设置为2000毫秒

4- 声明一个Animation对象引用，并通过loadAnimation加载fadein资源文件

5- 在onClick事件中调用TextView的startAnimation方法

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

Debug Android App in Eclipse
----------------------------
1- 断点调试

2- 异常捕捉

3- LogCat中会显示ERROR信息，此处为ClassCastException

4- 在LogCat中双击错误行可以直接高亮显示出错误的代码片段

四大组件及Intent
----------------
1- Android的四个主要组件：Activity、Service、Broadcast Receiver和Content Provider

2- 组件之间的数据传递靠Intent来实现

3- 课程中我们通过Intent实现两个Activity之间的跳转

4- 在ApplicationManifest.xml中添加第二个Activity的定义

5- 通过layout为第二Activity创建UI界面

6- 通过Intent的startActivity实现了Activity之间的跳转

Activity生命周期
----------------
1- Activity的生命周期是指从启动到销毁的过程

2- 对应的方法是onCreate和onDestroy这两个方法

3- 当发生界面切换时会涉及两对方法，为别为onResume/onPause和onStart/onStop