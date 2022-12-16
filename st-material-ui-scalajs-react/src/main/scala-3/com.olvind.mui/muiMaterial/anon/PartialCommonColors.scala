package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/createPalette.CommonColors> */
trait PartialCommonColors extends StObject {
  
  var black: js.UndefOr[String] = js.undefined
  
  var white: js.UndefOr[String] = js.undefined
}
object PartialCommonColors {
  
  inline def apply(): PartialCommonColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommonColors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCommonColors] (val x: Self) extends AnyVal {
    
    inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    inline def setBlackUndefined: Self = StObject.set(x, "black", js.undefined)
    
    inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    inline def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
  }
}
