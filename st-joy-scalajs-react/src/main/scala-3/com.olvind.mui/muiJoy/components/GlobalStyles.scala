package com.olvind.mui.muiJoy.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiStyledEngine.globalStylesGlobalStylesMod.GlobalStylesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalStyles {
  
  inline def apply(styles: Interpolation[Theme]): Builder = {
    val __props = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GlobalStylesProps[Theme]]))
  }
  
  @JSImport("@mui/joy", "GlobalStyles")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultTheme(value: js.Object): this.type = set("defaultTheme", value.asInstanceOf[js.Any])
  }
  
  type Props = GlobalStylesProps[Theme]
  
  def styled: com.olvind.mui.StyledComponent.Builder[GlobalStylesProps[Theme], Builder] = new com.olvind.mui.StyledComponent.Builder[GlobalStylesProps[Theme], Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: GlobalStylesProps[Theme]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
