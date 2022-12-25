package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentFocusVisible extends StObject {
  
  var component: js.UndefOr[ReactElement] = js.undefined
  
  var focusVisible: js.UndefOr[Boolean] = js.undefined
}
object ComponentFocusVisible {
  
  inline def apply(): ComponentFocusVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentFocusVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentFocusVisible] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
  }
}
