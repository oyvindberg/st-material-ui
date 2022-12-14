package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.SupportedColorScheme
import com.olvind.mui.muiSystem.cssVarsUseCurrentColorSchemeMod.Mode
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<Partial<CssVarsProviderConfig<SupportedColorScheme>> & {}> */
trait PropsWithChildrenPartialCssVarsProviderC extends StObject {
  
  var attribute: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  var colorSchemeNode: js.UndefOr[Element | Null] = js.undefined
  
  var colorSchemeSelector: js.UndefOr[String] = js.undefined
  
  var colorSchemeStorageKey: js.UndefOr[String] = js.undefined
  
  var defaultColorScheme: js.UndefOr[SupportedColorScheme | com.olvind.mui.muiSystem.anon.Dark[SupportedColorScheme]] = js.undefined
  
  var defaultMode: js.UndefOr[Mode] = js.undefined
  
  var disableNestedContext: js.UndefOr[Boolean] = js.undefined
  
  var disableStyleSheetGeneration: js.UndefOr[Boolean] = js.undefined
  
  var disableTransitionOnChange: js.UndefOr[Boolean] = js.undefined
  
  var documentNode: js.UndefOr[Document | Null] = js.undefined
  
  var modeStorageKey: js.UndefOr[String] = js.undefined
  
  var storageWindow: js.UndefOr[Window | Null] = js.undefined
  
  var theme: js.UndefOr[ColorSchemes] = js.undefined
}
object PropsWithChildrenPartialCssVarsProviderC {
  
  inline def apply(): PropsWithChildrenPartialCssVarsProviderC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithChildrenPartialCssVarsProviderC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsWithChildrenPartialCssVarsProviderC] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColorSchemeNode(value: Element): Self = StObject.set(x, "colorSchemeNode", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeNodeNull: Self = StObject.set(x, "colorSchemeNode", null)
    
    inline def setColorSchemeNodeUndefined: Self = StObject.set(x, "colorSchemeNode", js.undefined)
    
    inline def setColorSchemeSelector(value: String): Self = StObject.set(x, "colorSchemeSelector", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeSelectorUndefined: Self = StObject.set(x, "colorSchemeSelector", js.undefined)
    
    inline def setColorSchemeStorageKey(value: String): Self = StObject.set(x, "colorSchemeStorageKey", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeStorageKeyUndefined: Self = StObject.set(x, "colorSchemeStorageKey", js.undefined)
    
    inline def setDefaultColorScheme(value: SupportedColorScheme | com.olvind.mui.muiSystem.anon.Dark[SupportedColorScheme]): Self = StObject.set(x, "defaultColorScheme", value.asInstanceOf[js.Any])
    
    inline def setDefaultColorSchemeUndefined: Self = StObject.set(x, "defaultColorScheme", js.undefined)
    
    inline def setDefaultMode(value: Mode): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    inline def setDisableNestedContext(value: Boolean): Self = StObject.set(x, "disableNestedContext", value.asInstanceOf[js.Any])
    
    inline def setDisableNestedContextUndefined: Self = StObject.set(x, "disableNestedContext", js.undefined)
    
    inline def setDisableStyleSheetGeneration(value: Boolean): Self = StObject.set(x, "disableStyleSheetGeneration", value.asInstanceOf[js.Any])
    
    inline def setDisableStyleSheetGenerationUndefined: Self = StObject.set(x, "disableStyleSheetGeneration", js.undefined)
    
    inline def setDisableTransitionOnChange(value: Boolean): Self = StObject.set(x, "disableTransitionOnChange", value.asInstanceOf[js.Any])
    
    inline def setDisableTransitionOnChangeUndefined: Self = StObject.set(x, "disableTransitionOnChange", js.undefined)
    
    inline def setDocumentNode(value: Document): Self = StObject.set(x, "documentNode", value.asInstanceOf[js.Any])
    
    inline def setDocumentNodeNull: Self = StObject.set(x, "documentNode", null)
    
    inline def setDocumentNodeUndefined: Self = StObject.set(x, "documentNode", js.undefined)
    
    inline def setModeStorageKey(value: String): Self = StObject.set(x, "modeStorageKey", value.asInstanceOf[js.Any])
    
    inline def setModeStorageKeyUndefined: Self = StObject.set(x, "modeStorageKey", js.undefined)
    
    inline def setStorageWindow(value: Window): Self = StObject.set(x, "storageWindow", value.asInstanceOf[js.Any])
    
    inline def setStorageWindowNull: Self = StObject.set(x, "storageWindow", null)
    
    inline def setStorageWindowUndefined: Self = StObject.set(x, "storageWindow", js.undefined)
    
    inline def setTheme(value: ColorSchemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
