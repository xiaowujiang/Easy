# EasyUtils
 
包含一些常用的工具类

* CrashHandler android程序崩溃日志记录类

* LogUtil android 日志记录类，可根据日志level控制日志输出

* DisplayUtil 显示参数工具类

* CollectionUtil 集合操作类

* ToastUtil 吐司工具类

* PermissionsHelper 简单的权限封装

* CustomProgressDialog 自定义dialog

* TitleView 自定义titleView对ToolBar进行封装

* NoticeAngle 角标View

* PinnedHeaderExpandableListView及其Adapter

使用方式：

在Application中，初始化

	E.init(Context context);
	
	
Gradle:

* jcenter:

    	compile 'com.bncggle:easyutil:last.version'

* JitPack 

        allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
        
        
        compile 'com.github.xiaowujiang:EasyUtils:releases'
