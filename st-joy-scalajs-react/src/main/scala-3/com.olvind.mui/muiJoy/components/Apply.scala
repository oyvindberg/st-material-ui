package com.olvind.mui.muiJoy.components

import com.olvind.mui.muiJoy.selectSelectPropsMod.SelectTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import com.olvind.mui.StyledComponent.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Apply {
  
  inline def apply[TValue /* <: js.Object */](): SharedBuilder_DefaultComponentProps_767698552[TValue] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_DefaultComponentProps_767698552[TValue](js.Array(this.component, __props.asInstanceOf[DefaultComponentProps[SelectTypeMap[TValue, js.Object, "button"]]]))
  }
  
  @JSImport("@mui/joy/Select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props[TValue /* <: js.Object */] = DefaultComponentProps[SelectTypeMap[TValue, js.Object, "button"]]
  
  implicit def make[TValue /* <: js.Object */](companion: Apply.type): SharedBuilder_DefaultComponentProps_767698552[TValue] = new SharedBuilder_DefaultComponentProps_767698552[TValue](js.Array(this.component, js.Dictionary.empty))()
  
  def styled[TValue /* <: js.Object */]: Builder[
    DefaultComponentProps[SelectTypeMap[TValue, js.Object, "button"]], 
    SharedBuilder_DefaultComponentProps_767698552[TValue]
  ] = new Builder[
    DefaultComponentProps[SelectTypeMap[TValue, js.Object, "button"]], 
    SharedBuilder_DefaultComponentProps_767698552[TValue]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DefaultComponentProps_767698552[TValue](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps[TValue /* <: js.Object */](p: DefaultComponentProps[SelectTypeMap[TValue, js.Object, "button"]]): SharedBuilder_DefaultComponentProps_767698552[TValue] = new SharedBuilder_DefaultComponentProps_767698552[TValue](js.Array(this.component, p.asInstanceOf[js.Any]))
}
