package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/base.@mui/base/TabPanelUnstyled.TabPanelUnstyledOwnProps, 'value' | 'slots' | 'slotProps'> */
trait OmitTabPanelUnstyledOwnPropsvalueslotssl extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
}
object OmitTabPanelUnstyledOwnPropsvalueslotssl {
  
  inline def apply(): OmitTabPanelUnstyledOwnPropsvalueslotssl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTabPanelUnstyledOwnPropsvalueslotssl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTabPanelUnstyledOwnPropsvalueslotssl] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
