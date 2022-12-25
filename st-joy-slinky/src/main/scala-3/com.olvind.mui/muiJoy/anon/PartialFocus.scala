package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/styles/types/focus.Focus> */
trait PartialFocus extends StObject {
  
  var default: js.UndefOr[CSSObject] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var thickness: js.UndefOr[String] = js.undefined
}
object PartialFocus {
  
  inline def apply(): PartialFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFocus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFocus] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: CSSObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setThickness(value: String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
