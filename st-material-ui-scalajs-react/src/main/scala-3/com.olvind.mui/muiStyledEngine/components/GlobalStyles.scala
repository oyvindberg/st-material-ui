package com.olvind.mui.muiStyledEngine.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.muiStyledEngine.globalStylesGlobalStylesMod.GlobalStylesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalStyles {
  
  @JSImport("@mui/styled-engine", "GlobalStyles")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultTheme(value: js.Object): this.type = set("defaultTheme", value.asInstanceOf[js.Any])
    
    inline def styles(value: Interpolation[js.Object]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesNull: this.type = set("styles", null)
  }
  
  implicit def make(companion: GlobalStyles.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GlobalStylesProps[js.Object]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
