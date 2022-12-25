package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.tabsUnstyledTabsUnstyledDottypesMod.TabsUnstyledDirection
import com.olvind.mui.muiBase.tabsUnstyledTabsUnstyledDottypesMod.TabsUnstyledOrientation
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/base.@mui/base/TabsUnstyled.TabsUnstyledOwnProps, 'slots' | 'slotProps'> */
trait OmitTabsUnstyledOwnPropsslotsslotProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[String | Double | false] = js.undefined
  
  var direction: js.UndefOr[TabsUnstyledDirection] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[Event, Element], 
      /* value */ Double | String | Boolean, 
      Unit
    ]
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
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultValue(value: String | Double | false): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDirection(value: TabsUnstyledDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setOnChange(value: (/* event */ SyntheticEvent[Event, Element], /* value */ Double | String | Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: TabsUnstyledOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
    inline def setValue(value: String | Double | false): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
