package com.hsicen.parallaxviewimport androidx.lifecycle.ViewModelclass SimpleViewModel : ViewModel() {  fun provideData() =    ArrayList<ParallaxData>().apply {      repeat(10) {        add(ParallaxData("https://scpic.chinaz.net/files/pic/pic9/202003/zzpic23859.jpg"))        add(ParallaxData("https://statics.dujiabieshu.com/uploads/view/large/l_1534847563.jpg"))        add(ParallaxData("https://pic1.zhimg.com/v2-c68d85c83d0b4b2da2a15578a0562b40_r.jpg?source=1940ef5c"))        add(ParallaxData("https://img.zcool.cn/community/013b6a585135f6a801219c77c05175.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxData("https://img.zcool.cn/community/01abbd58513648a8012060c8c1246d.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxData("https://img.zcool.cn/community/01c13b5d8dcb25a801211d53de9a58.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxData("https://img.zcool.cn/community/01c53f585136dea801219c771dda1c.jpg@1280w_1l_2o_100sh.jpg"))        add(ParallaxData("https://e0.ifengimg.com/08/2019/0217/9982F76F3C61D12C7B9A525B4224669ADA4BA1E5_size1867_w3944_h2195.jpeg"))        add(ParallaxData("https://img1.qunarzz.com/travel/d4/1512/4d/c3358d929ace2af7.jpg_r_1360x1360x95_5e8a0e7c.jpg"))      }    }}