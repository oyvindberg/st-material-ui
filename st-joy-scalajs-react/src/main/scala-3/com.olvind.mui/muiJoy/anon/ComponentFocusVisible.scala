package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentFocusVisible extends StObject {
  
  var component: js.UndefOr[ElementType] = js.undefined
  
  var focusVisible: js.UndefOr[Boolean] = js.undefined
}
object ComponentFocusVisible {
  
  inline def apply(): ComponentFocusVisible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentFocusVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentFocusVisible] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
  }
}
