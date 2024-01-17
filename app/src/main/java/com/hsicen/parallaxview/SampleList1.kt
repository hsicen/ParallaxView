package com.hsicen.parallaxviewimport android.content.Intentimport android.os.Bundleimport android.view.ViewGroupimport android.widget.ImageViewimport androidx.activity.ComponentActivityimport androidx.activity.enableEdgeToEdgeimport androidx.appcompat.app.AppCompatActivityimport androidx.core.view.ViewCompatimport androidx.core.view.WindowInsetsCompatimport androidx.recyclerview.widget.LinearLayoutManagerimport androidx.recyclerview.widget.RecyclerViewimport com.bumptech.glide.Glideimport com.google.android.material.imageview.ShapeableImageViewimport com.google.android.material.shape.ShapeAppearanceModelclass SampleList1 : AppCompatActivity() {  companion object {    fun start(act: ComponentActivity) {      act.startActivity(Intent(act, SampleList1::class.java))    }  }  private val mRv by lazy {    RecyclerView(this).apply {      clipChildren = false      clipToPadding = false      layoutManager = LinearLayoutManager(this@SampleList1, RecyclerView.VERTICAL, false)      adapter = mAdapter      itemAnimator = null      setHasFixedSize(true)    }  }  private val mAdapter by lazy {    object : RecyclerView.Adapter<SampleViewHolder>() {      override fun getItemCount() = 80      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {        return SampleViewHolder(ShapeableImageView(parent.context).apply {          layoutParams = ViewGroup.MarginLayoutParams(            ViewGroup.LayoutParams.MATCH_PARENT,            400          ).apply {            leftMargin = 40            rightMargin = 40            bottomMargin = 60          }          shapeAppearanceModel = ShapeAppearanceModel().withCornerSize(15f)          scaleType = ImageView.ScaleType.CENTER_CROP        })      }      override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {        Glide.with(holder.root)          .load("https://scpic.chinaz.net/files/pic/pic9/202003/zzpic23859.jpg")          .into(holder.root)      }    }  }  override fun onCreate(savedInstanceState: Bundle?) {    super.onCreate(savedInstanceState)    enableEdgeToEdge()    setContentView(      mRv, ViewGroup.LayoutParams(        ViewGroup.LayoutParams.MATCH_PARENT,        ViewGroup.LayoutParams.MATCH_PARENT      )    )    ViewCompat.setOnApplyWindowInsetsListener(mRv) { v, insets ->      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)      insets    }  }  class SampleViewHolder(val root: ImageView) : RecyclerView.ViewHolder(root)}