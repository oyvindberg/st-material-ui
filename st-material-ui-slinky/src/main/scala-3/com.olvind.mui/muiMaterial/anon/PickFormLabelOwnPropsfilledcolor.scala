package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@mui/material.@mui/material/FormLabel/FormLabel.FormLabelOwnProps, 'filled' | 'color'> */
trait PickFormLabelOwnPropsfilledcolor extends StObject {
  
  var color: js.UndefOr["primary" | "secondary" | "error" | "info" | "success" | "warning"] = js.undefined
  
  var filled: js.UndefOr[Boolean] = js.undefined
}
object PickFormLabelOwnPropsfilledcolor {
  
  inline def apply(): PickFormLabelOwnPropsfilledcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickFormLabelOwnPropsfilledcolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickFormLabelOwnPropsfilledcolor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: "primary" | "secondary" | "error" | "info" | "success" | "warning"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
  }
}
