package com.olvind.mui.muiBase.components

import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectUnstyled {
  
  inline def apply[TValue /* <: js.Object */](): SharedBuilder_DefaultComponentProps1544830250[TValue] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_DefaultComponentProps1544830250[TValue](js.Array(this.component, __props.asInstanceOf[DefaultComponentProps[SelectUnstyledTypeMap[TValue, js.Object, "button"]]]))
  }
  
  @JSImport("@mui/base", "SelectUnstyled")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[TValue /* <: js.Object */](companion: SelectUnstyled.type): SharedBuilder_DefaultComponentProps1544830250[TValue] = new SharedBuilder_DefaultComponentProps1544830250[TValue](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[TValue /* <: js.Object */](p: DefaultComponentProps[SelectUnstyledTypeMap[TValue, js.Object, "button"]]): SharedBuilder_DefaultComponentProps1544830250[TValue] = new SharedBuilder_DefaultComponentProps1544830250[TValue](js.Array(this.component, p.asInstanceOf[js.Any]))
}
