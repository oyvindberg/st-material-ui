package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'button', {}, @mui/joy.@mui/joy/Button/ButtonProps.ButtonOwnerState>,   startDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Button/ButtonProps.ButtonOwnerState>,   endDecorator :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Button/ButtonProps.ButtonOwnerState>,   loadingIndicatorCenter :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/Button/ButtonProps.ButtonOwnerState>} ]:? react.react.ElementType<any>} */
trait LoadingIndicatorCenter extends StObject {
  
  var endDecorator: js.UndefOr[ReactElement] = js.undefined
  
  var loadingIndicatorCenter: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
  
  var startDecorator: js.UndefOr[ReactElement] = js.undefined
}
object LoadingIndicatorCenter {
  
  inline def apply(): LoadingIndicatorCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingIndicatorCenter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingIndicatorCenter] (val x: Self) extends AnyVal {
    
    inline def setEndDecorator(value: ReactElement): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
    
    inline def setEndDecoratorUndefined: Self = StObject.set(x, "endDecorator", js.undefined)
    
    inline def setLoadingIndicatorCenter(value: ReactElement): Self = StObject.set(x, "loadingIndicatorCenter", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorCenterUndefined: Self = StObject.set(x, "loadingIndicatorCenter", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStartDecorator(value: ReactElement): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
    
    inline def setStartDecoratorUndefined: Self = StObject.set(x, "startDecorator", js.undefined)
  }
}
