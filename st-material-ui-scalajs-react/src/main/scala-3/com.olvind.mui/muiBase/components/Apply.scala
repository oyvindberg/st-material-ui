package com.olvind.mui.muiBase.components

import com.olvind.mui.muiBase.selectUnstyledSelectUnstyledDottypesMod.SelectUnstyledTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import com.olvind.mui.StyledComponent.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Apply {
  
  inline def apply[TValue /* <: js.Object */, Multiple /* <: Boolean */](): SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple](js.Array(this.component, __props.asInstanceOf[DefaultComponentProps[SelectUnstyledTypeMap[TValue, Multiple, js.Object, "button"]]]))
  }
  
  @JSImport("@mui/base/SelectUnstyled", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props[TValue /* <: js.Object */, Multiple /* <: Boolean */] = DefaultComponentProps[SelectUnstyledTypeMap[TValue, Multiple, js.Object, "button"]]
  
  implicit def make[TValue /* <: js.Object */, Multiple /* <: Boolean */](companion: Apply.type): SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple] = new SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple](js.Array(this.component, js.Dictionary.empty))()
  
  def styled[TValue /* <: js.Object */, Multiple /* <: Boolean */]: Builder[
    DefaultComponentProps[SelectUnstyledTypeMap[TValue, Multiple, js.Object, "button"]], 
    SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple]
  ] = new Builder[
    DefaultComponentProps[SelectUnstyledTypeMap[TValue, Multiple, js.Object, "button"]], 
    SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps[TValue /* <: js.Object */, Multiple /* <: Boolean */](p: DefaultComponentProps[SelectUnstyledTypeMap[TValue, Multiple, js.Object, "button"]]): SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple] = new SharedBuilder_DefaultComponentProps_1147930024[TValue, Multiple](js.Array(this.component, p.asInstanceOf[js.Any]))
}
