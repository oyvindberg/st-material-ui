package com.olvind.mui.muiSystem.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.muiStyledEngine.globalStylesGlobalStylesMod.GlobalStylesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalStyles {
  
  inline def apply[Theme](): Builder[Theme] = {
    val __props = js.Dynamic.literal()
    new Builder[Theme](js.Array(this.component, __props.asInstanceOf[GlobalStylesProps[Theme]]))
  }
  
  @JSImport("@mui/system", "GlobalStyles")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Theme] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultTheme(value: js.Object): this.type = set("defaultTheme", value.asInstanceOf[js.Any])
    
    inline def styles(value: Interpolation[Theme]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesNull: this.type = set("styles", null)
  }
  
  implicit def make[Theme](companion: GlobalStyles.type): Builder[Theme] = new Builder[Theme](js.Array(this.component, js.Dictionary.empty))()
  
  def styled[Theme]: com.olvind.mui.StyledComponent.Builder[GlobalStylesProps[Theme], Builder[Theme]] = new com.olvind.mui.StyledComponent.Builder[GlobalStylesProps[Theme], Builder[Theme]](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder[Theme](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps[Theme](p: GlobalStylesProps[Theme]): Builder[Theme] = new Builder[Theme](js.Array(this.component, p.asInstanceOf[js.Any]))
}
