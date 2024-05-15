### 简介

ParallaxView 是一个双列循环滑动的数据列表，支持手动滑动和自定滚动，列表内容有开发者自定义，使用方法与 RecyclerView 一致。

### 使用

```kotlin
// 1. 初始化相关配置参数
ParallaxView.addConfig(
    var offsetFirst: Int = 0, // 第一个列表初始化偏移距离
    var offsetSecond: Int = 0, // 第二个列表初始化偏移距离
    var itemMargin: Int = 0, // 列表Item的间距
    var autoLoop: Boolean = true, // 是否自动滚动
    var direction: ParallaxDirection = ParallaxDirection.Forward, //第一个列表的滚动方向
    var reverse: Boolean = true, // 第二个列表的滚动方向是否与第一个列表相反
    var parallaxAdapter: ParallaxViewAdapter //View创建和数据绑定
).build()

// 2.设置数据
ParallaxView.updateData(xxx)

// 3.生命周期绑定
lifecycle.addObserver(ParallaxView)
lifecycle.removeObserver(ParallaxView)
```

### 效果
["视频效果"](./screenshot/Screen_recording_20240515_161829.mp4)
