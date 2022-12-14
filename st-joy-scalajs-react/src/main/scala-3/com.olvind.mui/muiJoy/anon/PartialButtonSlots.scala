package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Button/ButtonProps.ButtonSlots> */
trait PartialButtonSlots extends StObject {
  
  var endDecorator: js.UndefOr[ElementType] = js.undefined
  
  var loadingIndicatorCenter: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var startDecorator: js.UndefOr[ElementType] = js.undefined
}
object PartialButtonSlots {
  
  inline def apply(): PartialButtonSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialButtonSlots] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: ElementType): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setLoadingIndicatorCenter(value: ElementType): Self = StObject.set(x, "loadingIndicatorCenter", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorCenterUndefined: Self = StObject.set(x, "loadingIndicatorCenter", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: ElementType): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
