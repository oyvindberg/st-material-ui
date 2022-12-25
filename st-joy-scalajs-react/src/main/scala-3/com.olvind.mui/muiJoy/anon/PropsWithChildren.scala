package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesExtendThemeMod.CssVarsThemeOptions
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{  theme :@mui/joy.@mui/joy/styles/extendTheme.CssVarsThemeOptions | undefined}> */
trait PropsWithChildren extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var theme: js.UndefOr[CssVarsThemeOptions] = js.undefined
}
object PropsWithChildren {
  
  inline def apply(): PropsWithChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsWithChildren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTheme(value: CssVarsThemeOptions): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
