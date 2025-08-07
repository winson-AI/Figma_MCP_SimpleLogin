@file:OptIn(InternalResourceApi::class)

package simplelogin.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/simplelogin.composeapp.generated.resources/"

internal val Res.drawable.apple_icon: DrawableResource by lazy {
      DrawableResource("drawable:apple_icon", setOf(
        ResourceItem(setOf(), "${MD}drawable/apple_icon.xml", -1, -1),
      ))
    }

internal val Res.drawable.battery_icon: DrawableResource by lazy {
      DrawableResource("drawable:battery_icon", setOf(
        ResourceItem(setOf(), "${MD}drawable/battery_icon.xml", -1, -1),
      ))
    }

internal val Res.drawable.cellular_icon: DrawableResource by lazy {
      DrawableResource("drawable:cellular_icon", setOf(
        ResourceItem(setOf(), "${MD}drawable/cellular_icon.xml", -1, -1),
      ))
    }

internal val Res.drawable.facebook_icon: DrawableResource by lazy {
      DrawableResource("drawable:facebook_icon", setOf(
        ResourceItem(setOf(), "${MD}drawable/facebook_icon.xml", -1, -1),
      ))
    }

internal val Res.drawable.google_icon: DrawableResource by lazy {
      DrawableResource("drawable:google_icon", setOf(
        ResourceItem(setOf(), "${MD}drawable/google_icon.xml", -1, -1),
      ))
    }

internal val Res.drawable.wifi_icon: DrawableResource by lazy {
      DrawableResource("drawable:wifi_icon", setOf(
        ResourceItem(setOf(), "${MD}drawable/wifi_icon.xml", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("apple_icon", Res.drawable.apple_icon)
  map.put("battery_icon", Res.drawable.battery_icon)
  map.put("cellular_icon", Res.drawable.cellular_icon)
  map.put("facebook_icon", Res.drawable.facebook_icon)
  map.put("google_icon", Res.drawable.google_icon)
  map.put("wifi_icon", Res.drawable.wifi_icon)
}
