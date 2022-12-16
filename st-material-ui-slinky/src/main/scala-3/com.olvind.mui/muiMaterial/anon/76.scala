package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  /**
    * Props applied to the Typography wrapper of the passed label.
    * This is unused if disableTypography is true.
    * @default {}
    */
  var typography: js.UndefOr[TypographyPropsspanAbout] = js.undefined
}
object `76` {
  
  inline def apply(): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `76`] (val x: Self) extends AnyVal {
    
    inline def setTypography(value: TypographyPropsspanAbout): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
  }
}
