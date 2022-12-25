package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/AspectRatio/AspectRatioProps.AspectRatioOwnerState>,   content :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/AspectRatio/AspectRatioProps.AspectRatioOwnerState>} ]:? react.react.ElementType<any>} */
trait Content extends StObject {
  
  var content: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object Content {
  
  inline def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
