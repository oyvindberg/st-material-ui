package com.olvind.mui.muiSystem.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.muiSystem.unstableGridGridPropsMod.GridTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableGrid {
  
  @JSImport("@mui/system", "UnstableGrid")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: UnstableGrid.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DefaultComponentProps[GridTypeMap[js.Object, "div"]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
