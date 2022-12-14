package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Breadcrumbs/BreadcrumbsProps.BreadcrumbsSlots> */
trait PartialBreadcrumbsSlots extends StObject {
  
  var li: js.UndefOr[ElementType] = js.undefined
  
  var ol: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
  
  var separator: js.UndefOr[ElementType] = js.undefined
}
object PartialBreadcrumbsSlots {
  
  inline def apply(): PartialBreadcrumbsSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBreadcrumbsSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialBreadcrumbsSlots] (val x: Self) extends AnyVal {
    
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
