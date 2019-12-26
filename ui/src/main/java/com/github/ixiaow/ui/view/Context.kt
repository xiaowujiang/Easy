package com.github.ixiaow.ui.view

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.support.annotation.ColorRes
import android.support.annotation.DimenRes
import android.support.annotation.LayoutRes
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * 解析资源布局
 */
fun Context.inflater(
    @LayoutRes id: Int, parent: ViewGroup? = null,
    attachToRoot: Boolean = parent != null
): View {
    return LayoutInflater.from(this).inflate(id, parent, attachToRoot)
}

/**
 * 根据颜色资源[id] 获取颜色值
 */
fun Context.color(@ColorRes id: Int): Int = ContextCompat.getColor(this, id)

/**
 * 获取sp的值
 */
fun Context.sp(@DimenRes id: Int): Float = resources.sp(id)

/**
 * 获取dp的值
 */
fun Context.dp(@DimenRes id: Int): Int = resources.dp(id)


/**
 * 自定义布局解析相关属性
 */
@SuppressLint("Recycle")
inline fun Context.withStyledAttributes(
    attributeSet: AttributeSet?,
    attr: IntArray,
    block: TypedArray.() -> Unit
) {
    obtainStyledAttributes(attributeSet, attr).apply(block).recycle()
}