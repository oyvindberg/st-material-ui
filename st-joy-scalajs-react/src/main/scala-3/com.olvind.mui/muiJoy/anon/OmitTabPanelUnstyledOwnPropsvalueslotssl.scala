package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/base.@mui/base/TabPanelUnstyled.TabPanelUnstyledOwnProps, 'value' | 'slots' | 'slotProps'> */
trait OmitTabPanelUnstyledOwnPropsvalueslotssl extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
}
object OmitTabPanelUnstyledOwnPropsvalueslotssl {
  
  inline def apply(): OmitTabPanelUnstyledOwnPropsvalueslotssl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTabPanelUnstyledOwnPropsvalueslotssl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTabPanelUnstyledOwnPropsvalueslotssl] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}