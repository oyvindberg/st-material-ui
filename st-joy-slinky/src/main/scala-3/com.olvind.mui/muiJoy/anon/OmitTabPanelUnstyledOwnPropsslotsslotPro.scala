package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/base.@mui/base/TabPanelUnstyled.TabPanelUnstyledOwnProps, 'slots' | 'slotProps'> */
trait OmitTabPanelUnstyledOwnPropsslotsslotPro extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var value: Double | String
}
object OmitTabPanelUnstyledOwnPropsslotsslotPro {
  
  inline def apply(value: Double | String): OmitTabPanelUnstyledOwnPropsslotsslotPro = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTabPanelUnstyledOwnPropsslotsslotPro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTabPanelUnstyledOwnPropsslotsslotPro] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
