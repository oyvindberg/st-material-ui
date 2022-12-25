package com.olvind.mui.muiJoy.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiJoy.anon.PropsWithChildren
import com.olvind.mui.muiJoy.stylesExtendThemeMod.CssVarsThemeOptions
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("@mui/joy/styles", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def theme(value: CssVarsThemeOptions): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  type Props = PropsWithChildren
  
  implicit def make(companion: ThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[PropsWithChildren, Builder] = new com.olvind.mui.StyledComponent.Builder[PropsWithChildren, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: PropsWithChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
