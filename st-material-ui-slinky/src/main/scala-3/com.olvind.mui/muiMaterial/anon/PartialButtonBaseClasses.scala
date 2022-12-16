package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ButtonBase/buttonBaseClasses.ButtonBaseClasses> */
trait PartialButtonBaseClasses extends StObject {
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var focusVisible: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialButtonBaseClasses {
  
  inline def apply(): PartialButtonBaseClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonBaseClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialButtonBaseClasses] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
