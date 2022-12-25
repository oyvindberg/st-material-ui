package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.tabsUnstyledTabsUnstyledDottypesMod.TabsUnstyledDirection
import com.olvind.mui.muiBase.tabsUnstyledTabsUnstyledDottypesMod.TabsUnstyledOrientation
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/base.@mui/base/TabsUnstyled.TabsUnstyledOwnProps, 'slots' | 'slotProps'> */
trait OmitTabsUnstyledOwnPropsslotsslotProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | false] = js.undefined
  
  var direction: js.UndefOr[TabsUnstyledDirection] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[Element], /* value */ Double | String | Boolean, Unit]
  ] = js.undefined
  
  var orientation: js.UndefOr[TabsUnstyledOrientation] = js.undefined
  
  var selectionFollowsFocus: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String | Double | false] = js.undefined
}
object OmitTabsUnstyledOwnPropsslotsslotProps {
  
  inline def apply(): OmitTabsUnstyledOwnPropsslotsslotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTabsUnstyledOwnPropsslotsslotProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTabsUnstyledOwnPropsslotsslotProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultValue(value: String | Double | false): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDirection(value: TabsUnstyledDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setOnChange(value: (/* event */ ReactEventFrom[Element], /* value */ Double | String | Boolean) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ Double | String | Boolean) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: TabsUnstyledOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
    inline def setValue(value: String | Double | false): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
