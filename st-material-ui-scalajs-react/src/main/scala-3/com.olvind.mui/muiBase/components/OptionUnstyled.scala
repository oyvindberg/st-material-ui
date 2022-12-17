package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.optionUnstyledOptionUnstyledDottypesMod.OptionUnstyledTypeMap
import com.olvind.mui.muiTypes.mod.DefaultComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionUnstyled {
  
  inline def apply[TValue](): Builder[TValue] = {
    val __props = js.Dynamic.literal()
    new Builder[TValue](js.Array(this.component, __props.asInstanceOf[DefaultComponentProps[OptionUnstyledTypeMap[TValue, js.Object, "li"]]]))
  }
  
  @JSImport("@mui/base", "OptionUnstyled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TValue] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  type Props[TValue] = DefaultComponentProps[OptionUnstyledTypeMap[TValue, js.Object, "li"]]
  
  implicit def make[TValue](companion: OptionUnstyled.type): Builder[TValue] = new Builder[TValue](js.Array(this.component, js.Dictionary.empty))()
  
  def styled[TValue]: com.olvind.mui.StyledComponent.Builder[
    DefaultComponentProps[OptionUnstyledTypeMap[TValue, js.Object, "li"]], 
    Builder[TValue]
  ] = new com.olvind.mui.StyledComponent.Builder[
    DefaultComponentProps[OptionUnstyledTypeMap[TValue, js.Object, "li"]], 
    Builder[TValue]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder[TValue](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps[TValue](p: DefaultComponentProps[OptionUnstyledTypeMap[TValue, js.Object, "li"]]): Builder[TValue] = new Builder[TValue](js.Array(this.component, p.asInstanceOf[js.Any]))
}
