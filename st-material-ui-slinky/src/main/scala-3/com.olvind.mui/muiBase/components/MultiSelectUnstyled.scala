package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.multiSelectUnstyledMultiSelectUnstyledDottypesMod.MultiSelectUnstyledTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiSelectUnstyled {
  
  inline def apply[TValue /* <: js.Object */](): Builder[TValue] = {
    val __props = js.Dynamic.literal()
    new Builder[TValue](js.Array(this.component, __props.asInstanceOf[DefaultComponentProps[MultiSelectUnstyledTypeMap[TValue, js.Object, "button"]]]))
  }
  
  @JSImport("@mui/base", "MultiSelectUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TValue /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  type Props[TValue /* <: js.Object */] = DefaultComponentProps[MultiSelectUnstyledTypeMap[TValue, js.Object, "button"]]
  
  implicit def make[TValue /* <: js.Object */](companion: MultiSelectUnstyled.type): Builder[TValue] = new Builder[TValue](js.Array(this.component, js.Dictionary.empty))()
  
  def styled[TValue /* <: js.Object */]: com.olvind.mui.StyledComponent.Builder[
    DefaultComponentProps[MultiSelectUnstyledTypeMap[TValue, js.Object, "button"]], 
    Builder[TValue]
  ] = new com.olvind.mui.StyledComponent.Builder[
    DefaultComponentProps[MultiSelectUnstyledTypeMap[TValue, js.Object, "button"]], 
    Builder[TValue]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder[TValue](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps[TValue /* <: js.Object */](p: DefaultComponentProps[MultiSelectUnstyledTypeMap[TValue, js.Object, "button"]]): Builder[TValue] = new Builder[TValue](js.Array(this.component, p.asInstanceOf[js.Any]))
}
