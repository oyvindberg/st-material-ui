package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.muiBase.inputUnstyledInputUnstyledDottypesMod.InputUnstyledTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @JSImport("@mui/base/InputUnstyled/InputUnstyled", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Component.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DefaultComponentProps[InputUnstyledTypeMap[js.Object, "div"]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
