package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesMod.ClassNameMap
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CssBaseline.CssBaselineProps> */
@js.native
trait PartialCssBaselineProps extends StObject {
  
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var classes: js.UndefOr[com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]] = js.native
  
  var enableColorScheme: js.UndefOr[Boolean] = js.native
}
object PartialCssBaselineProps {
  
  @scala.inline
  def apply(): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
  
  @scala.inline
  implicit class PartialCssBaselinePropsMutableBuilder[Self <: PartialCssBaselineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: com.olvind.mui.std.Partial[ClassNameMap[scala.Nothing]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setEnableColorScheme(value: Boolean): Self = StObject.set(x, "enableColorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableColorSchemeUndefined: Self = StObject.set(x, "enableColorScheme", js.undefined)
  }
}
