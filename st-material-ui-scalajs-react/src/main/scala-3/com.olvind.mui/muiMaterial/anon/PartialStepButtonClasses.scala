package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/StepButton/stepButtonClasses.StepButtonClasses> */
trait PartialStepButtonClasses extends StObject {
  
  var horizontal: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var touchRipple: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[String] = js.undefined
}
object PartialStepButtonClasses {
  
  inline def apply(): PartialStepButtonClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStepButtonClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStepButtonClasses] (val x: Self) extends AnyVal {
    
    inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTouchRipple(value: String): Self = StObject.set(x, "touchRipple", value.asInstanceOf[js.Any])
    
    inline def setTouchRippleUndefined: Self = StObject.set(x, "touchRipple", js.undefined)
    
    inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
