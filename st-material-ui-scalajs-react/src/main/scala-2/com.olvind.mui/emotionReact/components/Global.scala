package com.olvind.mui.emotionReact.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.emotionReact.emotionReactMod.GlobalProps
import com.olvind.mui.emotionReact.emotionReactMod.Theme
import com.olvind.mui.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Global {
  
  @JSImport("@emotion/react", "Global")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[js.Object] {
    
    @scala.inline
    def styles(value: Interpolation[Theme]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesNull: this.type = set("styles", null)
  }
  
  implicit def make(companion: Global.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GlobalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
