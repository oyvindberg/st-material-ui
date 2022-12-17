package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.cssBaselineCssBaselineMod.CssBaselineProps
import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import com.olvind.mui.std.Partial
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CssBaseline {
  
  @JSImport("@mui/material", "CssBaseline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def classes(value: Partial[ClassNameMap[scala.Nothing]]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def enableColorScheme(value: Boolean): this.type = set("enableColorScheme", value.asInstanceOf[js.Any])
  }
  
  type Props = CssBaselineProps
  
  implicit def make(companion: CssBaseline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[CssBaselineProps, Builder] = new com.olvind.mui.StyledComponent.Builder[CssBaselineProps, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: CssBaselineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
