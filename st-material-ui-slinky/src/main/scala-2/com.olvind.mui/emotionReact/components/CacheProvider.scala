package com.olvind.mui.emotionReact.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.emotionUtils.mod.EmotionCache
import com.olvind.mui.react.mod.ProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CacheProvider {
  
  @scala.inline
  def apply(value: EmotionCache): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[EmotionCache]]))
  }
  
  @JSImport("@emotion/react", "CacheProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[EmotionCache]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
