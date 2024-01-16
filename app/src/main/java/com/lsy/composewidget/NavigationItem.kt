package com.lsy.composewidget

/**
 * Title :
 * Author: Lsy
 * Date: 2024/1/11 14:57
 * Version: 1
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
sealed class NavigationItem(
    var route: String,
    var icon: Int,
    var title: String,
    var messageCount: Int = 0
) {
    object Home : NavigationItem("home", R.mipmap.ic_home, "头条")
    object Movies : NavigationItem("movies", R.mipmap.ic_movie, "电影")
    object Books : NavigationItem("books", R.mipmap.ic_book, "书籍")
    object Profile : NavigationItem("profile", R.mipmap.ic_profile, "我的", messageCount = 10)
}

