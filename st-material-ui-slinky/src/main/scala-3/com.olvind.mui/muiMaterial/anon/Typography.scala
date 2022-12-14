package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typography extends StObject {
  
  /**
    * Props applied to the Typography wrapper of the passed label.
    * This is unused if disableTypography is true.
    * @default {}
    */
  var typography: js.UndefOr[TypographyPropsTypographyTypeMapspandefa] = js.undefined
}
object Typography {
  
  inline def apply(): Typography = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Typography]
  }
  
  extension [Self <: Typography](x: Self) {
    
    inline def setTypography(value: TypographyPropsTypographyTypeMapspandefa): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
  }
}
