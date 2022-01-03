package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.cssBaselineCssBaselineMod.CssBaselineProps
import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import com.olvind.mui.std.Partial
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CssBaseline {
  
  @JSImport("@mui/material", "CssBaseline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def classes(value: Partial[ClassNameMap[scala.Nothing]]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableColorScheme(value: Boolean): this.type = set("enableColorScheme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CssBaseline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CssBaselineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
