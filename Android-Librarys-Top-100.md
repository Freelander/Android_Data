<p align="center">
  <b>Special thanks to the generous sponsorship by:</b>
  <br><br>
  <a href="https://www.yousails.com">
    <img src="https://yousails.com/banners/brand.png" width=350>
  </a>
</p>

# GitHub Android Libraries Top 100 简介

本项目主要对目前 GitHub 上排名前 100 的 Android 开源库进行简单的介绍, 至于排名完全是根据 GitHub 搜索 Java 语言选择 (Best Match) 得到的结果, 然后过滤了跟 Android 不相关的项目, 所以排名并不具备任何官方效力, 仅供参考学习, 方便初学者快速了解当前一些流行的 Android 开源库.

> iOS 版本的在此: https://github.com/Aufree/trip-to-iOS/blob/master/Top-100.md

>感谢 [@GitHubDaily](http://weibo.com/GitHubDaily) 与 [@Android 开发日常](http://weibo.com/AndroidDevDaily) 的大力支持, 以及 [@stormzhang](https://github.com/stormzhang) 的指点

**若有任何疑问可通过[邮件](mailto:huanggaojun13@gmail.com)或[微博](http://weibo.com/gaojunhuang)联系我**

项目名称 | 项目简介
---------|---------
1.[react-native](https://github.com/facebook/react-native) | 这个是 Facebook 在 React.js Conf 2015 大会上推出的基于 JavaScript 的开源框架 React Native, 该框架结合了 Web 应用和 Native 应用的优势, 可以使用 JavaScript 来开发 iOS 和 Android 原生应用
2.[Android-Universal-Image-Loader](https://github.com/nostra13/Android-Universal-Image-Loader) | ImageLoader 是最早开源的 Android 图片缓存库, 强大的缓存机制, 早期被广泛 Android 应用使用, 至今仍然有很多 Android 开发者在使用
3.[RxJava](https://github.com/ReactiveX/RxJava) | RxJava 是一个在 Java VM 上使用可观测的序列来组成异步的, 基于事件的程序的库, 简单来说它就是一个实现异步操作的库, RxJava 的优点在于一个词 "简洁", 使用它就算你程序逻辑有多么复杂, 它依然能够保持简洁易懂
4.[retrofit](https://github.com/square/retrofit) | Retrofit 是 Square 公司出品的 HTTP 请求库, 同时是 Square 是最早开源项目之一, Retrofit 是目前 Android 最流行的 Http Client 库之一, 目前版本是 Retrofit2.0 Beta4, 越来越多 Android 开发者开始使用这个请求库了
5.[okhttp](https://github.com/square/okhttp) | OkHttp 是 Square 公司出品的 HTTP 另一个请求库, Google 不推荐人们使用 HttpClient, 可是 HttpURLConnection 实在是太难用了, 因此很多人使用了 OkHttp 来解决这问题, 据说 Android4.4 的源码中可以看到 HttpURLConnection 已经替换成 OkHttp 实现呢
6.[SlidingMenu(不建议使用)](https://github.com/jfeinstein10/SlidingMenu) | 一个侧滑菜单开源库, 在 Google 自己原生态的侧滑菜单 NavigationDrawer 没有出现之前, 这个库就已经被广泛使用, 可是到现在这个库已经被放弃了
7.[picasso](https://github.com/square/picasso) | Picasso 是 Square 公司出品的一款图片缓存库, 主导者是 JakeWharton 大神
8.[android-best-practices](https://github.com/futurice/android-best-practices) | Android 开发最佳实践, 里面所介绍的经验都是来自于 Futurice 公司 Android 开发者, 介绍内容有 Android 开发规范, 架构, 布局技巧, 以及使用一些有助于快速开发相关工具等等, 非常适合新手去学习
9.[EventBus](https://github.com/greenrobot/EventBus) | EventBus 是 Android 事件管理总线, 使用它可以替带 Android BroadCast, BroadCastReceiver, Handler 在 Activity, Fragment, Service, 线程之间传递消息, 大大简化了事件传递逻辑
10.[android-async-http](https://github.com/loopj/android-async-http) | Android-Async-Http 是 Android 一款老牌异步请求库, 专门对 Android 在 Apache 的 HttpClient 基础上构建的异步 http 连接, 该库有很多特征, 例如: 库的 size 小, 支持文件上传不需使用第三方库支持, 内部使用线程池来处理并发, 等等
11.[fresco](https://github.com/facebook/fresco) | Fresco 是 FaceBook 公司出品的一款图片缓存库, Fresco 是一个强大的图片加载组件, 支持加载 Gif 图和 WebP 格式, 支持 Android2.3(API level 9) 及其以上系统, Fresco 中设计了 Image pipeline 和 Drawees 两个模块各施其职, 使得图片完美加载出来, 想知道更多 image pipeline 和 Drawees 有关于它的特性, 可以到它[官方平台](http://fresco-cn.org/)看介绍
12.[zxing](https://github.com/zxing/zxing) | ZXing 是二维码领域中名气最大的开源项目, 它提供了多个平台的二维码/条形码扫描解决方案, 拥有扫描快, 识别率高, 使用简单等特点
13.[leakcanary](https://github.com/square/leakcanary) | LeakCanary 是 Square 公司出的一款检测内存泄露工具, 该工具能帮助你在开发阶段方便的检测出内存泄露的问题, 使用起来非常简单方便
14.[butterknife](https://github.com/JakeWharton/butterknife) | 由 JakeWharton 大神开发出来的, ButterKnife 是 View 注入框架, 使用它为了简写很多 findViewById 代码, 同时还支持 View 的一些事件处理函数
15.[MPAndroidChart](https://github.com/PhilJay/MPAndroidChart) | MPAndroidChart 是一款强大的 Android 图表库, 支持各种各样图表显示, 能想到的图表样式这里几乎都有, 图表还支持选择, 拖放和缩放动画效果
16.[ActionBarSherlock (不建议使用)](https://github.com/JakeWharton/ActionBarSherlock) |  ActionBarSherlock 这个库是 JakeWharton 大神开发出来支持 Android3.0 以下版本的, 后来慢慢的 Google 也提供了 AppCompat 库来支持 Android3.0 以下版本使用 ActionBar, 因此作者不建议我们再使用这个库了
17.[androidannotations](https://github.com/excilys/androidannotations) | AndroidAnnotations 是一个能够让你快速进行 Android 开发的开源框架, 它能让你专注于真正重要的地方, 使代码更加精简, 使项目更加容易维护, 它的目标就是 "Fast Android Development.Easy maintainance"
18.[ViewPagerIndicator](https://github.com/JakeWharton/ViewPagerIndicator) | 由 JakeWharton 大神开发出来的一个 ViewPager 指示器, 使用起来简单方便, 可高度定制, 开发出各种各样动画效果
19.[glide](https://github.com/bumptech/glide) | Glide 是 Google 员工的开源项目, 广泛应用于 Google 一些 App 上, 在2014年 Google I/O 大会上被推荐使用, Glide 和 Picasso 被人拿来比较研究过, Glide 与 Picasso 有 90% 的相似度, 但在一些细节上还是有点区别的, 各有各优缺点看君选择
20.[HomeMirror](https://github.com/HannahMitt/HomeMirror) | 开发者是由一名程序媛 Hannah Mittelstaedt , HomeMirror 是一款 Android 镜子应用, 目前它能实现日期, 时间, 天气, 生日信息, 事件提醒器, 骑车天气的推荐, 股票信息, XKCD 漫画网站的新帖等等
21.[Android-PullToRefresh(不建议使用)](https://github.com/chrisbanes/Android-PullToRefresh) | 一个强大的拉动刷新开源项目, 支持各种控件下拉刷新, ListView, ViewPager, WebView, ExpandableListView, GridView, ScrollView, Horizontal ScrollView, Fragment 上下左右拉动刷新, 不过现在这个项目已经停止维护更新了, 推荐使用 [Android-Ultra-Pull-To-Refresh](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh)
22.[MaterialDesignLibrary](https://github.com/navasmdc/MaterialDesignLibrary) | 这个库控件都是遵循了 Google Material Design 设计规范开发出来, 例如有: Flat Button, Rectangle Button, CheckBox, Switch, Progress bar circular indeterminate 等等
23.[PhotoView](https://github.com/chrisbanes/PhotoView) | PhotoView 是 ImageView 的子类, 支持所有 ImageView 的源生行为, 例如: 支持 Pinch 手势自由缩放, 支持双击放大/还原, 支持平滑滚动等等, 并且非常方便的与 ImageLoader/Picasso 之类的网络图片读取库集成使用, 还方便的与 ViewPager 等同样支持滑动手势的控件集成
24.[RxAndroid](https://github.com/ReactiveX/RxAndroid) | 由 JakeWharton 大神主导开发的项目, RxAndroid 是 RxJava 的一个针对 Android 平台的扩展, 主要用于 Android 开发
25.[material-dialogs](https://github.com/afollestad/material-dialogs) | Material Dialogs 是一个可高度定制易用, 符合 Material Design 风格的 Dialogs, 兼容 Android API8 以上版本, 个人使用感觉它完全可替代 Android 原生那个, 比原生那个更加简单易用
26.[Android-ObservableScrollView](https://github.com/ksoichiro/Android-ObservableScrollView) | ObservableScrollView 是一款用于在滚动视图中观测滚动事件的 Android 库, 它能够轻而易举地与 Android 5.0 Lollipop 引进的工具栏 (Toolbar) 进行交互, 还可以帮助开发者实现拥有 Material Design 应用视觉体验的界面外观, 支持ListView, ScrollView, WebView, RecyclerView, GridView组件
27.[Android-Bootstrap](https://github.com/Bearded-Hen/Android-Bootstrap) | Android 版的 Bootstrap, 利用这个库能够实现很多 Bootstrap 样式风格, 之前有学过 Html 的人就知道 Bootstrap 是什么玩意啦
28.[AndroidSwipeLayout](https://github.com/daimajia/AndroidSwipeLayout) | 开发者是代码家, AndroidSwipeLayout 是一个支持ListView, GridView, ViewGroup等等左右上下滑动出操作菜单, 类似 qq 消息列表向左滑动显示出多某条信息的操作菜单
29.[dagger](https://github.com/square/dagger) | Dagger 是 Square 公司出品的一个针对 Android 和 Java 的快速依赖注入器, 能够有效减少你敲代码量
30.[ListViewAnimations](https://github.com/nhaarman/ListViewAnimations) | 一个轻轻松松给 Android ListView 添加动画效果的库, 支持的动画有: Alpha, SwingRightIn, SwingLeftIn, SwingBottomIn, SwingRightIn and ScaleIn等等, 使用它能很容易就实现帅爆的效果
31.[PagerSlidingTabStrip(不建议使用)](https://github.com/astuetz/PagerSlidingTabStrip) | PagerSlidingTabStrip 是一个给 Android ViewPager添加上 ViewPager 滑动指示器, 从 GitHub 上面看, 这个库似乎没有人在维护了, 因此不建议使用, 可使用 [SmartTabLayout](https://github.com/ogaclejapan/SmartTabLayout) 来代替
32.[AndroidViewAnimations](https://github.com/daimajia/AndroidViewAnimations) | 开发者是代码家, 这个库实现很多很酷炫的 Android 动画, 动画效果是借鉴 Animate.css 来实现的, 非常酷, 而且这个使用起来也是非常简单
33.[AndroidSlidingUpPanel](https://github.com/umano/AndroidSlidingUpPanel) | AndroidSlidingUpPanel 是一个上拉面板, 就是向上滑动的时候往上飞出一个显示面板控件, 该库效果在 Google Music, Google Maps and Rdio等 App 应用到
34.[MaterialDrawer](https://github.com/mikepenz/MaterialDrawer) | MaterialDrawer 是一个类似 Google 官方 NavigationView 侧滑显示控件, 个人认为 NavigationView 并没有 MaterialDrawer 实用, 因为 NavigationView 自由度不是很好, 很多都写死了不可以自由定义布局, 而 MaterialDrawer 能够实现跟 NavigationView 一样的效果, 同时还支持自定义效果, 自由度非常高
35.[Material-Animations](https://github.com/lgvalle/Material-Animations) | Material-Animations 是一个很好过渡动画库, 可以应用于 Activity 与 Activity 之间的跳转, Fragment 与 Fragment 之间的跳转, 以及各个 View 变化前后的过渡动画
36.[MaterialViewPager](https://github.com/florent37/MaterialViewPager) | 一个简单易用 Material Design 风格的 ViewPager 库
37.[ion](https://github.com/koush/ion) | ion 是一个让 Android 的网络操作变得极其简单, 支持异步获取和处理JSON, 支持 Android 文件下载 (同时支持下载进度条绑定), 支持安全链接和代理
38.[stetho](https://github.com/facebook/stetho) | Stetho是 Facebook 出品的一个强大的 Android 调试工具,使用该工具你可以在 Chrome Developer Tools查看App的布局, 网络请求(仅限使用Volley, okhttp的网络请求库), sqlite, preference, 一切都是可视化的操作,无须自己在去使用adb, 也不需要root你的设备
39.[fastjson](https://github.com/alibaba/fastjson) | Fastjson 是一个 Java 语言编写的高性能功能完善的 JSON 库. 它采用一种“假定有序快速匹配”的算法, 把 JSON Parse的性能提升到极致, 是目前Java语言中最快的JSON库. Fastjson接口简单易用, 已经被广泛使用在缓存序列化, 协议交互, Web输出, Android客户端等多种应用场景
40.[cardslib (不建议使用)](https://github.com/gabrielemariotti/cardslib) | Cardslib 是早期由 Gabriele Mariotti 开发的一个为开发者方便实现各种 Card UI 的 Android 开源代码库, 后来 Google 官方提供自己封装了 CardView 在 v7 包下, 使用 Google 官方的可以完全替代了这个库, 因此这个也被弃用了
41.[Android-Ultra-Pull-To-Refresh](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh) | 开发者是廖祜秋, 这个是一个非常强大的下拉刷新库, 继承 ViewGroup 可以包含任何 View, 功能甚至比 SwipeRefreshLayout 强大, 使用起来也非常容易, 还可以自由定制自己的 UI 样式
42.[greenDAO](https://github.com/greenrobot/greenDAO) | greenDAO 是一个可以帮助 Android 开发者快速将 Java 对象映射到 SQLite 数据库的表单中的 ORM解决方案, 通过使用一个简单的面向对象 API, 开发者可以对 Java 对象进行存储, 更新, 删除和查询, greenDAO 相对 OrmLite, AndrORM 这两个 ORM 开源库, 性能是最高的
43.[AndroidStaggeredGrid](https://github.com/etsy/AndroidStaggeredGrid) | AndroidStaggeredGrid 是一个支持多列并且每一行的 item 大小不一, 交错排列的 GridView, 就是实现瀑布流样式效果, 目前该库已经被弃用了, 开发者建议我们使用 Google 官方控件 RecyleView 中的 StaggeredGridLayoutManager 布局来实现瀑布流效果
44.[otto](https://github.com/square/otto) | Otto 是 Square 公司出的一个事件库 (pub/sub 模式), 用来简化应用程序组件之间的通讯, otto 修改自 Google 的 Guava 库, 专门为 Android 平台进行了优化, 与上面介绍的 EventBus 相比, 两个库各有各的优点, 完全取决于我们自己项目的需求来选择它们哪一个
45.[xUtils](https://github.com/wyouflf/xUtils) | xUtils 是一个快速开发框架, 里面包含 DbUtils, ViewUtils, HttpUtils, BitmapUtils 四大模块, 可用于快速开发, 支持大文件上传, 拥有更加灵活的 ORM, 最低兼容 Android 2.2
46.[realm-java](https://github.com/realm/realm-java) | Realm 一个轻量的 Android 版本的数据存储库, 比 Android 原生系统的 SQLite 更加简洁快速对数据进行操作
47.[Android-CleanArchitecture](https://github.com/android10/Android-CleanArchitecture) | CleanArchitecture 是一个非常典型使用 MVP 架构的项目, 大家如果还没有理解 MVP 架构的可以看看这个项目
48.[StickyListHeaders](https://github.com/emilsjolander/StickyListHeaders) | StickyListHeaders 是一个实现能够固定在屏幕顶部的ListView Section Header库, 就是当前 section 的 header 固定在屏幕顶部, 当滑动到其他 section 时, 其他 section 的 header 会代替之前的 section 的 header, 固定到屏幕顶部, 类似于 Android4.0 的手机通讯录的效果
49.[AppIntro](https://github.com/PaoloRotolo/AppIntro) | AppIntro 是一个让人轻松快速搭建漂亮酷炫的引导页库
50.[ActiveAndroid](https://github.com/pardom/ActiveAndroid) | ActiveAndroid 是采用Rails中的 [Active Record](http://en.wikipedia.org/wiki/Object-relational_mapping)架构模式设计的适用于 Android 平台的轻量级 ORM 架构, 几乎可以不用写任何 SQL 代码实现快速开发
51.[android-volley](https://github.com/mcxiaoke/android-volley) | Volley 是谷歌官方开发团队在 2013 年 Google I/O 大会推出的一个新的网络通信框架, 这个框架把 AsyncHttpClient 和 Universal-Image-Loader 的优点集于了一身,既可以像AsyncHttpClient 一样非常简单地进行 HTTP 通信,也可以像 Universal-Image-Loader 一样轻松加载网络上的图片, 这个库并不是官方的, 只是托管同步在 Maven,  官方只提供的 Jar 包
52.[twoway-view](https://github.com/lucasr/twoway-view) | TwoWayView 是简化 RecyclerView 开发的一个库, 可以在其 Base LayoutManager 基础上构建各种各样的布局, 该库内置了几个常用布局 List, Grid, Staggered Grid,Spannable Grid
53.[ShowcaseView](https://github.com/amlcurran/ShowcaseView) | ShowcaseView 是一个非常适合用于对用户进行第一次使用进行指导的库,使用起来非常简单还可以自定义样式
54.[Calligraphy](https://github.com/chrisjenx/Calligraphy) | Calligraphy 是一个用来简化 Android 应用使用自定义字体的类库, 该类库会自动查找应用中的 TextView 并设置其使用的字体
55.[NineOldAndroids](https://github.com/JakeWharton/NineOldAndroids) | NineOldAndroids 由 JakeWharton 大神开发的一个向下兼容的动画库, 主要是使低于API 11的系统也能够使用 View 的属性动画, 不过现在 JakeWharton 大神已经不推荐使用该库, 而是推荐我们使用官方封装在 Support 库里面的动画
56.[android-floating-action-button](https://github.com/futuresimple/android-floating-action-button) | FloatingActionButton 是一个悬浮操作按钮, 官方在 Support Design 包下也有封装一个类似这个库效果的 FloatingActionButton, 值得说明的是这个库是早在官方封装之前就存在的, 个人感觉这个库比官方那个更加好用
57.[CircleImageView](https://github.com/hdodenhof/CircleImageView) | CircleImageView 是一个轻松帮你实现圆形效果 ImageView 图片库, CircleImageView 是基于 ImageView 扩展出来, 因此它拥有 ImageView 控件所有属性, 简单易用值得你使用的库
58.[material](https://github.com/rey5137/material) | Material 是将 Material Design 风格控件封装在该库当中, 目前封装有Progress, Button, Switch, Slider, Spinner, Text Field, TabPageIndicator, SnackBar, Dialog, BottomSheetDialog, Dynamic theme
59.[ActionBar-PullToRefresh](https://github.com/chrisbanes/ActionBar-PullToRefresh) | ActionBar-PullToRefresh 是一个下拉刷新, 下拉刷新时在 ActionBar 出现加载中提示的库
60.[FloatingActionButton](https://github.com/makovkastar/FloatingActionButton) | 又一个悬浮操作按钮库, 该库添加支持监听滑滚动事件, 当向下滑时按钮隐藏, 向上滑时按钮显示, 还有动画效果, 支持监听 ListView, ScrollView, RecylerView
61.[AndroidAsync](https://github.com/koush/AndroidAsync) | AndroidAsync 是一款基于 NIO 的低端 Android 异步 socket, http (client+server), websocket 和 socket.io 网络通信协议类库
62.[rebound](https://github.com/facebook/rebound) | Rebound 是 Facebook 推出的一个弹性动画库, 可以让动画看起来真实自然, 像真实世界的物理运动, 带有力的效果, 使用的参数则是 Facebook 的 origami 中使用的
63.[android-common](https://github.com/Trinea/android-common) | android-common-lib 是 Trinea 大神收集的一些开发通用的缓存, 公共 View 以及一些常用工具类
64.[RippleEffect](https://github.com/traex/RippleEffect) | RippleEffect 是一个实现在 Android 任何组件点击出现 Material Design 的波纹效果, 向下兼容到 Android API9
65.[SmoothProgressBar](https://github.com/castorflex/SmoothProgressBar) | SmoothProgressBar 是一个帮你的 App 方便实现可定制, 平滑动画的水平滚动进度条库
66.[recyclerview-animators](https://github.com/wasabeef/recyclerview-animators) | RecyclerView Animators 是一个对 Recycler 控件的 Item 添加以及删除增加动画效果, 动画效果有Scale, Fade, Flip, Slide 里面各种各样效果
67.[circular-progress-button](https://github.com/dmytrodanylyk/circular-progress-button) | 一个带进度显示的 Button, 效果和动画做的都非常赞
68.[DroidPlugin](https://github.com/Qihoo360/DroidPlugin) | DroidPlugin 是 360 手机助手在 Android 系统上实现了一种新的插件机制: 它可以在无需安装, 修改的情况下运行APK文件, 此机制对改进大型APP的架构, 实现多团队协作开发具有一定的好处
69.[dynamic-load-apk](https://github.com/singwhatiwanna/dynamic-load-apk) | 开发者是 singwhatiwanna(任玉刚), 是《Android 开发艺术探索》书籍的作者, 这个是作者联合另两位开发者啸(时之沙)和宋思宇花了几个月时间研究出来的 Apk 动态加载框架, 想了解更多关于这框架可到作者博客看 [这篇文章](http://blog.csdn.net/singwhatiwanna/article/details/39937639) 有详细介绍
70.[ExoPlayer](https://github.com/google/ExoPlayer) | ExoPlayer 是Google 开发团队开源出来的一个媒体播放库, 比 Android 框架原生的 MediaPlayer 拥有更多优点支持动态的自适应流 HTTP(DASH) 和 平滑流, 支持高级的HLS特性, 支持自定义和扩治你的使用场景等等
71.[Crouton (不建议使用)](https://github.com/keyboardsurfer/Crouton) | Crouton 是一个显示提示信息的显示工具类, 可以用来代替 Toast, 默认显示在窗口的顶部, 可以按队列一个接着一个显示, 不过该库已经被弃用, 不推荐使用
72.[robospice](https://github.com/stephanenicolas/robospice) | RoboSpice 是一个使你建立异步的长时间的运行任务异常轻松的一个网络库，在网络请求，缓存支持，和提供开箱即用的 rest 请求方面尤为强大
73.[hugo](https://github.com/JakeWharton/hugo) | Hugo 是 JakeWharton 大神推出的一个用于打印 Log, hugo 是基于注解被调用的, 引入相关依赖后, 在方法上加上 @DebugLog 即可输出 Log, 使用非常简单
74.[async-http-client](https://github.com/AsyncHttpClient/async-http-client) | AsyncHttpClient 是又一款 Android 异步请求库, 该库支持 WebSocket 协议, 使用起来也比较简单易用
75.[UltimateRecyclerView](https://github.com/cymcsg/UltimateRecyclerView) | UltimateRecyclerView 是一个功能强大的 RecyclerView(advanced and flexible version of ListView), 包括了下拉刷新, 加载更多, 多种动画, 空数据提示, 拖动排序, 视差处理, 工具栏渐变, 滑动删除, 自定义floating button, 多种刷新效果, scrollbar, sticky header, 多 layout 支持等等元素, 而且使用起来跟 RecyclerView 一样的方便
76.[MaterialEditText](https://github.com/rengwuxian/MaterialEditText) | MaterialEditText 是就职于 Flipboard 的员工 [扔物线](https://www.zhihu.com/people/rengwuxian) 开发的, 在 AppCompat v21 中也提供了 Material Design 的控件 EditText, 可是由于比较难用, 没有提供设置颜色的 Api, 于是就产生这个第三方库
77.[Side-Menu.Android](https://github.com/Yalantis/Side-Menu.Android) | Side Menu 是 [Yalantis](https://yalantis.com/) 组织开源出来, 该组织因开源出一些动画很棒的开源库为大家所熟知该库是其中一个, 该库是提供翻页动画效果的侧边菜单, 动画体验超赞的
78.[drag-sort-listview](https://github.com/bauerca/drag-sort-listview) | DragSortListView 是一个可以实现拖动排序, 滑动删除的 listview 控件, 注意的是作者对该库已经放弃维护更新了, 不过感兴趣的人可以去研究一下
79.[android-times-square](https://github.com/square/android-times-square) | TimesSquare 是 Square 公司出品的一款显示日历选择日期的控件, 可以让用户选择多个日期
80.[GreenDroid(不建议使用)](https://github.com/cyrilmottier/GreenDroid) | GreenDroid 是一个封装好的 Android UI 界面库, 不过该库已经被弃用了, 不建议使用
81.[logger](https://github.com/orhanobut/logger) | Logger 是一个简单, 漂亮, 强大 Android 打印日志库
82.[acra](https://github.com/ACRA/acra) | Acra 是一个能够让 Android 应用自动将崩溃报告以谷歌文档电子表的形式进行发送的库, 旨在当应用发生崩溃或出现错误行为时, 开发者可以获取到相关数据
83.[FadingActionBar](https://github.com/ManuelPeinado/FadingActionBar) | FadingActionBar 是一个支持 ListView, ScrollView, WebView 向下滚动时逐渐显示 ActionBar 库
84.[AndroidImageSlider](https://github.com/daimajia/AndroidImageSlider) | AndroidImageSlider 库开发者是代码家, 该库是为 Banner 图片滑动提供多种动画效果, 还可以轻易为 Banner 加载网络图片
85.[SystemBarTint](https://github.com/jgilfelt/SystemBarTint) | SystemBarTint 是一个实现沉浸式状态栏库, 适用于 Android 系统 4.4 其以上的版本
86.[android-menudrawer](https://github.com/SimonVT/android-menudrawer) | MenuDrawer 是一款滑出式菜单库, 通过拖动屏幕边缘滑出菜单, 支持屏幕上下左右划出, 支持当前 View 处于上下层, 支持 Windows 边缘, ListView 边缘, ViewPager 变化划出菜单等
87.[RoundedImageView](https://github.com/vinc3m1/RoundedImageView) | RoundedImageView 一个快速支持图片圆角显示效果的库, 该库特点是能快速加载, 为了提高加载速度, 该库不用创建原始位图的副本, 不使用 clipPath, 不使用 setXfermode 裁剪的位图等方式来实现 ImageView 圆角, 使用也非常简单
88.[afinal](https://github.com/yangfuhai/afinal) | Afinal 是一个 android 的 sqlite orm 和 ioc 框架, 同时封装了 android 中的 http 框架, 使其更加简单易用, 使用 finalBitmap, 无需考虑 bitmap 在 android 中加载的时候 oom 的问题和快速滑动的时候图片加载位置错位等问题, Afinal 的宗旨是简洁, 快速, 约定大于配置的方式, 尽量一行代码完成所有事情
89.[android-pulltorefresh(不建议使用)](https://github.com/johannilsson/android-pulltorefresh) | 另一个下拉刷新库, 但是该库已经停止维护, 因此不建议使用, 推荐使用 [Android-Ultra-Pull-To-Refresh](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh)
90.[Bolts-Android](https://github.com/BoltsFramework/Bolts-Android) | Bolts 是一款底层类库集合, 在后台实现异步操作, 并提供接口反馈当前异步执行的程度 (可以通过接口实现UI进度更新), 最后反馈执行的结果给UI主线程, 与AsyncTask比较: (1)使用的是无大小限制的线程池; (2)任务可组合可级联,防止了代码耦合
91.[NumberProgressBar](https://github.com/daimajia/NumberProgressBar) | NumberProgressBar 开发者是代码家, 这是一个带简约性感数字显示的进度条库, 使用非常简单方便
92.[SwipeBackLayout](https://github.com/ikew0ng/SwipeBackLayout) | SwipeBackLayout 是一个支持屏幕上下左右滑动返回上层 Activity, 关闭当前 Activity, 类似简书 App
93.[android-gif-drawable](https://github.com/koral--/android-gif-drawable) | 一个支持 gif 显示的 view, 用 jni 实现的, 编译生成 so 库后直接 xml 定义 view 即可, 简单易用
94.[VitamioBundle](https://github.com/yixia/VitamioBundle) | Vitamio 是一款 Android 与 iOS 平台上的全能多媒体开发框架, 特点：(1) 全面支持硬件解码与 GPU 渲染, (2) 能够流畅播放 720P 甚至 1080P 高清 MKV, FLV, MP4, MOV, TS, RMVB 等常见格式的视频, (3) 在 Android 与 iOS 上跨平台支持 MMS, RTSP, RTMP, HLS(m3u8)等常见的多种视频流媒体协议, 包括点播与直播
95.[SmartTabLayout](https://github.com/ogaclejapan/SmartTabLayout) | SmartTabLayout 是一个自定义的 Tab title strip, 基于 Google Samples 中的 android-SlidingTabBasic 项目, 滑动时 Indicator 可平滑过渡
96.[uCrop](https://github.com/Yalantis/uCrop) | uCrop 是[Yalantis](https://yalantis.com/) 组织开源的图片裁剪库, 支持缩放, 旋转图片, 支持各种比例的裁剪框, 非常强大的一个图片裁剪库
97.[android-crop](https://github.com/jdamcd/android-crop) | 又一个图片裁剪库, 向下兼容到 Api 10, 个人感觉这个库并没有比上面介绍的 uCrop 强大
98.[HoloEveryWhere](https://github.com/Prototik/HoloEverywhere) | HoloEveryWhere 是一套 Android 开发库, 提供了全套 Holo Style 控件, 它的外观与功能和标准 Holo Style 控件基本相同, 唯一不同的是它可以运行在低于 4.0 版本的 Android 系统上
99.[AVLoadingIndicatorView](https://github.com/81813780/AVLoadingIndicatorView) | AVLoadingIndicatorView 库含有各种各样漂亮的加载动画效果, 使用起来也非常简单, 和平时使用 ProgressBar 一样
00.[sweet-alert-dialog](https://github.com/pedant/sweet-alert-dialog) | Android 版的 SweetAlert, 清新文艺, 快意灵动的甜心弹框, 灵感来源于 JS 版 [SweetAlert](http://t4t5.github.io/sweetalert/)

## 粗计

#### Square 公司占有 7 席

项目名称 | 排名
---------|--------
[Retrofit](https://github.com/square/retrofit) | 4
[OkHttp](https://github.com/square/okhttp) | 5
[Picasso](https://github.com/square/picasso) | 7
[LeakCanary](https://github.com/square/leakcanary) | 13
[Dagger](https://github.com/square/dagger) | 29
[Otto](https://github.com/square/otto) | 44
[TimesSquare](https://github.com/square/android-times-square) | 79

#### FaceBook 公司占有 4 席

项目名称 | 排名
---------|--------
[React Native](https://github.com/facebook/react-native) | 1
[Fresco](https://github.com/facebook/fresco) | 11
[Stetho](https://github.com/facebook/stetho) | 38
[Rebound](https://github.com/facebook/rebound) | 62

#### JakeWharton 大神占有 5 席

项目名称 | 排名
---------|--------
[Butter Knife](https://github.com/JakeWharton/butterknife) | 14
[ActionBarSherlock](https://github.com/JakeWharton/ActionBarSherlock) | 16
[ViewPagerIndicator](https://github.com/JakeWharton/ViewPagerIndicator) | 18
[NineOldAndroids](https://github.com/JakeWharton/NineOldAndroids) | 55
[Hugo](https://github.com/JakeWharton/hugo) | 73

#### 代码家大神占有 4 席

项目名称 | 排名
---------|--------
[AndroidSwipeLayout](https://github.com/daimajia/AndroidSwipeLayout) | 28
[AndroidViewAnimations](https://github.com/daimajia/AndroidViewAnimations) | 32
[AndroidImageSlide](https://github.com/daimajia/AndroidImageSlider) | 84
[NumberProgressBar](https://github.com/daimajia/NumberProgressBar) | 91

## 感谢

感谢所有为开源而辛辛苦苦付出努力的人, 相信有你们 Android 会发展的更加美好, 让我们一起为他们辛辛苦苦付出的努力鼓掌吧!!
