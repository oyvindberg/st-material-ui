package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'nav', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   ol :@mui/joy.@mui/joy/utils/types.SlotProps<'ol', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   li :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>,   separator :@mui/joy.@mui/joy/utils/types.SlotProps<'li', {}, @mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsOwnerState>} ]:? react.react.ElementType<any>} */
trait Li extends StObject {
  
  var li: js.UndefOr[ElementType] = js.undefined
  
  var ol: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var separator: js.UndefOr[ElementType] = js.undefined
}
object Li {
  
  inline def apply(): Li = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Li]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Li] (val x: Self) extends AnyVal {
    
    inline def setLi(value: ElementType): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
    
    inline def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
    
    inline def setOl(value: ElementType): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
    
    inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSeparator(value: ElementType): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
