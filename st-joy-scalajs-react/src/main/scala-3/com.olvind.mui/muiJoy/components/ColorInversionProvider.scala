package com.olvind.mui.muiJoy.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiJoy.stylesColorInversionMod.ColorInversionProviderProps
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorInversionProvider {
  
  @JSImport("@mui/joy/styles", "ColorInversionProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def variant(value: VariantProp): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  type Props = ColorInversionProviderProps
  
  implicit def make(companion: ColorInversionProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[ColorInversionProviderProps, Builder] = new com.olvind.mui.StyledComponent.Builder[ColorInversionProviderProps, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: ColorInversionProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
