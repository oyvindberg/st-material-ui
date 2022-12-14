package com.olvind.mui.muiJoy.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiJoy.anon.ColorSchemes
import com.olvind.mui.muiJoy.anon.PropsWithChildrenPartialCssVarsProviderC
import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.DefaultColorScheme
import com.olvind.mui.muiSystem.anon.Dark
import com.olvind.mui.muiSystem.cssVarsUseCurrentColorSchemeMod.Mode
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Window
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CssVarsProvider {
  
  @JSImport("@mui/joy/styles", "CssVarsProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def attribute(value: String): this.type = set("attribute", value.asInstanceOf[js.Any])
    
    inline def colorSchemeNode(value: Element): this.type = set("colorSchemeNode", value.asInstanceOf[js.Any])
    
    inline def colorSchemeNodeNull: this.type = set("colorSchemeNode", null)
    
    inline def colorSchemeSelector(value: String): this.type = set("colorSchemeSelector", value.asInstanceOf[js.Any])
    
    inline def colorSchemeStorageKey(value: String): this.type = set("colorSchemeStorageKey", value.asInstanceOf[js.Any])
    
    inline def defaultColorScheme(value: DefaultColorScheme | Dark[DefaultColorScheme]): this.type = set("defaultColorScheme", value.asInstanceOf[js.Any])
    
    inline def defaultMode(value: Mode): this.type = set("defaultMode", value.asInstanceOf[js.Any])
    
    inline def disableNestedContext(value: Boolean): this.type = set("disableNestedContext", value.asInstanceOf[js.Any])
    
    inline def disableStyleSheetGeneration(value: Boolean): this.type = set("disableStyleSheetGeneration", value.asInstanceOf[js.Any])
    
    inline def disableTransitionOnChange(value: Boolean): this.type = set("disableTransitionOnChange", value.asInstanceOf[js.Any])
    
    inline def documentNode(value: Document): this.type = set("documentNode", value.asInstanceOf[js.Any])
    
    inline def documentNodeNull: this.type = set("documentNode", null)
    
    inline def modeStorageKey(value: String): this.type = set("modeStorageKey", value.asInstanceOf[js.Any])
    
    inline def storageWindow(value: Window): this.type = set("storageWindow", value.asInstanceOf[js.Any])
    
    inline def storageWindowNull: this.type = set("storageWindow", null)
    
    inline def theme(value: ColorSchemes): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  type Props = PropsWithChildrenPartialCssVarsProviderC
  
  implicit def make(companion: CssVarsProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[PropsWithChildrenPartialCssVarsProviderC, Builder] = new com.olvind.mui.StyledComponent.Builder[PropsWithChildrenPartialCssVarsProviderC, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: PropsWithChildrenPartialCssVarsProviderC): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
