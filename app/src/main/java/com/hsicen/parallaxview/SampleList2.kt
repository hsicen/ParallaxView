package com.hsicen.parallaxviewimport android.content.Intentimport android.graphics.Colorimport android.os.Bundleimport android.view.ViewGroupimport android.widget.ImageViewimport androidx.activity.ComponentActivityimport androidx.activity.enableEdgeToEdgeimport androidx.appcompat.app.AppCompatActivityimport androidx.compose.ui.unit.dpimport com.bumptech.glide.Glideimport com.google.android.material.imageview.ShapeableImageViewimport com.google.android.material.shape.ShapeAppearanceModelclass SampleList2 : AppCompatActivity() {  companion object {    fun start(act: ComponentActivity) {      act.startActivity(Intent(act, SampleList2::class.java))    }  }  private val mParallaxView by lazy {    ParallaxView(this).apply {      setBackgroundColor(Color.GRAY)    }  }  override fun onCreate(savedInstanceState: Bundle?) {    super.onCreate(savedInstanceState)    enableEdgeToEdge()    setContentView(      mParallaxView, ViewGroup.MarginLayoutParams(        ViewGroup.LayoutParams.MATCH_PARENT,        ViewGroup.LayoutParams.WRAP_CONTENT      ).apply {        topMargin = 120.dp.value.toInt()      }    )    mParallaxView.addConfig(      ParallaxView.ParallaxViewConfig(        0.dp.value.toInt(),        120.dp.value.toInt(),        object : ParallaxView.ParallaxViewAdapter {          override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParallaxView.ParallaxViewHolder {            return ParallaxView.ParallaxViewHolder(              ShapeableImageView(parent.context).apply {                val w = 240.dp.value.toInt()                val h = 300.dp.value.toInt()                val radius = 15.dp.value                layoutParams = ViewGroup.MarginLayoutParams(w, h)                shapeAppearanceModel = ShapeAppearanceModel()                  .withCornerSize(radius)                scaleType = ImageView.ScaleType.CENTER_CROP              })          }          override fun onBindViewHolder(holder: ParallaxView.ParallaxViewHolder, position: Int, data: ParallaxView.ParallaxData) {            Glide.with(holder.root)              .load(data.img)              .into(holder.root as ImageView)          }        })    ).updateData(ArrayList<ParallaxView.ParallaxData>().apply {      repeat(10) {        add(ParallaxView.ParallaxData("https://scpic.chinaz.net/files/pic/pic9/202003/zzpic23859.jpg"))        add(ParallaxView.ParallaxData("https://statics.dujiabieshu.com/uploads/view/large/l_1534847563.jpg"))        add(ParallaxView.ParallaxData("https://pic1.zhimg.com/v2-c68d85c83d0b4b2da2a15578a0562b40_r.jpg?source=1940ef5c"))        add(ParallaxView.ParallaxData("https://img.zcool.cn/community/013b6a585135f6a801219c77c05175.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxView.ParallaxData("https://img.zcool.cn/community/01abbd58513648a8012060c8c1246d.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxView.ParallaxData("https://img.zcool.cn/community/01c13b5d8dcb25a801211d53de9a58.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxView.ParallaxData("https://img.zcool.cn/community/01c53f585136dea801219c771dda1c.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxView.ParallaxData("https://e0.ifengimg.com/08/2019/0217/9982F76F3C61D12C7B9A525B4224669ADA4BA1E5_size1867_w3944_h2195.jpeg"))        add(ParallaxView.ParallaxData("https://img1.qunarzz.com/travel/d4/1512/4d/c3358d929ace2af7.jpg_r_1360x1360x95_5e8a0e7c.jpg"))      }    })  }}