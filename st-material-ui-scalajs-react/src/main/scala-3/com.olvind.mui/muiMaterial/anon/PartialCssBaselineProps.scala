package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CssBaseline.CssBaselineProps> */
trait PartialCssBaselineProps extends StObject {
  
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  var classes: js.UndefOr[com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]] = js.undefined
  
  var enableColorScheme: js.UndefOr[Boolean] = js.undefined
}
object PartialCssBaselineProps {
  
  inline def apply(): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
  
  extension [Self <: PartialCssBaselineProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClasses(value: com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setEnableColorScheme(value: Boolean): Self = StObject.set(x, "enableColorScheme", value.asInstanceOf[js.Any])
    
    inline def setEnableColorSchemeUndefined: Self = StObject.set(x, "enableColorScheme", js.undefined)
  }
}
