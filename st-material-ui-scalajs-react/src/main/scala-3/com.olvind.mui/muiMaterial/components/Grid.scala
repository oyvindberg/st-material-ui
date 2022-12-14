package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.`26`
import com.olvind.mui.muiMaterial.gridGridMod.GridTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.DefaultComponentProps
import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("@mui/material", "Grid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: Partial[ClassNameMap[scala.Nothing]]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ (DefaultComponentProps[GridTypeMap[js.Object, "div"]]) & `26`): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
