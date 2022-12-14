package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var color: js.UndefOr[ColorPaletteProp | "inherit"] = js.undefined
}
object `60` {
  
  inline def apply(): `60` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `60`] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorPaletteProp | "inherit"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
