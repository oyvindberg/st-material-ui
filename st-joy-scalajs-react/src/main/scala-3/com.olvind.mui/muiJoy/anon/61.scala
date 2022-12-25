package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ColorPaletteProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var color: js.UndefOr[ColorPaletteProp | "inherit"] = js.undefined
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `61`] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorPaletteProp | "inherit"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
