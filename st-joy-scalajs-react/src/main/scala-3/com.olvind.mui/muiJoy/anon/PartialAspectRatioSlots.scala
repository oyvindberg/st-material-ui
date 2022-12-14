package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/AspectRatio/AspectRatioProps.AspectRatioSlots> */
trait PartialAspectRatioSlots extends StObject {
  
  var content: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object PartialAspectRatioSlots {
  
  inline def apply(): PartialAspectRatioSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAspectRatioSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAspectRatioSlots] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ElementType): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
