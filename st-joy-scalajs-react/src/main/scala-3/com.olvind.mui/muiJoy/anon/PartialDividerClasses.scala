package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Divider/dividerClasses.DividerClasses> */
trait PartialDividerClasses extends StObject {
  
  var insetContext: js.UndefOr[String] = js.undefined
  
  var insetNone: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[String] = js.undefined
}
object PartialDividerClasses {
  
  inline def apply(): PartialDividerClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDividerClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialDividerClasses] (val x: Self) extends AnyVal {
    
    inline def setInsetContext(value: String): Self = StObject.set(x, "insetContext", value.asInstanceOf[js.Any])
    
    inline def setInsetContextUndefined: Self = StObject.set(x, "insetContext", js.undefined)
    
    inline def setInsetNone(value: String): Self = StObject.set(x, "insetNone", value.asInstanceOf[js.Any])
    
    inline def setInsetNoneUndefined: Self = StObject.set(x, "insetNone", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
