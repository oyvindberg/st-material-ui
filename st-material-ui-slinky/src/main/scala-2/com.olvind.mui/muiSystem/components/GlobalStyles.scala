package com.olvind.mui.muiSystem.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.muiStyledEngine.globalStylesGlobalStylesMod.GlobalStylesProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalStyles {
  
  @JSImport("@mui/system", "GlobalStyles")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def defaultTheme(value: js.Object): this.type = set("defaultTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: Interpolation[js.Object]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesNull: this.type = set("styles", null)
  }
  
  implicit def make(companion: GlobalStyles.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GlobalStylesProps[js.Object]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
